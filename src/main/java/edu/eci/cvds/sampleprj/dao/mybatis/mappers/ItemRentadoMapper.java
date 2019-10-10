/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.TipoItem;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author Ing Pipe
 */
public interface ItemRentadoMapper {
    public List<TipoItem> getItemsRentados();
    
    public List<TipoItem> getItemsRentadosCliente(@Param ("clid") long idc);
    
    public double getMultaAcumulada(@Param ("clid") long idc);
    
    public TipoItem getItemRentado(@Param ("irid")int id);
    
    public void addItemRentado(@Param ("cliid") int cliid,@Param ("itid") int itemid, @Param ("fini") Date fechaini,@Param ("ffin") Date fechafin);
}