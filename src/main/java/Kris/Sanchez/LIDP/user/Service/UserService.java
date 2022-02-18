package Kris.Sanchez.LIDP.user.Service;

import Kris.Sanchez.LIDP.user.model.User;

import java.util.List;

public interface UserService {

    User addNewUser(User user);

    List<User>getAllUsers();


}
