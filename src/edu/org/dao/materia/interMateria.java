/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.org.dao.materia;

import edu.org.entity.materia.Materia;
import java.util.List;
import org.cris.cc.dao.InterfazDaoGeneric;

/**
 *
 * @author Usuario
 */
public interface interMateria extends InterfazDaoGeneric{
    
    public List<Materia>listaMateria();
    public List<Materia>listaMateriaNom(String Nombre);
    public List<Materia>listaMateriaEstado(boolean estado);
    
}
