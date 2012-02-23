package com.texnson.scribas.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AccountList extends Composite {

	private static AccountListUiBinder uiBinder = GWT.create(AccountListUiBinder.class);

	interface AccountListUiBinder extends UiBinder<Widget, AccountList> {
	}

	public AccountList() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	

}
