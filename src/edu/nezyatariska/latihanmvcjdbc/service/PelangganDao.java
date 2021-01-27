/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nezyatariska.latihanmvcjdbc.service;

import edu.nezyatariska.latihanmvcjdbc.entity.Pelanggan;
import edu.nezyatariska.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author ASUS
 * Nama : Nezya Tariska
 * Nim : 10119066
 * Kelas : IF2
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> SelectAllPelanggan() throws PelangganException;
}
