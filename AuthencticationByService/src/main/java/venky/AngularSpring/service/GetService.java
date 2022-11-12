package venky.AngularSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import venky.AngularSpring.DAO.UserEntity;
import venky.AngularSpring.DAO.UserRepository;

@Service
public class GetService {
	
	@Autowired
	private UserRepository userRepository;
	
	public  List<UserEntity> findAll(){
		return userRepository.findAll();
	}

	
	

}
