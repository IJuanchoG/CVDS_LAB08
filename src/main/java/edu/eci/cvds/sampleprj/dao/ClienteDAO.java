/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.cvds.sampleprj.dao; 

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
import java.util.List;



public interface ClienteDAO {
    public void save(Cliente cl) throws PersistenceException;

   public Cliente load(long id) throws PersistenceException;
   
   public List<Cliente> load() throws PersistenceException;
   
   public List<ItemRentado> itemsRentadosCliente(long clid)throws PersistenceException;
   
}
