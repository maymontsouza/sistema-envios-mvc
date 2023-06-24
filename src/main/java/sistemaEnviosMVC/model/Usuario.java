/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;
import sistemaEnvios.model.Pessoa;

/**
 *
 * @author mayara
 */
public class Usuario extends Pessoa {
    private String Logradouro;
    private String CEP;
    private String Cidade;
    private String Bairro;
    private String Estado;
    private String Numero;

    public Usuario(String Logradouro, String CEP, String Cidade, String Bairro, String Estado, String Numero, String nome, String email, String telefone, String cpf, String senha) {
        super(nome, email, telefone, cpf, senha);
        this.Logradouro = Logradouro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Estado = Estado;
        this.Numero = Numero;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Logradouro=" + Logradouro + ", CEP=" + CEP + ", Cidade=" + Cidade + ", Bairro=" + Bairro + ", Estado=" + Estado + ", Numero=" + Numero + '}';
    }

    
    
}
