/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEnvios.dao;

import java.util.ArrayList;
import java.util.List;
import sistemaEnvios.model.Funcionario;

/**
 *
 * @author mayara
 */
public class FuncionarioDAO {

    private static final List<Funcionario> funcionarios = new ArrayList();

    public void salvarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public Funcionario buscarFuncionario(int codigoFuncionario) {
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getCodigo()== codigoFuncionario) {
                return funcionario;
            }
        }
        return null;
         
    }
    
    public void imprimirListaFuncionarios() {
        if(funcionarios.isEmpty()) {
            System.out.println("A lista de funcionários está vazia!");
        }

        for(Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }

}
