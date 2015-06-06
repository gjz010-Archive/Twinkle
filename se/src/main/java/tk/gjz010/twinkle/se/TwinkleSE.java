/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.twinkle.se;

import org.eclipse.jetty.server.Server;

/**
 *
 * @author gjz010
 */
public final class TwinkleSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Server server=new Server(37189);
        server.start();
        server.join();
        // TODO code application logic here
    }
    
}
