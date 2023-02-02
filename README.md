# HomeWork_1
## Sales management automation

### Начало работы

Введите ряд значений продаж произвольной длины в классе Main для передачи его конструктору класса SalesMAnager:
```Java
SalesManager salesManager = new SalesManager(new int[]{0, 2, 3})
```

### Функционал

1. Из введенного ряда значений будет выбрано максимальное значение в классе SalesManager:
```Java
public int max(int[] sales) {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```
2. Также из введенного ряда значений будет выбрано минимальное значение в классе SalesManager:
```Java
public long min(long[] sales){
        long min=0;
        for(long sale:sales){
        if(sale<min){
        min=sale;
        }
        }
        return min;
}
```
3. В итоге из введенного ряда значений будет рассчитано среднее количество продаж среди всех продаж, за исключением самой максимальной и самой минимальной в классе SalesManager:
```Java
public long medium(long[] sales) {
        long medium = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < sales.length; i++) {
        if (sales[i] > min(sales) && sales[i] < max(sales)) {
        sum += sales[i];
        j++;
        }
        }
        medium = sum / j;
        return medium;
}
```
        
    
### Результат

Максимальное, минимальное и обрезанное среднее значения продаж будет выведены на консоли:
```Java
System.out.println(salesManager.max(salesManager.sales));
System.out.println(salesManager.min(salesManager.sales));
System.out.println(salesManager.medium(salesManager.sales));
```
