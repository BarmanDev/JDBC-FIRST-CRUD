package test;

import datos.PersonaDAO;
import domain.Persona;
import java.sql.SQLException;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) throws SQLException {
        PersonaDAO personaDao = new PersonaDAO();
        
        // Insertado un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Borja", "Fernández", "borja@mail.com", "3837362");
//        personaDao.insertar(personaNueva);

        // Modificar objeto persona existente 
        Persona personaModificar = new Persona(4, "Paco", "Torres", "paco@gmail.com", "33737373");
        personaDao.actualizar(personaModificar);
        
        // Eliminar un registro
        Persona personaEliminada = new Persona(1);
        personaDao.eliminar(personaEliminada);

        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });



    }

}
