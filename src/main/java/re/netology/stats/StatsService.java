package re.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {  // месяц с наименьшим количеством продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;

    }

    public int maxSales(long[] sales) {  // месяц с наивысшим количеством продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public long allSales(long[] sales) {  // сумма всех продаж
        long all = 0;

        for (int i = 0; i < sales.length; i++) {
            all = all + sales[i];
        }
        return all;
    }


    public long middleSales(long[] sales) { // средняя сумма продаж

        return allSales(sales) / sales.length;
    }

    public long maxMiddleSales(long[] sales) {  // количество месяцев с продажами ниже среднего
        int months = 0;
        long avg = middleSales(sales);

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > avg) {
               months = months + 1;
            }
        }
        return months;
    }

    public long minMiddleSales(long[] sales) {  // количество месяцев с продажами ниже среднего
        int months = 0;
        long avg = middleSales(sales);

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < avg) {
                months = months + 1;
            }
        }
        return months;

    }
}

//    сумму всех продаж; +
//    среднюю сумму продаж в месяц; +
//    номер месяца, в котором был пик продаж; +
//    номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*; +
//    количество месяцев, в которых продажи были ниже среднего (см. п.2);
//    количество месяцев, в которых продажи были выше среднего (см. п.2).