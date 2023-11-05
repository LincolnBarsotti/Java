package med.voll.api.medico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

/**
 * @author Lincoln
 */
@Table(name = "medicos")
@Entity(name = "Medico")
@Getter //Cria o getter automaticamente utilizando o Lombok
@NoArgsConstructor // Gera o Construtor default
@AllArgsConstructor // Gera um construtor para todos os argumentos
@EqualsAndHashCode(of = "id") // Gera o Equals e o HashCode. Utilizando {"of = "id"} faz com que gere pelo ID e não por todos os args
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, email, crm, telefone;

    @Enumerated(EnumType.STRING) // Utiliza-se quando é usado um Enum, tendo que especificar o que vai retornar (String ou Ordinal)
    private Especialidade especialidade;
    @Embedded // É para indicar que a classe não representa uma unica entidade por si só e que está sendo incorporada.
    private Endereco endereco;

    private Boolean ativo;

    public Medico(DadosCadastroMedico dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.especialidade = dados.especialidade();
        this.crm = dados.crm();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
