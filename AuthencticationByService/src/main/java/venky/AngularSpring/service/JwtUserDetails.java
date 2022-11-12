package venky.AngularSpring.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.core.userdetails.UserDetails;

import venky.AngularSpring.DAO.UserEntity;

public class JwtUserDetails implements UserDetails {

	
	private String userName;
	private String password;
	private boolean activate;
	private List<GrantedAuthority> authorities;
	private String aut="ROLE_USER,ROLE_ADMIN";
 
	public JwtUserDetails() {
	}
	
	public JwtUserDetails(UserEntity user) {
		this.userName=user.getUserName();
		this.password=user.getPassword();
		this.activate = (user.getEnabled()==1);
		this.authorities= Arrays.stream(aut.split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
		
	}

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
