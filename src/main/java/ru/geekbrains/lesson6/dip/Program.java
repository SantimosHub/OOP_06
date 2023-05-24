package ru.geekbrains.lesson6.dip;

import java.util.List;

public class Program {

    //TODO: (2 задание ) Доработать самостоятельно
    public static void main(String[] args) {
        PrintReport printReport = new PrintReport();
        PrintReport2 printReport2 = new PrintReport2();
        PrintReport3 printReport3 = new PrintReport3();
        Report report = new Report();
        List<ReportItem> items = report.calculate();
        report.printer(items, printReport);
        report.printer(items, printReport2);
        report.printer(items, printReport3);


//        printReport.printer(report.calculate());
//        printReport2.printer(report.calculate());
//        printReport3.printer(report.calculate());


    }

}
