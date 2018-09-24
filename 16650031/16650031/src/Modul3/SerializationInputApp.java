/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LAB_TI
 */
public class SerializationInputApp {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa data yang ingin dimasukkan");
        int data = input.nextInt();
        String firstName = null;
        String lastName = null;
        int age = 0;

        for (int i = 0; i < data; i++) {
            System.out.println("Nama Awal : ");
            firstName = input.next();
            System.out.println("Nama Akhir : ");
            lastName = input.next();
            System.out.println("Umur : ");
            age = input.nextInt();
            participants.add(new Participant(firstName, lastName, age));
        }

        System.out.println("Participant : "+participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "d:participantData.ser");
        System.out.println("Serialisasi berhasil");

        System.out.println("Deserialisasi Objek...");
        List<Participant> newList = demo.deserialize("d:participantData.ser");
        System.out.println("New List: "+newList);
    }
}
