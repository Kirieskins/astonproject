package org.astonlearning.quiclsortapplication;

public class Car implements Comparable<Car> {
    private int power;
    private String model;
    private int productionYear;

    public Car(int power, String model, int productionYear) {
        this.power = power;
        this.model = model;
        this.productionYear = productionYear;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(Car o) {
        int powerComparison = Integer.compare(this.power, o.power);
        if (powerComparison != 0) {
            return powerComparison;
        }
        
        int modelComparison = this.model.compareTo(o.model);
        if (modelComparison != 0) {
            return modelComparison;
        }
        
        return Integer.compare(this.productionYear, o.productionYear);
    }
}
