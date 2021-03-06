package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.ItemDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.samples.entities.TipoItem;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import java.sql.Date;
import java.util.List;
import org.mybatis.guice.transactional.Transactional;

@Singleton
public class ServiciosAlquilerItemsImpl implements ServiciosAlquiler {

   @Inject
   private ItemDAO itemDAO;
   @Inject
   private ClienteDAO clienteDAO;
   @Inject
   private TipoItemDAO tipoItemDAO;

   @Override
   public int valorMultaRetrasoxDia(int itemId) {
       throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public Cliente consultarCliente(long docu) throws ExcepcionServiciosAlquiler {
       try {
           Cliente cliente =  clienteDAO.load(docu);
           if (cliente == null) throw new ExcepcionServiciosAlquiler("Error al consultar el cliente "+docu);
           return cliente;
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar el cliente "+docu,ex);
       }
   
   }

   @Override
   public List<ItemRentado> consultarItemsCliente(long idcliente) throws ExcepcionServiciosAlquiler {
        try {
           List<ItemRentado> itemsCliente =  clienteDAO.itemsRentadosCliente(idcliente);
           if (itemsCliente == null) throw new ExcepcionServiciosAlquiler("Error al consultar los items del cliente "+idcliente);
           return itemsCliente;
        }catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar los items del cliente "+idcliente,ex);
       }
   }

   @Override
   public List<Cliente> consultarClientes() throws ExcepcionServiciosAlquiler {
       try {
           return clienteDAO.load();
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar los clientes ",ex);
       }
   }

   @Override
   public Item consultarItem(int id) throws ExcepcionServiciosAlquiler {
       try {
           return itemDAO.load(id);
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar el item "+id,ex);
       }
   }

   @Override
   public List<Item> consultarItemsDisponibles() throws ExcepcionServiciosAlquiler{
       try {
           return itemDAO.disponibles();
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar el item ",ex);
       }
   }

   @Override
   public long consultarMultaAlquiler(int iditem, Date fechaDevolucion) throws ExcepcionServiciosAlquiler {
       throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public TipoItem consultarTipoItem(int id) throws ExcepcionServiciosAlquiler {
       try {
           return tipoItemDAO.load(id);
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar el tipo de item "+id,ex);
       }
   }

   @Override
   public List<TipoItem> consultarTiposItem() throws ExcepcionServiciosAlquiler {
       try {
           return tipoItemDAO.load();
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al consultar los tipos de items ",ex);
       }
   }

    @Override
    @Transactional
   public void registrarAlquilerCliente(Date date, long docu, Item item, int numdias) throws ExcepcionServiciosAlquiler {
       throw new UnsupportedOperationException("Not supported yet.");
   }

    @Override
    @Transactional
    public void registrarCliente(Cliente c) throws ExcepcionServiciosAlquiler {
        try {
            clienteDAO.save(c);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosAlquiler("Error al registrar cliente "+c.toString(),ex);
        }
    }

   @Override
   public long consultarCostoAlquiler(int iditem, int numdias) throws ExcepcionServiciosAlquiler {
       throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   @Transactional
   public void actualizarTarifaItem(int id, long tarifa) throws ExcepcionServiciosAlquiler {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   @Override
   @Transactional
   public void registrarItem(Item i) throws ExcepcionServiciosAlquiler {
       try {
           itemDAO.save(i);
       } catch (PersistenceException ex) {
           throw new ExcepcionServiciosAlquiler("Error al registrar cliente "+i.toString(),ex);
       }
   }

   @Override
   public void vetarCliente(long docu, boolean estado) throws ExcepcionServiciosAlquiler {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
}