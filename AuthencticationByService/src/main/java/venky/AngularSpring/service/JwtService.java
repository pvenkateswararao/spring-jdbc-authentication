package venky.AngularSpring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import venky.AngularSpring.DAO.UserEntity;
import venky.AngularSpring.DAO.UserRepository;

@Service
public class JwtService implements UserDetailsService {
	
	@Autowired 
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<UserEntity> user = userRepository.findByUserName(username);

		return user.map(JwtUserDetails::new).get();
		//return new JwtUserDetails(username);
	}

}
