package ru.geekbrains.lesson6.spr2;

public class Program {

    //DO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        SaverToJson saveToJson = new SaverToJson(order);
        SaverToXml saveToXml = new SaverToXml(order);
        order.inputFromConsole();
        saveToJson.saveToJson();
        saveToXml.saveToXml();
    }

}
