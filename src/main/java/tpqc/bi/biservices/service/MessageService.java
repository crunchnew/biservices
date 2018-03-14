package tpqc.bi.biservices.service;

import java.util.ArrayList;
import java.util.List;

import tpqc.bi.biservices.model.Message;

public class MessageService {

    public List<Message> getAllMessages() {
      
      Message m_1 = new Message(1L, "Hello World", "Wieslaw");
      Message m_2 = new Message(2L, "Hello Jersey", "Wieslaw");
      List<Message> list = new ArrayList<>();
      list.add(m_1);
      list.add(m_2);
      
      return list;
      
    }
}
