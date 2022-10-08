package com.PortafolioWeb.mgb.Interface;

import com.PortafolioWeb.mgb.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    //GUardar un objetode tipo persona
    public void savePersona(Persona persona);
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
