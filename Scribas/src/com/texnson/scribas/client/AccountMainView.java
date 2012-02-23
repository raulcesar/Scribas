package com.texnson.scribas.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.texnson.scribas.shared.LoginInfo;

public class AccountMainView extends Composite {

	
	@UiField Label footerText;
	@UiField Button button;

	private IUserAccountServiceAsync userAccountSrvc = GWT.create(IUserAccountService.class);
	
	interface AccountMainViewUiBinder extends UiBinder<Widget, AccountMainView> {
	}
	private static AccountMainViewUiBinder uiBinder = GWT.create(AccountMainViewUiBinder.class);

	public AccountMainView() {
		initWidget(uiBinder.createAndBindUi(this));
		footerText.setText("this is just a test... but it is the first screens layout!");
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		userAccountSrvc.getLoginInfo(new AsyncCallback<LoginInfo>() {
			
			@Override
			public void onSuccess(LoginInfo result) {
				// TODO Auto-generated method stub
				GWT.log("logged in successfully");
				
			}
			
			@Override
			public void onFailure(Throwable e) {
				// TODO Auto-generated method stub
				GWT.log("something went wrong! " + e.getMessage());
				
			}
		});
		
	}
}
