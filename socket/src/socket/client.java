package socket;

import java.io.*;
import java.net.*;

public class client {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Socket s = new Socket("localhost",7766);
		
		
		System.out.println("Enter a number");
		int n = Integer.parseInt(br.readLine());
		
		PrintWriter pr = new PrintWriter(s.getOutputStream(),true);
		pr.println(n);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(in.readLine());
		
		
	}

}
