/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

/**
 *
 * @author mayara
 */
public class Objeto {
    private final int codigo;
    private String nome;
    private String altura;
    private String peso;
    private String largura;
    private String valor;
    private String informacoes;
    
    

    public Objeto(String nome, String altura, String peso, String largura, String valor, String informacoes) {
        this.codigo = ++contadorObjeto;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.largura = largura;
        this.valor = valor;
        this.informacoes = informacoes;
    }
    
    private static int contadorObjeto=0;
    
    public int getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    @Override
    public String toString() {
        return "Objeto{" + "codigo=" + codigo + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", largura=" + largura + ", valor=" + valor + ", informacoes=" + informacoes + '}';
    }
    
    
}
