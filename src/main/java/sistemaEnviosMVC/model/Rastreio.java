/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model;

/**
 *
 * @author mayara
 */
public class Rastreio {
    private Envio codigo;

    public Rastreio(Envio codigo) {
        this.codigo = codigo;
    }

    public Envio getCodigo() {
        return codigo;
    }

    public void setCodigo(Envio codigo) {
        this.codigo = codigo;
    }
    
    
    
}
