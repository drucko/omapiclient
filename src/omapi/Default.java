/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package omapi;

/**
 *
 * @author heribertt
 */
import org.talamonso.OMAPI.Connection;
import org.talamonso.OMAPI.Exceptions.OmapiException;

/**
* This object holds the connection informations used by the examples.
*
* @author Talamonso
*/
public class Default {

        /**
         * This is just a Default methode...
         *
         * @return a connection object
         */
        public static Connection getC() {
                Connection c = null;
                try {
                        c = new Connection("172.16.26.35", 7911);
                        c.setAuth("defomapi", "+bFQtBCta6j2vWkjPkNFtgA==");
                } catch (OmapiException e) {
                        System.err.println(e.getMessage());
                }
                return c;
        }
}