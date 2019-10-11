/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.cvds.sampleprj.dao; 

import edu.eci.cvds.samples.entities.Cliente;
<<<<<<< HEAD
import java.util.Date;
=======
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
>>>>>>> 1168eb12cb3c63901f932b45c1d49907387d7f29
import java.util.List;



public interface ClienteDAO {
    public void save(Cliente cl) throws PersistenceException;

   public Cliente load(long id) throws PersistenceException;
   
   public List<Cliente> load() throws PersistenceException;
   
<<<<<<< HEAD
   public void saveItemRentado(long clid, int itid, Date FechaIni, int numeroDias) throws PersistenceException;
=======
   public List<ItemRentado> itemsRentadosCliente(long clid)throws PersistenceException;
   
>>>>>>> 1168eb12cb3c63901f932b45c1d49907387d7f29
}
