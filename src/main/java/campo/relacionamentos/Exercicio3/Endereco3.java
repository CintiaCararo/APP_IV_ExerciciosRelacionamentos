package campo.relacionamentos.Exercicio3;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="endereco3")
public class Endereco3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String rua;
    private String cidade;
    private String estado;
    private String cep;


    public Endereco3(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    @ManyToMany(mappedBy = "enderecos")// NOME DO OBJETO NA OUTRA CLASSE
    private List<Pessoa3> pessoas;
    
}