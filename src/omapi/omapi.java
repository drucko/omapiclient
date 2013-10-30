package omapi;


import org.talamonso.OMAPI.Connection;
import org.talamonso.OMAPI.Exceptions.OmapiException;
import org.talamonso.OMAPI.Message;
import org.talamonso.OMAPI.Objects.Lease;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heribertt
 */
public class omapi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c = Default.getC();
        System.out.println("Starte Prog");
        try {
            Lease l = new Lease(c);
            l.setIPAddress("192.168.0.28");
            Lease remote =  l.send(Message.OPEN);
            System.out.println("Lease ends " + remote.getEnds() + " dd");
            remote = remote.send(Message.UPDATE);
            System.out.println(remote);
            l.delete();
            
            
        } catch (OmapiException e) {
            System.err.println(e.getMessage());
        }
        c.close();
    }
}
