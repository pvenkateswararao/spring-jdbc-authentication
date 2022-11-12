package venky.AngularSpring.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

	@Id
	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "enabled")
	private int enabled;
	
	public UserEntity() {

	}

	public UserEntity(String userName, String password, int enabled) {
		super();
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
}
