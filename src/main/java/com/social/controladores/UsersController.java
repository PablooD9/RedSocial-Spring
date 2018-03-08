package com.social.controladores;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.social.entidades.Usuario;
import com.social.servicios.UsuarioService;

@Controller
public class UsersController 
{
	@Autowired 
	private UsuarioService usersService;
	
	@RequestMapping("/users/lista-usuarios")
	public String getList(Model model, Pageable pageable, @RequestParam(value = "", required=false) String searchText)
	{	
		Page<Usuario> usuarios = new PageImpl<Usuario>(new LinkedList<Usuario>());
		
		if (searchText != null && !searchText.isEmpty()) 
		{
			usuarios = usersService
				.buscarUsuariosPorNombreOEmail(pageable, searchText);
			
		} else 
		{
			usuarios = usersService.getUsuarios(pageable);
		}
		model.addAttribute("usuarioActivo", usersService.getUsuarioActivo());
		model.addAttribute("userList", usuarios.getContent());
		model.addAttribute("page", usuarios);
		return "/users/lista-usuarios";
		
	}
	
	@RequestMapping("/users/perfil/{username}")
	public String getList(Model model,@PathVariable String username)
	{	
		model.addAttribute("usuario", usersService.getUserByUsername(username));
		model.addAttribute("usuarioActivo", usersService.getUsuarioActivo());
		return "/users/perfil";
		
	}
	
	@RequestMapping("/users/lista-amigos")
	public String getAmigos(Model model, Pageable pageable, @RequestParam(value = "", required=false) String searchText)
	{	
		Page<Usuario> usuarios = new PageImpl<Usuario>(new LinkedList<Usuario>());
		
		if (searchText != null && !searchText.isEmpty()) 
		{
			usuarios = usersService
				.buscarUsuariosPorNombreOEmail(pageable, searchText);
			
		} else 
		{
			usuarios = usersService.getUsuariosAmigos(pageable,usersService.getUsuarioActivo());
		}
		model.addAttribute("usuarioActivo", usersService.getUsuarioActivo());
		model.addAttribute("userList", usuarios.getContent());
		model.addAttribute("page", usuarios);
		return "/users/lista-amigos";
		
	}
}
