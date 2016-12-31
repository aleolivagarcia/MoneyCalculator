package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.model.Currency;

public class Main{
    
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame(currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay()));
    }

    private static Currency[] currencies() {
        return new Currency[]{
            new Currency("USD", "Dólar USA", "$"),
            new Currency("CAD", "Dólar Canadá", "$"),
            new Currency("GBP", "Libra esterlina", "£")
        };
    }
    
}