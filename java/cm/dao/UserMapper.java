package cm.dao;

import cm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /*
     *
     *
     * */
    public List<User> SelectUser();
}
