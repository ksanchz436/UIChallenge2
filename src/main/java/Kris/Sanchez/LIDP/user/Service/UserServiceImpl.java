package Kris.Sanchez.LIDP.user.Service;

import Kris.Sanchez.LIDP.user.model.User;
import Kris.Sanchez.LIDP.user.repos.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List <User> getAllUsers(){
        return userRepository.findAll();
        }

    public User addNewUser(User user){
        Optional<User> userOptional = userRepository.findById(user.getId());
        if(userOptional.isPresent()){
            throw new IllegalStateException("user already exist");
        }
        else {
            userRepository.save(user);
        }
        return user;
    }

}
