package ru.geekbrains.lesson6.dip;

import java.util.List;

public class PrintReport implements IntPrint {

    public void output(List<ReportItem> items) {
        System.out.println("Output to printer1");
        for (ReportItem item : items) {
            System.out.format("Report1 %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

    @Override
    public void printer(List<ReportItem> items) {
        output(items);

    }
}
