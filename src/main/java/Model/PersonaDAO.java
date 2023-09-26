/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.persistence.*;
import Model.Persona;

/**
 *
 * @author pc_dev
 */
public class PersonaDAO {

    private EntityManager em;
    private EntityManagerFactory emf;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();

        for (Persona persona : personas) {
            System.out.println("Persona" + persona);
        }
    }

    public void insertar(int id, String name, String lastName, String email, String phone) {
        try {
            Persona person = new Persona();
            person.setIdPersona(id);
            person.setNombre(name);
            person.setApellido(lastName);
            person.setEmail(email);
            person.setTelefono(phone);
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            System.out.println("Registro exitoso");
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }

    }

    public Persona buscarPersona(int id) {
        return em.find(Persona.class, id);
    }
}
