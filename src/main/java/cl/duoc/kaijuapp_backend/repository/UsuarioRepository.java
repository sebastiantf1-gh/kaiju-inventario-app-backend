package cl.duoc.kaijuapp_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.kaijuapp_backend.model.Usuario;

import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

    // Para validar antes de registrar
    boolean existsByEmail(String email);
}