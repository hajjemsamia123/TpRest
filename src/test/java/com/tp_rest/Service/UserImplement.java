package com.tp_rest.Service;

import com.tp_rest.DTO.UserDTO;
import com.tp_rest.Entity.User;
import com.tp_rest.Repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class UserImplement implements UserInterface {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<User> List() {
        List<User> liste = (List<User>) userRepository.findAll();
        return liste;}

    @Override
    public User Get(long id) {
        return userRepository.findById(id).get();
    }
    @Override
    public User Save(User user) {
        return userRepository.save(user);}

    @Override
    public void Delete(long id) {
        userRepository.deleteById(id);}

    @Override
    public UserDTO Update(Long Id, User details) {

        ModelMapper mapper = new ModelMapper();
        return mapper.map(details, UserDTO.class);

    }
}
