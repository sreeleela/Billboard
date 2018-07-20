package edu.sdsu.cs645.Billboard.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("billboard")
public interface BillboardService extends RemoteService {
	String validateLogin(String s) throws IllegalArgumentException;
	String save(String s) throws IllegalArgumentException;
	String load() throws IllegalArgumentException;
}
