package br.com.meatapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meatapp.domain.User;
import br.com.meatapp.repositories.UserRepository;

@Service
public class UserService {

	/*injeção de dependência, automaticamente obj de outras classes
	 * api de backand só entrego informaçoes, fornece dados(obj) em formato de json
	 * 
	 * rest arquitetura que faz a comunicação entre front e backand, 
	 * rest simplifica
	 * constraints= melhores praticas=são elas=Cliente-Servidor,Stateless, Cache, Interface uniforme, Sistema em Camadas, Código sobre Demanda
	 * 
	 * 
	 * Rest= boas praticas, o que vai ser feito
	 * 
	 * restful= depois de implemtnar as caracteristicas,uma api que implementas as boas praticas
	 * 
	 * URI é um recurso, no formato json
	 *  
	 * json é a info que sai da api, composto por chave e valor,
	 * 
	 * GET  qdo necessita de um recurso
	 * 
	 * PUT atualiza recurso
	 * 
	 * POST 
	 * 
	 * DELETE = REMOVE INFO
	 * */
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
}
