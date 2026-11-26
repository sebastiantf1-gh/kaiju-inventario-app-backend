package cl.duoc.kaijuapp_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.kaijuapp_backend.model.Rol;

import java.util.Optional;

public interface RolRepository extends JpaRepository <Rol, Long>{
    Optional<Rol> findByNombreRol(String nombreRol);
}