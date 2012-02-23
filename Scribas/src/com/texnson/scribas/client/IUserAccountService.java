package com.texnson.scribas.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.texnson.scribas.shared.LoginInfo;

@RemoteServiceRelativePath("userAccountService")
public interface IUserAccountService extends RemoteService {
	public LoginInfo getLoginInfo();
}
