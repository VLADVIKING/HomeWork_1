# HomeWork_1
## Sales management automation

### Начало работы

Введите ряд значений продаж произвольной длины в классе Main для передачи его конструктору класса SalesMAnager:
```Java
SalesManager salesManager = new SalesManager(new int[]{0, 2, 3})
```

### Функционал

Из введенного ряда значений будет выбрано максимальное значение в лкассе SalesManager:
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
    
### Результат

Максимальное значение продаж будет выведено на консоли:
```Java
System.out.println(salesManager.max(salesManager.sales));
```
