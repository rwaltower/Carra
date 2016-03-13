package scheduler;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static scheduler.GUI.userInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayomitunde
 */
public class Serialize {
    static String fileLocation = "C:\\Users\\Ayomitunde\\Desktop\\userInfo.ser";
    
    static void Open(File file) throws FileNotFoundException, IOException {
        try {
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                GUI.userInfo = (HashMap) ois.readObject();
                
            }
        } catch (IOException | ClassNotFoundException ioe) {
        }
    }
    
    public static void save(String path) {
        try {
            try (FileOutputStream fileOut = new FileOutputStream(path); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(userInfo);
            }

        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
