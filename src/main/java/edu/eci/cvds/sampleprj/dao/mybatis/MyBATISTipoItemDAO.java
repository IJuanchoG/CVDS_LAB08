/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;

/**
 *
 * @author 2152030
 */
public class MyBATISTipoItemDAO implements TipoItemDAO {
    @Inject
  private TipoItemMapper TipoItemMapper; 
    @Override
    public void save(TipoItem it) throws PersistenceException {
        try{
            TipoItemMapper.agregarTipoItem(it);
    }
    catch(org.apache.ibatis.exceptions.PersistenceException e){
        throw new PersistenceException("Error al consultar el tipo de item "+it.toString(),e);
    }
    }

    @Override
    public TipoItem load(int id) throws PersistenceException {
        try{
            TipoItemMapper.agregarCliente(id);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al registrar el tipo de item "+it.toString(),e);
        }
    }
    
}
