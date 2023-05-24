package ru.geekbrains.lesson6.dip;

import java.util.List;

public class PrintReport2 implements IntPrint {

    public void output(List<ReportItem> items) {
        System.out.println("Output to printer2");
        for (ReportItem item : items) {
            System.out.format("Report2 %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

    @Override
    public void printer(List<ReportItem> items) {
        output(items);

    }

}
