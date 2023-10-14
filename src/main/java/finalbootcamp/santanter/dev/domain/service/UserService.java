package finalbootcamp.santanter.dev.domain.service;

import finalbootcamp.santanter.dev.domain.model.User;

public interface UserService {
    public User findById(Long id);
    public User createUser(User userToCreate);
}
