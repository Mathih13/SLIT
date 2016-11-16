/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slitclient;

import DataModel.ModuleDataModel;
import DataModel.StudentDataModel;
import Framework.ModuleManager;
import Framework.TeacherManager;
import Framework.UserManager;
import java.util.Date;

/**
 *
 * @author Terje
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserManager userManager = new UserManager(); 
        TeacherManager teacherManager = new TeacherManager();
        ModuleManager moduleManager = new ModuleManager();
        
        
       
        
        //userManager.insertUser(10, "John", "Dahl", "kaalsaas@outlook.com", "00000000", "kaalsaas", "Test123");
        
        //teacherManager.insertTeacher(33, "Torgeir", "Hansen", "Hansen@mailenhans.no", "4732839283", "Hansemann", "Passord123");
        
        //moduleManager.addModule("001", "Module1", "Renjogsnsd", "33", "massetekst", "goalss", new Date());
        
        ModuleDataModel outPutModel = moduleManager.getModel("001");
        
        if(outPutModel.getModuleID() != null){
            System.out.println(outPutModel.getModuleName());
        }
        
        StudentDataModel outPutStudent = userManager.getStudent("10");
        
        if(outPutStudent.getUserid() != 0){
            System.out.println(outPutStudent.getUserid());
        
        }
        
        
    }
    
}
