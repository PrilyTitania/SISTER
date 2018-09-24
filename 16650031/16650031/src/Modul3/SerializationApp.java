/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LAB_TI
 */
public class SerializationApp {

    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Dee", "aja", 22));
        participants.add(new Participant("Ami", "Fahmi", 21));
        participants.add(new Participant("Haya", "Hayati", 20));
        participants.add(new Participant("Aya", "Hayati", 19));

        System.out.println("Participant : "+participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "d:participantData.ser");
        System.out.println("Serialisasi berhasil");

        System.out.println("Deserialisasi Objek...");
        List<Participant> newList = demo.deserialize("d:participantData.ser");
        System.out.println("New ListL: "+newList);
    }
}
