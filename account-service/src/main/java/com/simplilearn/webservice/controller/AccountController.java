package com.simplilearn.webservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.webservice.entity.Account;

@RestController
public class AccountController {




	@GetMapping("/accounts")
	List<Account> listAccount() {
		List<Account> list = new ArrayList<Account>();
		list.add(new Account(101, "Mike"));
		list.add(new Account(102, "David"));
		list.add(new Account(103, "William"));
		return list;
	}

}
