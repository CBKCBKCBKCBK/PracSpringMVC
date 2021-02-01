package tw.com.web.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.com.web.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}