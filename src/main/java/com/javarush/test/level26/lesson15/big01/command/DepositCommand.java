package com.javarush.test.level26.lesson15.big01.command;


import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;

class DepositCommand implements Command {

    @Override
    public void execute() {
        String currencyCode = ConsoleHelper.askCurrencyCode();
        String[] den = ConsoleHelper.getValidTwoDigits(currencyCode);
        CurrencyManipulator currencyManipulator = new CurrencyManipulator(currencyCode);
    }
}
