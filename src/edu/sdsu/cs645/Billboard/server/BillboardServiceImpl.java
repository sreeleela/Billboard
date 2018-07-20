package edu.sdsu.cs645.Billboard.server;
import java.io.*;
import edu.sdsu.cs645.Billboard.client.BillboardService;
import edu.sdsu.cs645.Billboard.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class BillboardServiceImpl extends RemoteServiceServlet implements BillboardService {

	public String validateLogin(String s) throws IllegalArgumentException {
		if(s.equals("sp2017")) return "OK";
		return "INVALID";
	}
	public String save(String s) throws IllegalArgumentException {
		String path = getServletContext().getRealPath("/");
		String filename = path + "/data.txt";
		try {
			PrintWriter out = new PrintWriter(
					new FileWriter(filename));
					s = s.replaceAll("\r\n|\n","<br />");
					out.print(s);
					out.close();
		}
		catch(Exception e) {
			return "Sorry, ERROR "+e;
		}
		return "OK, SUCCESS";
	}
	public String load() {
		String path = getServletContext().getRealPath("/");
		String filename = path + "/data.txt";
		String answer = "";
		String line;
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader(filename));
			while((line = reader.readLine()) != null)
				answer+=line;
			reader.close();
		}
		catch(Exception e) {
			return "Failed to read file "+ filename;
		}
		return answer;
	}
}
