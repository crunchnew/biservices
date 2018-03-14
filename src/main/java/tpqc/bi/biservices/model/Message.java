package tpqc.bi.biservices.model;

import java.util.Date;

public class Message {

  private long id;
  private String message;
  private Date created;
  private String author;
  
  
  public Message() {
    
  }
  
  /**
   * @param id
   * @param message
   * @param created
   * @param author
   */
  public Message(long id, String message, String author) {
    super();
    this.id = id;
    this.message = message;
    this.created = new Date();
    this.author = author;
  }


    protected long getId() {
    return id;
  }
  protected void setId(long id) {
    this.id = id;
  }
  protected String getMessage() {
    return message;
  }
  protected void setMessage(String message) {
    this.message = message;
  }
  protected Date getCreated() {
    return created;
  }
  protected void setCreated(Date created) {
    this.created = created;
  }
  protected String getAuthor() {
    return author;
  }
  protected void setAuthor(String author) {
    this.author = author;
  }
    
}
