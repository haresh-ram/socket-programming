package example;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/servl")
public class serv {

	@OnOpen
	public void open() {
		System.out.println("connected");
	}
	
	@OnClose
	public void close() {
		System.out.println("disconnected");
	}
	
	@OnError
	public void error(Throwable t) {
		t.printStackTrace();;
	}
	
	@OnMessage
	public String message(String str) {
		String st = "from server: "+str;
		return st;
	}
}
