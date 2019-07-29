package money;

public class Exchange {

    private double dollarToFrancRatio;
    private double francToDollarRatio;

    public Exchange(double dollarToFrancRatio, double francToDollarRatio){
        this.dollarToFrancRatio = dollarToFrancRatio;
        this.francToDollarRatio = francToDollarRatio;
    }

    public double getDollarToFrancRatio() {
        return dollarToFrancRatio;
    }

    public double getFrancToDollarRatio() {
        return francToDollarRatio;
    }

    public Franc dollarToFranc(Dollar dollar){
        double result = dollar.getAmount() * dollarToFrancRatio;
        return new Franc(result);
    }

    public Dollar francToDollar(Franc franc){
        double result = franc.getAmount() * francToDollarRatio;
        return new Dollar(result);
    }
}
