package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) throws IOException {
		
		System.out.println("server is started");
		ServerSocket ss = new ServerSocket(7766);
		System.out.println("server is waiting for the request");
		Socket soc = ss.accept();
		System.out.println("client connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		int n = Integer.parseInt(br.readLine());
		int sum=n;
		for(int i=n-1;i>=1;i--) {
			sum*=i;
		}
		
		PrintWriter pr = new PrintWriter(soc.getOutputStream(),true);
		pr.println("The factorial of "+n+" is "+sum+".");
		
		
		
		
	}

}
