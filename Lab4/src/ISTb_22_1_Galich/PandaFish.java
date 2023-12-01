package ISTb_22_1_Galich;
import java.util.Random;

public class PandaFish extends Fish {


    public PandaFish(String name){
        super(name,"Коридорас панда", 5, "Аквариумы");
    }

    public void swim(){
        System.out.println(
                "⠉\n"+
                        "⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠛⠛⠀⠀⢀⡤⠒⠋⠉⠉⠉⠓⠶⣤⡀⠀⠀⢀⡀⠀⠀⠀⠀⠠⠒⣀\n"+
                        "⠀⠀⠀⠂⠀⣴⡋⠘⠛⠀⠀⠀⠀⠀⠀⠀⠙⣶⡞⢹⡇⠀⠀⠀⠀⠀⠠⠖⠀\n"+
                        "⠀⠀⠀⠀⠀⠈⠛⢦⡀⠀⠀⠀⠀⢀⣠⡴⠊⠀⠉⠛⠃⠀⠀⠀⠀⠐\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠈⣙⠓⠒⠋⣩⠶⠚⠉⠉⠉⠉⠓⠦⣀⠀⠀⢀⠛\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢙⣶⡎⠀⠀⠀⠀⠀⠀⠀  ⠘⠁⢙⣷⠀⠈⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠋⠀⠈⠲⣤⣀⠀⠀⠀⠀ ⣀⡤⠋⠁\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠈⠉⠙⠛⠉⠁⠀⠀⠀⠀⠀");



        System.out.println("Плаваю...");
        Random random=new Random();
        try{Thread.sleep(random.nextInt(6)*1000);}
        catch (InterruptedException e){}
        System.out.println("Устал!...");
    }

    @Override
    public void describe_panda() {
        System.out.println(specie+" (порода Золотой рыбки) по кличке "+name+" :");
        System.out.println("* Место жизни - "+place_of_living);
        System.out.println("* У нее "+fin_amount+" плавников");
    }

    @Override
    public void getPhotos() {
        Reference.openReference("https://ru.pinterest.com/pin/20125529575865064/");
    }

    public String getName(){
        return "Аквариумная рыба-панда "+name;
    }

}
