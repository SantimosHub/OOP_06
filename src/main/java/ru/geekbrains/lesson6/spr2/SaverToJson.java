package ru.geekbrains.lesson6.spr2;

import java.io.FileWriter;
import java.io.IOException;

public class SaverToJson {
    Order newOrder;

    public SaverToJson(Order newOrder) {
        this.newOrder = newOrder;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + newOrder.getClientName() + "\",\n");
            writer.write("\"product\":\"" + newOrder.getProduct() + "\",\n");
            writer.write("\"qnt\":" + newOrder.getQnt() + ",\n");
            writer.write("\"price\":" + newOrder.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
