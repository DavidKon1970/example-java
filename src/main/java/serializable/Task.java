package serializable;

import java.awt.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;
import java.io.*;

class Task {
    public static void main(String[] args) throws IOException {
        final int size = 200;

        int[] array = new int[size];

        for (int index = 0; index < size; index++) {
            int item = new Random().nextInt(1000);
            System.out.println("array["+ index + "] = " + array[index]);
            array[index] = item;
        }
        System.out.printf("array size: %d%n", sizeOf(array));
    }

    static int sizeOf(Serializable obj) throws IOException {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        ObjectOutputStream objsOut = new ObjectOutputStream(bytesOut);
        objsOut.writeObject(obj);
        return bytesOut.toByteArray().length;
    }

}
