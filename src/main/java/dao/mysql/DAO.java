/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mysql;
import java.util.List;

/**
 *
 * @author JLL
 */
public interface DAO <T, K>{
    
    public List<T> getall();
    
    public T getOne(K id);
    
    public void delete(K id);
    
    public void update(T t);
    
    public void insert(T t);
}

