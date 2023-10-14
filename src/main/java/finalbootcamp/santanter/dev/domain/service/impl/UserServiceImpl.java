package finalbootcamp.santanter.dev.domain.service.impl;

import finalbootcamp.santanter.dev.domain.model.User;
import finalbootcamp.santanter.dev.domain.repository.UserRepository;
import finalbootcamp.santanter.dev.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Esse número de conta já existe!");
        }
        return userRepository.save(userToCreate);
    }
}
