/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.Idao;
import entities.Machine;




import service.MachineService;



/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main (String [] args){
        //NewHibernateUtil.getSessionFactory();
        
        
            Idao<Machine> dao = new MachineService();
             
                    dao.create(new Machine("aaa","bbbb",478));
                    dao.create(new Machine("tttt","bbbb",4078));
                    for(Machine m: dao.findAll()) {
                        System.out.println(m);
                    }
        
    }
    
}
