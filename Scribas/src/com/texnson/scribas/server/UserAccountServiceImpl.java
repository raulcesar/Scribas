package com.texnson.scribas.server;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.texnson.scribas.client.IUserAccountService;
import com.texnson.scribas.shared.LoginInfo;

public class UserAccountServiceImpl extends RemoteServiceServlet implements IUserAccountService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public LoginInfo getLoginInfo() {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		LoginInfo loginInfo = new LoginInfo();
		if (user != null) {
			//Set LoginInfo properties for successful login.
			//TODO: If the user is logged in, then he is a valid user.
			//Need to get info from datastore. If dosen't exist, need to create new instance of user in datastore!
		      loginInfo.setLoggedIn(true);
//		      loginInfo.setEmailAddress(user.getEmail());
//		      loginInfo.setNickname(user.getNickname());
//		      loginInfo.setLogoutUrl(userService.createLogoutURL(requestUri));
		    } else {
		      loginInfo.setLoggedIn(false);
//		      String redirectUrl = requestUri;
//		      if (!GWT.isProdMode()) { 
//		    	  redirectUrl += "?gwt.codesvr=127.0.0.1:9997"; 
//		    	} 
//		      loginInfo.setLoginUrl(userService.createLoginURL(redirectUrl));
		}
		return loginInfo;
	}

}
