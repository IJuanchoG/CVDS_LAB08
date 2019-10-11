package edu.eci.cvds.view;

import com.google.inject.Inject;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import com.google.inject.Injector;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.TipoItem;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="RegistroBean")
@SessionScoped
public class AlquilerItemBean extends BasePageBean {   
    private String mensaje;
    private Cliente clienteSeleccionado;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }
    @Inject
    ServiciosAlquiler s;

    public List<Cliente> consultarClientes() {
        try{
            return s.consultarClientes();
        }catch(ExcepcionServiciosAlquiler e){
            mensaje = "No se encuentran clientes registrados";
            return null;
        }    
    }
    public Cliente consultarCliente(long id){
        try{
            return s.consultarCliente(id);
        }catch(ExcepcionServiciosAlquiler e){
            return null;
        }
        
    }
    
    public Item consultarItem(int id){
        try{
            return s.consultarItem(id);
        }catch(ExcepcionServiciosAlquiler e){
            return null;
        }
    }
    
    public TipoItem consultarTipoItem(int id){
        try{
            return s.consultarTipoItem(id);
        }catch(ExcepcionServiciosAlquiler e){
            return null;
        }
    }
    
    public List<TipoItem> consultarTiposItem(){
        try{
            return s.consultarTiposItem();
        }catch(ExcepcionServiciosAlquiler e){
            return null;
        }
    }
    
    public void registrarCliente(Cliente c){
        try{
            s.registrarCliente(c);
        }catch(ExcepcionServiciosAlquiler e){
            mensaje = "No se encuentran clientes registrados";
        }
    }
    public void registrarItem(Item i){
        try{
            s.registrarItem(i);
        }catch(ExcepcionServiciosAlquiler e){
            mensaje = "No se encuentran clientes registrados";
        }
    
    }
    
    
    
    
    
}