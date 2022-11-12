package venky.AngularSpring.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {

	Optional< UserEntity> findByUserName(String userName);
}
