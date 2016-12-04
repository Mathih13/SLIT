/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import DataModel.ModuleDataModel;
import DataModel.StudentDataModel;
//import Framework.ModuleManager;
import Framework.TeacherManager;
import Framework.UserManager;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;


/**
 *
 * @author Terje
 */
public class Main extends Application {

       
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ModuleCreate.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        
        launch(args);
        UserManager userManager = new UserManager(); 
        TeacherManager teacherManager = new TeacherManager();
 
        
        //userManager.insertUser(10, "John", "Dahl", "kaalsaas@outlook.com", "00000000", "kaalsaas", "Test123");
        
        //teacherManager.insertTeacher(33, "Torgeir", "Hansen", "Hansen@mailenhans.no", "4732839283", "Hansemann", "Passord123");
        
        /*
        ModuleDataModel outPutModel = module.getModel("001");
        
        if(outPutModel.getModuleID() != null){
            System.out.println(outPutModel.getModuleName());
        }
        
        */
        
        StudentDataModel outPutStudent = userManager.getStudent("10");
        
        if(outPutStudent.getUserid() != 0){
            System.out.println(outPutStudent.getUserid());
            
       
        
        }
        
        
        
    }


    

    
}


