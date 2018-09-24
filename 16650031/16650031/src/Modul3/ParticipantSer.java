/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author LAB_TI
 */
public class ParticipantSer implements Serializable{

    private String firstName;
    private String lastName;
    private int age;

    public ParticipantSer(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printData(){
        System.out.println("Nama\t: "+firstName+" "+lastName);
        System.out.println("Umur\t: "+age);
    }

    public void saveObject(ParticipantSer obj){
        try {
            FileOutputStream fos = new FileOutputStream("d:data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println("terjadi kesalahan saat serialisasi.\n"+e.getMessage());
        }
    }
    
    public void readObject(ParticipantSer obj){
        try {
            FileInputStream fis = new FileInputStream("d:data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (ParticipantSer) ois.readObject();
            obj.printData();
            fis.close();
        } catch (Exception e) {
            System.out.println("terjadi kesalahan saat deserialisasi\n"+e);
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        ParticipantSer is = new ParticipantSer("Dee", "aja", 22);
        is.saveObject(is);
        is.readObject(is);
    }
}
