import javax.sound.midi.Soundbank;
import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Cat extends Animal{
     public static int COUNT;

     public Cat(String name){
          this.name = name;
          COUNT++;
          System.out.println("Создан " + COUNT + "й кот");
     }

     @Override
     public void swim(int distation) {
          System.out.println(name + " не умеет плавать.");
     }

     @Override
     public void run(int distation) {
          if (distation <= 200){
               super.run(distation);
          } else {
               System.out.println(name + " столько не пробежит.");
          }


     }
}
