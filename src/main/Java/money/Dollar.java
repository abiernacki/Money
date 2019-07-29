package money;

public class Dollar extends Money {


    public Dollar(double amount) {
        super(amount);
    }

    public void add(Dollar dollar){
        amount += dollar.getAmount();
    }

    public  void add(Franc franc, Exchange exchange){
        Dollar dollar = exchange.francToDollar(franc);
        amount += dollar.getAmount();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dollar){
            Money value = (Money)obj;
            return value.amount == amount;
        }
        return false;
    }
}
