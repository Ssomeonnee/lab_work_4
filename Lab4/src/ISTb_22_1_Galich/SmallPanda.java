package ISTb_22_1_Galich;
import java.util.Random;

public class SmallPanda extends Mammal{

    public SmallPanda(String name){

        super(name,"Малая панда", "по земле ходят плохо, кормятся преимущественно на земле, а по деревьям перебираются по лесу",
                "молодые листья, побеги бамбука, плоды, ягоды и грибы","густой, мягкий красно-коричневый мех",
                "Длина тела составляет примерно 51-64 см, хвоста — 28-48 см, самцы весят около 3,7-6,2 кг, самки — 4,2-6,0 кг. ");

    }

    @Override
    public void hunt() {
        System.out.println(
            "        ⢀⣠⣴⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣷⢰⠀⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⢋⣸⣤⣄⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀\n"+
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠿⠿⠿⠿⠟⠋⠀⠀");

        System.out.println("Охочусь...");
        Random random=new Random();
        try{Thread.sleep(random.nextInt(6)*1000);}
        catch (InterruptedException e){}
        System.out.println("Груша найдена!");
    }

    @Override
    public void describe_panda() {
        System.out.println(specie+" (Красная панда) по кличке "+name+" :");
        System.out.println("* У Красных панд "+fur);
        System.out.println("* "+size);
        System.out.println("* Красные панды "+lifestyle);
        System.out.println("* Ее рацион включает "+ration);

    }
    @Override
    public void getPhotos() {
        Reference.openReference("https://ru.pinterest.com/pin/853361829405494394/");
    }
    @Override
    public String getName(){
        return "Красная панда "+name;
    }

}
