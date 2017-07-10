package ir.arcinc.repository;

import ir.arcinc.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tahae on 7/10/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findUserByUserName(String username);
}
