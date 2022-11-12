package venky.AngularSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import venky.AngularSpring.DAO.UserEntity;

import venky.AngularSpring.service.GetService;


@RestController
public class AppRestController {

	@Autowired 
	GetService getService;
	
	@RequestMapping("/list")
	public List<UserEntity> findAll(){
		return getService.findAll();
	}
}
