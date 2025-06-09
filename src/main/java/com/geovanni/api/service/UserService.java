package com.geovanni.api.service;

import com.geovanni.api.model.User;
import com.geovanni.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User criarUsuario(String nome, String email) {
        User novoUsuario = new User(nome, email);
        return userRepository.save(novoUsuario);
    }

    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    public Optional<User> buscarUsuarioPorId(Long id) {
        return userRepository.findById(id);
    }

    public User atualizarUsuario(Long id, String nome, String email) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User usuario = userOpt.get();
            usuario.setNome(nome);
            usuario.setEmail(email);
            return userRepository.save(usuario);
        }
        throw new RuntimeException("Usuário não encontrado");
    }

    public void deletarUsuario(Long id) {
        userRepository.deleteById(id);
    }
}
