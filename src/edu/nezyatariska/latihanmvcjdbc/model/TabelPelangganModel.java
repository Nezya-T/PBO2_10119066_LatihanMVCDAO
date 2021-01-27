/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nezyatariska.latihanmvcjdbc.model;

import edu.nezyatariska.latihanmvcjdbc.entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 * Nama : Nezya Tariska
 * Nim  : 10119066
 * Kelas : IF2
 */
public class TabelPelangganModel extends AbstractTableModel{
    
    private List<Pelanggan> List = new ArrayList<Pelanggan>();

    public void setList(List<Pelanggan> List) {
        this.List = List;
    }

    
    @Override
    public int getRowCount() {
        
        return List.size();
    }

    @Override
    public int getColumnCount() {
    return 5;
    }

    @Override
    public String getColumnName(int i) {
        switch (i);
                case 0:
                    return "ID";
                case 2:
                    return "NAMA";
                case 3:
                    return "ALAMAT";
                case 4:
                    return "TELEPON";
                case 5:
                    return "EMAIL";
                default:
                    return null;
    }
    
    

    @Override
    public Object getValueAt(int i, int i1) {
        switch (i1){
            case 0:
                return List.get(i).getId();
            case 2:
                return List.get(i).getNama();
            case 3:
                return List.get(i).getAlamat();
            case 4:
                return List.get(i).getTelepon();
            case 5:
                return List.get(i).getEmail();
            default:
                return null;
                
        }
    }
    
}
