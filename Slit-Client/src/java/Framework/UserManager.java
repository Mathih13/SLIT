/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import DataModel.StudentDataModel;
import Server.UserSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Terje
 */
public class UserManager {

    private UserSessionBeanRemote lookupUserSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            //return (UserSessionBeanRemote) c.lookup("java:comp/env/UserSessionBean");
            return (UserSessionBeanRemote) c.lookup("java:global/Slit-Server-ejb/UserSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    
    public void insertUser(int userid, String firstName, String lastName, String email, String phoneNumber, String username, String password)
    {
        this.lookupUserSessionBeanRemote().insertUser(userid, firstName, lastName, email, phoneNumber, username, password);
    }
    
    public StudentDataModel getStudent(String id){
        return this.lookupUserSessionBeanRemote().getStudent(id);
    }
    
}
