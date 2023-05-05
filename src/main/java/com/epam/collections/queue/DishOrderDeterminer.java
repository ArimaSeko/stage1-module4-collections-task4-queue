package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<numberOfDishes;i++){
            list.add(i*everyDishNumberToEat%numberOfDishes);
        }
        return list;
    }
}
