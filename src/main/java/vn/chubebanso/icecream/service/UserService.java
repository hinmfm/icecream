package vn.chubebanso.icecream.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.chubebanso.icecream.domain.User;
import vn.chubebanso.icecream.repository.UserRepository;

@Service
public class UserService {
    final private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleCreateUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }
}
