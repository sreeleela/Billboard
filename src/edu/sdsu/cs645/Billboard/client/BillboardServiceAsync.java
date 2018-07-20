package edu.sdsu.cs645.Billboard.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>BillboardService</code>.
 */
public interface BillboardServiceAsync {
	void validateLogin(String s, AsyncCallback<String> callback) throws IllegalArgumentException;
	void save(String s,AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void load(AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
