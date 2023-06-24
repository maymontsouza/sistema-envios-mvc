/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.dao;

import java.util.ArrayList;
import java.util.List;
import sistemaEnvios.model.Pessoa;
import sistemaEnvios.model.Usuario;

/**
 *
 * @author mayara
 */
public class UsuarioDAO {
    
    private static final List<Usuario> usuarios = new ArrayList<>();
    
     public void salvarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public Usuario buscarUsuario(int codigoUsuario) {
        for (Usuario usuario : usuarios) {
            if(usuario.getCodigo()== codigoUsuario) {
                return usuario;
            }
        }
        return null;
         
    }
    
    public void imprimirListaUsuarios() {
        if(usuarios.isEmpty()) {
            System.out.println("A lista de usuários está vazia!");
        }

        for(Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
    }
    
     public Usuario buscarObjetos(String cpfUsuario) {
        for (Usuario usuario : usuarios) {
            if(usuario.getCpf().equals(cpfUsuario)) {
                return usuario;
            }
        }
        return null;
         
    }

    
    
    
}
