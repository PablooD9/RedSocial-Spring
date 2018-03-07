package com.social.servicios;

import java.util.Date;
import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.entidades.Comentario;
import com.social.entidades.Publicacion;
import com.social.entidades.Usuario;

@Service
public class InsertSampleDataService {

	@Autowired
	private UsuarioService usuariosService;

	@PostConstruct
	public void init() 
	{
		Usuario usuario1 = new Usuario("99999990A", "Pedro", "Díaz");
		usuario1.setPassword("123456");
		Usuario usuario2 = new Usuario("99999991B", "Lucas", "Núñez");
		usuario2.setPassword("123456");
		Usuario usuario3 = new Usuario("99999992C", "María", "Rodríguez");
		usuario3.setPassword("123456");
		Usuario usuario4 = new Usuario("99999993D", "Marta", "Almonte");
		usuario4.setPassword("123456");
		Usuario usuario5 = new Usuario("99999977E", "Pelayo", "Valdes");
		usuario5.setPassword("123456");
		Usuario usuario6 = new Usuario("99999988F", "Edward", "Núñez");
		usuario6.setPassword("123456");
		
		usuario1.setPost(new HashSet<Publicacion>(){
			{
				add(new Publicacion(usuario2,new Date(),"Publicacion de prueba",
						"Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n" + 
								"						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
								"						Ut enim ad minim veniam, quis tion ullamco laboris nisi ut aliquip\r\n" + 
								"						ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\r\n" + 
								"						voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
								"						Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n" + 
								"						officia deserunt mollit anim id est laborum.",
								null,new HashSet<Comentario>(),new HashSet<Usuario>()));
				add(new Publicacion(usuario2,new Date(),"Publicacion de prueba 3",
						"Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n" + 
								"						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
								"						Ut enim ad minim veniam, quis tion ullamco laboris nisi ut aliquip\r\n" + 
								"						ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\r\n" + 
								"						voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
								"						Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n" + 
								"						officia deserunt mollit anim id est laborum.",
								null,new HashSet<Comentario>(),new HashSet<Usuario>()));
				add(new Publicacion(usuario2,new Date(),"Publicacion de prueba 6",
						"Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n" + 
								"						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
								"						Ut enim ad minim veniam, quis tion ullamco laboris nisi ut aliquip\r\n" + 
								"						ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\r\n" + 
								"						voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
								"						Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n" + 
								"						officia deserunt mollit anim id est laborum.",
								null,new HashSet<Comentario>(),new HashSet<Usuario>()));
			}
		});
		
		usuario3.setPost(new HashSet<Publicacion>() {
			{
				add(new Publicacion(usuario3,new Date(),"Publicacion de prueba 2",
						"Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n" + 
								"						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
								"						Ut enim ad minim veniam, quis tion ullamco laboris nisi ut aliquip\r\n" + 
								"						ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\r\n" + 
								"						voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
								"						Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n" + 
								"						officia deserunt mollit anim id est laborum.",
								null,new HashSet<Comentario>(),new HashSet<Usuario>()));
			}
		});
		
		
		usuario3.setPost(new HashSet<Publicacion>() {
			{
				add(new Publicacion(usuario1,new Date(),"Publicacion de prueba 4",
						"Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n" + 
								"						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
								"						Ut enim ad minim veniam, quis tion ullamco laboris nisi ut aliquip\r\n" + 
								"						ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\r\n" + 
								"						voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
								"						Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n" + 
								"						officia deserunt mollit anim id est laborum.",
								null,new HashSet<Comentario>(),new HashSet<Usuario>()));
			}
		});
		
		usuario4.setPost(new HashSet<Publicacion>() {
			{
				add(new Publicacion(usuario4,new Date(),"Publicacion de prueba 5",
						"Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n" + 
								"						sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
								"						Ut enim ad minim veniam, quis tion ullamco laboris nisi ut aliquip\r\n" + 
								"						ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\r\n" + 
								"						voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
								"						Excepteur sint occaecat cupidatat non proident, sunt in culpa qui\r\n" + 
								"						officia deserunt mollit anim id est laborum.",
								null,new HashSet<Comentario>(),new HashSet<Usuario>()));
			}
		});
		
		usuariosService.addUsuario(usuario1);
		usuariosService.addUsuario(usuario2);
		usuariosService.addUsuario(usuario3);
		usuariosService.addUsuario(usuario4);
		usuariosService.addUsuario(usuario5);
		usuariosService.addUsuario(usuario6);
		
		
	}

}
