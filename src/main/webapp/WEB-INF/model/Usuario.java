package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = usuarios)
@Getter
@Setter
@NoArgsConstructor
public class Usuario {
    @Id
    @Generativedvalue(strategy = GenerationType.IDENTIFY) 
    private long id;
    @Column(nullable = false, unique = true)
    private String nomeDeUsuario;
    @Column(nullable = false)
    private String senha;
}
