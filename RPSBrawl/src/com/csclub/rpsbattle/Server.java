package com.csclub.rpsbattle;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	private int portNumber;
	private ServerSocket serverSocket;
	private boolean shouldRun;

	public Server(int port) {
		port = portNumber;
	}

	public void start() throws Exception {
		shouldRun = true;
		serverSocket = new ServerSocket(portNumber);

		while (shouldRun && !serverSocket.isClosed()) {
			Socket connection = serverSocket.accept();
			PrintWriter out = new PrintWriter(connection.getOutputStream(),
					true);
			Scanner in = new Scanner(new InputStreamReader(
					connection.getInputStream()));
			
		}
	}

}
