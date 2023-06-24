/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.model.comparator;
import java.util.Comparator;
import sistemaEnvios.model.Envio;
import sistemaEnvios.model.Envio;

/**
 *
 * @author mayara
 */
public class EnvioComparator implements Comparator<Envio> {
    
    @Override
    public int compare(Envio o1, Envio o2) {
        return o1.getRemetente().getNome().compareTo(o2.getRemetente().getNome());
    }
    
}