/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Cliente;
<<<<<<< HEAD
import java.util.Calendar;
import java.util.Date;
=======
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
>>>>>>> 1168eb12cb3c63901f932b45c1d49907387d7f29
import java.util.List;

/**
 *
 * @author 2152030
 */
public class MyBATISClienteDAO implements ClienteDAO {
    @Inject
    private ClienteMapper clienteMapper;    


    @Override
    public Cliente load(long id) throws PersistenceException {
    try{
        return clienteMapper.consultarCliente(id);
    }
    catch(org.apache.ibatis.exceptions.PersistenceException e){
        throw new PersistenceException("Error al consultar el cliente "+id,e);
    }


    }

    @Override
    public void save(Cliente cl) throws PersistenceException {                   
        try{
            clienteMapper.agregarCliente(cl);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al registrar el cliente "+cl.toString(),e);
        }
        
    }

    @Override
    public List<Cliente> load() throws PersistenceException {
        try{
            return clienteMapper.consultarClientes();
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar los clientes ",e);
        }
    }

    @Override
<<<<<<< HEAD
    public void saveItemRentado(long clid, int itid, Date fechaIni, int numeroDias) throws PersistenceException {
        Calendar calendario=Calendar.getInstance();
        calendario.setTime(fechaIni);
        calendario.add(Calendar.DAY_OF_YEAR, numeroDias);
        Date fechaFin=calendario.getTime();
        
        clienteMapper.agregarItemRentadoACliente(clid,itid,fechaIni,fechaFin);
=======
    public List<ItemRentado> itemsRentadosCliente(long clid) throws PersistenceException{
        try{
            List<ItemRentado> n = clienteMapper.itemsRentadosCliente(clid);
            return n;
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar los items rentados del cliente ",e);
        }
>>>>>>> 1168eb12cb3c63901f932b45c1d49907387d7f29
    }

    
}
