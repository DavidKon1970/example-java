package serializable;

import java.io.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {

        int size = 200;
        int[] array = new int[size];

        for (int index = 0; index < size; index++) {
            int item = new Random().nextInt(1000);
            array[index] = item;
            System.out.println("array["+ index + "] = " + item);
        }

        try (BufferedWriter out = new BufferedWriter(new FileWriter("D:\\trial.txt"));
             ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
             ObjectOutputStream objsOut = new ObjectOutputStream(bytesOut)) {
            // in here value will be written
            for (int index = 0; index < size; index++) {
                objsOut.writeObject(array[index]);
            }
            // ToDo
            // Исправления
            //out.write();
            // Новый код
            // Новый код 1
            // Новый код 2
            System.out.print("Write Successful");
        } catch (IOException e1) {
            System.out.println("Error during reading/writing");
        }
    }

}
