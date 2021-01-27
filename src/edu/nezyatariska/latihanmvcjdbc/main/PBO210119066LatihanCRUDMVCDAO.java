/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nezyatariska.latihanmvcjdbc.main;

import edu.nezyatariska.latihanmvcjdbc.database.KingBarberShopDatabase;
import edu.nezyatariska.latihanmvcjdbc.entity.Pelanggan;
import edu.nezyatariska.latihanmvcjdbc.error.PelangganException;
import edu.nezyatariska.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 * Nama  : Nezya Tariska
 * Nim  : 10119066
 * Kelas : IF2
 */
public class PBO210119066LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException, PelangganException{
        // TODO code application logic here
        PelangganDao dao = KingBarberShopDatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Nezya Tariska");
        pelanggan.setAlamat("Cimahi Selatan");
        pelanggan.setTelepon("083816175761");
        pelanggan.setEmail("nayzatariska@gmail.com");
        
        dao.insertPelanggan(pelanggan);
    }
    
}
