/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.twinkle.se;

import java.net.InetSocketAddress;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

/**
 *
 * @author gjz010
 */
public final class TwinkleSE {
    private final Server server;
public TwinkleSE(InetSocketAddress addr){
    server=new Server(addr);
        String webDir = this.getClass().getClassLoader().getResource("static").toExternalForm();
ResourceHandler res = new ResourceHandler();
res.setDirectoriesListed(false);
res.setWelcomeFiles(new String[]{ "index.html" });
res.setResourceBase(webDir);
       HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { res, new DefaultHandler() });
        server.setHandler(handlers);
}
public void start(){
    try{
            server.start();
        server.dumpStdErr();
        server.join();}catch(Exception ex){
        ex.printStackTrace();
        }
}
public void stop(){
    try{
    server.stop();}
    catch(Exception ex){
        ex.printStackTrace();
        }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String ip="127.0.0.1";
        int port=30000;
        if(System.getProperty("listener.ip")!=null) ip=System.getProperty("listener.ip");
        if(System.getProperty("listener.port")!=null) port=Integer.parseInt(System.getProperty("listener.port"));
        System.out.println("Listening on:"+ip+":"+Integer.toString(port));
        InetSocketAddress listener=new InetSocketAddress(ip,port);
        TwinkleSE se=new TwinkleSE(listener);
        se.start();
        // TODO code application logic here
    }
    
}
