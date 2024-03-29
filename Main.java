package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        
        Controller1 c1 = new Controller1(model); // Create first controller
        
        Controller2 c2 = new Controller2(model,"Controller c2",40,200); // Create second controller
        Controller2 c3 = new Controller2(model,"Controller c3",60,200); // Create second controller
        Controller2 c4 = new Controller2(model,"Controller c4",70,200); // Create second controller
        Controller2 c5 = new Controller2(model,"Controller c5",80,200); // Create second controller
    } // main
  
} // Main
