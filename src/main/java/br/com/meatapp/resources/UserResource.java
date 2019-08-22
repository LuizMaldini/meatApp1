package br.com.meatapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.meatapp.domain.User;
import br.com.meatapp.services.UserService;


@RestController
@RequestMapping(value="users")//mapeia as requisições
public class UserResource {//aqui recebe a requisição e redireciona para o service
	
	
	@Autowired //injeção de dependencia
	private UserService userService;
	
	
	@RequestMapping(method=RequestMethod.GET)//MAPEOU para o metodo que está vindo
	public ResponseEntity<List<User>> findAll(){//por enquanto ta retornando uma lista de obj em java.é preciso tornar genérico com o json, para isso o ResponseEntity
		List<User> users = userService.findAll();
		return ResponseEntity.ok().body(users);
		
	}
	
	

}
