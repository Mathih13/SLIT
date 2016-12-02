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
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Terje
 */
public class Main extends Application {

       
    @Override
    public void start(Stage stage) throws Exception{
        Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("../ModuleCreate.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        UserManager userManager = new UserManager(); 
        TeacherManager teacherManager = new TeacherManager();
        ModuleManager moduleManager = new ModuleManager();
        
        launch(args);
        
    
        
        //userManager.insertUser(10, "John", "Dahl", "kaalsaas@outlook.com", "00000000", "kaalsaas", "Test123");
        
        //teacherManager.insertTeacher(33, "Torgeir", "Hansen", "Hansen@mailenhans.no", "4732839283", "Hansemann", "Passord123");

        //moduleManager.addModule("008", "Module1", "Renjogsnsd", "001", "massetekst", "goalss", "2017-09-09");
        //moduleManager.addModule("10", "Module5", "MASSE TEKST REQUERMENTS",  "002", "MASSE TEKST DESCRIPTION", "MASSE TEKST GOALS", "2017-09-05");
      
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


