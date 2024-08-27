package com.example.BankAccountTracker;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	// Passed Test
	@Test
	public void testDeposit() {

		BankAccount account = new BankAccount(100);

		account.deposit(50);

		assertEquals(150, account.getBalance(), 0.001);

	}

	// Passed Test
	@Test
	public void testWithdraw() {

		BankAccount account = new BankAccount(100);

		account.withdraw(50);

		assertEquals(50, account.getBalance(), 0.001);

	}

	// Failed Test as the current balance is 150 which doesn't matches with 200

	@Test
	public void testDepositFail() {

		BankAccount account = new BankAccount(100);

		account.deposit(50);

		assertEquals(200, account.getBalance(), 0.001);

	}

}
