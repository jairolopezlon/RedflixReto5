/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mysql;

import RedflixReto5.Serie;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JLL
 */
public class SerieDAO implements DAO<Serie, String>{
    
    final String GETALL = "select * from series";
    final String GETONE = "select * from series where ser_titulo = ?";
    final String INSERT = "insert into series values (?, ?, ?)";
    final String UPDATE = "update series set ser_capitulos = ? where ser_titulo = ?";
    final String DELETE = "delete from series where ser_titulo = ?";
    
    private Connection conn = null;
    
    public SerieDAO(Connection conn){
        this.conn = conn;
    }
    
    @Override
    public List<Serie> getAll(){
        List<Serie> series = new ArrayList<>();
        
        try (Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(GETALL)){
            
            while(rs.next()){
            series.add(TurnIntoSerie(rs));
            
            }
        } catch (SQLException ex) {
            System.err.print(ex);
        }       
        return series;
    }
    
    @Override
    public Serie getOne(String serTitulo){
        Serie serie = null;
        
        try (Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(GETONE)){
            
            while(rs.next()){
                serie = TurnIntoSerie(rs);
            
            }
        } catch (SQLException ex) {
            System.err.print(ex);
        }       
        return serie;
    }
    
    
    
    @Override
    public void delete(String serTitulo){
        try(PreparedStatement ps = conn.prepareStatement(DELETE)){
            ps.setString(1, serTitulo);
            if(ps.executeUpdate() == 0){
                throw new SQLException("Posiblemente no se elimino el registro");
            }
        }catch(SQLException ex){
            System.err.print(ex);
        }
    }
    
    @Override
    public void update(Serie serie){
        try(PreparedStatement ps = conn.prepareStatement(UPDATE)){
            
            ps.setString(1, serie.getSerTitulo());
            ps.setInt(2, serie.getSerCapitulos());
            
            if(ps.executeUpdate() == 0){
                throw new SQLException("posiblemente no se actualizo el registro");
            }
        }catch(SQLException ex){
            System.err.print(ex);
        }
    }
//    
//    @Override
//    public void updateTemporadas(Serie serie){
//        try(PreparedStatement ps = conn.prepareStatement(UPDATE_TEMP)){
//            
//            ps.setString(1, serie.getSerTitulo());
//            ps.setInt(2, serie.getSerTemporadas());
//            
//            if(ps.executeUpdate() == 0){
//                throw new SQLException("posiblemente no se actualizo el registro");
//            }
//        }catch(SQLException ex){
//            System.err.print(ex);
//        }
//    }
//    
    @Override
    public void insert(Serie serie){
        
        try(PreparedStatement ps = conn.prepareStatement(INSERT)){
            
            ps.setString(1, serie.getSerTitulo());
            ps.setInt(2, serie.getSerTemporadas());
            ps.setInt(3, serie.getSerCapitulos());
            
            if(ps.executeUpdate() == 0){
               throw new SQLException("posiblemente no se actualizo el registro");
            }
        }catch(SQLException ex){
            System.err.print(ex);
        }
        
    }
    
    public Serie TurnIntoSerie (ResultSet rs) throws SQLException {
            
        String ser_titulo = rs.getString("ser_titulo");
        int ser_temporadas = rs.getInt("ser_temporadas");
        int ser_capitulos = rs.getInt("ser_capitulos");
        
        Serie serie = new Serie(ser_titulo,ser_temporadas,ser_capitulos);
        
        return serie;
    }
        
}
