package campo.relacionamentos.Exercicio3;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pessoa3")
public class Pessoa3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;

    @ManyToMany
    @JoinTable(
        // nome da tabela
        name = "pessoa_endereco",
        // campo na tabela atual
        joinColumns = @JoinColumn(name = "pessoa_id",
                                referencedColumnName = "id"), 
        // campo da outra tabela
        inverseJoinColumns = @JoinColumn(name = "endereco_id",
                                referencedColumnName = "id"))
    private List<Endereco3> enderecos;

}

