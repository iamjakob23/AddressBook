//This is an address book written in my first semester in college.
//by: jakob
//www.iamjakob.com
package addressbookdriver;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressBookDriver {

    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\TMF\\Desktop\\GUITest.txt"));
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(AddressBookDriver.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBookApp().setVisible(true);
            }
        });
    }
}
