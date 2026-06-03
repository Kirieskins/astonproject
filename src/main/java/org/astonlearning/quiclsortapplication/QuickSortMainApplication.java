package org.astonlearning.quiclsortapplication;

import java.util.ArrayList;
import java.util.List;

public class QuickSortMainApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(125, "Lada", 2022));
        cars.add(new Car(280, "Audi", 2026));
        cars.add(new Car(54, "Bmw", 1988));
        cars.add(new Car(320, "Lexus", 2023));
        cars.add(new Car(220, "Ferrari", 2021));

        Sorter sorter = new Sorter();
        sorter.simplyQuickSort(cars);
        sorter.parallelQuickSort(cars);

        for (Car car : cars) {
            System.out.println(car.getModel() + " - " + car.getPower() + " - " + car.getProductionYear());
        }
    }
}
