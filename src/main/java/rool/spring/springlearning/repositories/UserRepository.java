package rool.spring.springlearning.repositories;

import org.springframework.data.repository.CrudRepository;
import rool.spring.springlearning.domain.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
