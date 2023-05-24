package ru.geekbrains.lesson6.dip;

import java.util.List;

public class PrintReport3 implements IntPrint {

    public void output(List<ReportItem> items) {
        System.out.println("Output to printer3");
        for (ReportItem item : items) {
            System.out.format("Report3 %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

    @Override
    public void printer(List<ReportItem> items) {
        output(items);

    }

}
