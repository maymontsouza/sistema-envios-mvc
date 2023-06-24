/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

import java.util.ArrayList;
import java.util.List;
import sistemaEnvios.model.Frete;

/**
 *
 * @author mayara
 */
  public class Envio implements Comparable<Envio>{
    private Usuario remetente;
    private Usuario destinatario;
    private Objeto objeto;
    private String status;
    private double valorFrete;

    public Envio(Usuario remetente, Usuario destinatario, Objeto objeto, String status, double valorFrete) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.objeto = objeto;
        this.status = status;
        this.valorFrete = valorFrete;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
    
    
    public String statusEnvio(){
        return String.format("Nome Objeto: %s |  Status: %s", objeto.getNome() , status);
    }

   public String infoEnvio() {
        return String.format("Objeto nº: %s | Remetente: %s | Destinatário: %s", 
                    getObjeto().getCodigo(), 
                    getRemetente().getNome(), 
                    getDestinatario().getNome());
    }

    @Override
    public String toString() {
        return "Envio{" + "remetente=" + remetente + ", destinatario=" + destinatario + ", objeto=" + objeto + ", status=" + status + '}';
    }

    @Override
    public int compareTo(Envio e) {
        if (this.getObjeto().getCodigo() < e.getObjeto().getCodigo()) {
            return -1;
        }
        if (this.getObjeto().getCodigo() > e.getObjeto().getCodigo()) {
            return 1;
        }
        return 0;
    }
  }
