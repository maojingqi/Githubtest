package cm.services.imp;

import cm.dao.UserMapper;
import cm.entity.User;
import cm.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesimp implements UserServices {
    @Autowired
    private UserMapper Usermapper;

    public List<User> selectall() {
        return Usermapper.SelectUser();
    }
}
