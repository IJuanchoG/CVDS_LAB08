package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;

/**
 *
 * @author 2106913
 */
public interface ClienteMapper {
    
    public Cliente consultarCliente(@Param("idcli") long id); 
    
    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     * @param id
     * @param idit
     * @param fechainicio
     * @param fechafin 
     */

    /**
     * Consultar todos los clientes
     * @return 
     */
    public List<Cliente> consultarClientes();
    
    public List<ItemRentado> itemsRentadosCliente(@Param("clid")long id);
    
    public void agregarItemRentadoACliente(@Param("idcli") long id, 
            @Param("idit")int idit, 
            @Param("fechai") Date fechainicio,
            @Param("fechaf") Date fechafin);
    
    public void agregarCliente(@Param("cli") Cliente cl);
    
}
