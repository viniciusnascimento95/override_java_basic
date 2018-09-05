/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author vinicius.souza
 */
public class Cat extends Animal {

    @Override
    public void Name() {
        System.out.println("Gato");
    }

    @Override
    public void Colour() {
        System.out.println("Branco");
    }

    @Override
    public void Sound() {
        System.out.println("Miallll");
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String Sound) {
        this.Sound = Sound;
    }

}
