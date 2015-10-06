package beans;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PersonaBean {

    private Persona persona = new Persona();
    private static List<Persona> personas = new ArrayList();
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        PersonaBean.personas = personas;
    }
    
    
    public  void agregarPersona(){
        PersonaBean.personas.add(this.persona);
    
    }
    public void eliminarPersona(Persona persona){
        PersonaBean.personas.remove(persona);
    }

    
    public PersonaBean() {
    }
    
}
