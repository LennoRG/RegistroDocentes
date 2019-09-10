/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.org.dao.docente;

import edu.org.entity.docente.Docente;
import java.util.List;
import org.cris.cc.dao.InterfazDaoGeneric;

/**
 *
 * @author Usuario
 */ 
public interface interDocente extends InterfazDaoGeneric{

    public List<Docente> listaDocentes();
    public List<Docente> listaDocectesNomb(String Nombre);
    public List<Docente> listaDocectesApp(String Apellido);
    public List<Docente> listaDocectesCed(String Cedula);

}
