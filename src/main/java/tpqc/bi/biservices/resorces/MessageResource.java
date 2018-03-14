package tpqc.bi.biservices.resorces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

import tpqc.bi.biservices.service.MessageService;

@Path("/messages")
public class MessageResource {
  
  //MessageService messageService = 
  
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getMessages() {
    return "Hello World";
  }
}

//https://www.youtube.com/watch?v=BaZdlJSts5A 14 Returning XML Response
