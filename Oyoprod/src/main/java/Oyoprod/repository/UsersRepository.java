package Oyoprod.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import Oyoprod.entity.Users;
import Oyoprod.entity.UsersListEntity;

public interface UsersRepository extends CrudRepository<Users, Integer>{
	public List<UsersListEntity> findAllByid(int  optin);
	List<Users> findAll();

}
