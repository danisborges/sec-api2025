package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuario extends JpaRepository<Usuario, Long>{
    public Usuario findByNomeDeUsuario(String nomeDeUsuario);
    
}