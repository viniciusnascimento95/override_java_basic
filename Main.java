/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

import java.util.Scanner;

/**
 *
 * @author vinicius.souza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner
        Scanner sc = new Scanner(System.in);
        Cat c = new Cat();
        Dog d = new Dog();
        Bee b = new Bee();
        Elephant e = new Elephant();
        System.out.print("Enter the cat's name : ");
        c.setName(sc.nextLine());
        System.out.print("Enter the cat's colour : ");
        c.setColour(sc.nextLine());
        System.out.print("Enter the cat's sound: ");
        c.setSound(sc.nextLine());
        System.out.print("Enter the dog's name : ");
        d.setName(sc.nextLine());
        System.out.print("Enter the dog's colour: ");
        d.setColour(sc.nextLine());
        System.out.print("Enter the dog's sound: ");
        d.setSound(sc.nextLine());

        System.out.print("Enter the bee's name : ");
        b.setName(sc.nextLine());
        System.out.print("Enter the bee's colour: ");
        b.setColour(sc.nextLine());
        System.out.print("Enter the bee's sound: ");
        b.setSound(sc.nextLine());

        System.out.print("Enter the Elephant's name : ");
        e.setName(sc.nextLine());
        System.out.print("Enter the Elephant's colour: ");
        e.setColour(sc.nextLine());
        System.out.print("Enter the Elephant's sound: ");
        e.setSound(sc.nextLine());

        System.out.println("######   #######      ########      #########");
        System.out.println("Information Registry Cat");
        System.out.println("Name cat:" + c.getName());
        System.out.println("Colour cat:" + c.getColour());
        System.out.println("Sound cat:" + c.getSound());

        System.out.println("######   #######      ########      #########");
        System.out.println("Information Registry Dog");
        System.out.println("Name Dog:" + c.getName());
        System.out.println("Colour Dog:" + c.getColour());
        System.out.println("Sound Dog:" + c.getSound());

        System.out.println("######   #######      ########      #########");
        System.out.println("Information Registry Bee");
        System.out.println("Name Bee:" + c.getName());
        System.out.println("Colour Bee:" + c.getColour());
        System.out.println("Sound Bee:" + c.getSound());

        System.out.println("######   #######      ########      #########");
        System.out.println("Information Registry Elephant");
        System.out.println("Name Elephant:" + c.getName());
        System.out.println("Colour Elephant:" + c.getColour());
        System.out.println("Sound Elephant:" + c.getSound());

    }

}
