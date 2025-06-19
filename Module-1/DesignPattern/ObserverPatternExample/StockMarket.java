package ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(double price) {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers(price);
    }
}
