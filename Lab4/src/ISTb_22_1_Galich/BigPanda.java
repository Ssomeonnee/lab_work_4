package ISTb_22_1_Galich;
import java.util.Random;

public class BigPanda extends Mammal{

    public BigPanda(String name){

        super(name,"Большая панда", "живут на ветках деревьев и едят 12 часов в день",
                "японский, водяной, черный бамбук и листья - осенью","густой черно-белый мех",
                "В длину большая панда достигает 1,2–1,8 м и имеет массу 70–160 кг");

    }

    @Override
    public void hunt() {
        System.out.println(
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ ⢸⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀ \n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⢸⣿  ⠀⢀⣠⠀⠀⠀⠀⠀⠀⠀⠀ ⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⢸⣿  ⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⠷⢾⢸⣿   ⢸⣿⠀⠀⠀⠀⠀⠀⠀   \n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⣽⠆  ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀  ⢘⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀  ⢸⣿⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀ \n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀  ⢸⣿⠀⡮⠴⠶⠟⠀⠀⠀⠀⠀⠀ \n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣻⡄  ⢘⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀  ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀  ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀  ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡀  ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀  ⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        System.out.println("Охочусь...");
        Random random=new Random();
        try{Thread.sleep(random.nextInt(6)*1000);}
        catch (InterruptedException e){}
        System.out.println("Бамбук найден!");
    }

    @Override
    public void describe_panda() {
        System.out.println(specie+" (Китайская панда) по кличке "+name+" :");
        System.out.println("* У Китайских панд "+fur);
        System.out.println("* "+size);
        System.out.println("* В основном Китайские панды "+lifestyle);
        System.out.println("* Ее рацион включает "+ration);
    }
    @Override
    public void getPhotos() {
        Reference.openReference("https://ru.pinterest.com/pin/6685099438478667/");
    }

    @Override
    public String getName() {
        return "Китайская панда " + name;
    }
}
