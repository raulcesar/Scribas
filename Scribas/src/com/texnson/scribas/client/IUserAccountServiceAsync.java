package com.texnson.scribas.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.texnson.scribas.shared.LoginInfo;

public interface IUserAccountServiceAsync {

	void getLoginInfo(AsyncCallback<LoginInfo> callback);

}
