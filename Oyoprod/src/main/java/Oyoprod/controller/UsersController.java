package Oyoprod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Oyoprod.entity.UsersListEntity;
import Oyoprod.repository.UsersRepository;

@RestController
public class UsersController {
	@Autowired
	UsersRepository ref;
	
	@RequestMapping(value="/getIdentities/{optin}")
	public List<UsersListEntity>  getIdentities(@PathVariable int optin){
		return ref.findAllByid(optin);
	}
	

}
