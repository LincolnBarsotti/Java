package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Lincoln
 */
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String Logradouro, cep, bairro, numero, complemento, cidade, uf;

    public Endereco(DadosEndereco endereco) {

        this.Logradouro = endereco.logradouro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.bairro = endereco.bairro();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if (endereco.logradouro() != null){
            this.Logradouro = endereco.logradouro();
        }
        if (endereco.cep() != null){
            this.cep = endereco.cep();
        }
        if (endereco.numero() != null){
            this.numero = endereco.numero();
        }
        if (endereco.complemento() != null){
            this.complemento = endereco.complemento();
        }
        if (endereco.cidade() != null){
            this.cidade = endereco.cidade();
        }
        if (endereco.uf() != null){
            this.uf = endereco.uf();
        }
        if (endereco.bairro() != null){
            this.bairro = endereco.bairro();
        }
    }
}
