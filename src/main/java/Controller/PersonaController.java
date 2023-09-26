/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Persona;
import Model.PersonaDAO;
/**
 *
 * @author pc_dev
 */
public class PersonaController {
    
    PersonaDAO perDAO =  new PersonaDAO();
    
    public void insert(int id,String name,String lastName,String email,String phone){
         perDAO.insertar(id, name, lastName, email, phone);        
    }
    
    public Persona buscar(int id){
        return perDAO.buscarPersona(id);
    }
    
    public void list(){
        perDAO.listar();    
    }
    
}
