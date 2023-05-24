package ru.geekbrains.lesson6.dip;

import java.util.ArrayList;
import java.util.List;

public class Report {

    protected List<ReportItem> items;    // Отчетные данные
    protected IntPrint intPrint;

    // расчет отчетных данных
    public List<ReportItem> calculate() {
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
        return items;
    }


    void printer(List<ReportItem> items, IntPrint intPrint) {

        intPrint.printer(items);

    }
}





