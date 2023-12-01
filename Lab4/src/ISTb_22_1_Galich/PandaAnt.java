package ISTb_22_1_Galich;
import java.util.Random;

public class PandaAnt extends Ant {

    public PandaAnt(String name, String position){
        super(name,"Муравей Панда",position, "Латиская Америка");

    }
    @Override
    public void buildAnthill()
    {
        System.out.println(
                "⠀⠀⠀⠀  ⡆⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⢠⣷⡀⠀⠀⠀⠀⣰⣧⣀⣠⣴⣶⣶⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⣾⣿⣿⣆⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⢰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀"+
                        "⠀⠀⢤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣤⣶⣶⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠶⠆⠀\n"+
                        "⡠⠤⠔⠒⠊⣩⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠁⠀⠀\n⠀"+
                        "⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⡿⠏⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠚⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠘⠻⣿⣿⣿⡿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠘⢿⡿⠃⠀⠀⠙⠻⣿⠛⠛⠻⠿⠿⢷⡀⠀⠀⠀⠀⠀⠀⠀\n"+
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠇⠀⠀⠀⠀⠀⠘⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀\n");

        System.out.println("Несу лист...");
        Random random=new Random();
        try{Thread.sleep(random.nextInt(6)*1000);}
        catch (InterruptedException e){}
        System.out.println("Отнес!...");
    }

    @Override
    public void describe_panda() {
        System.out.println(specie+" (разновидность бархатных муравьёв) по кличке "+name+" :");
        System.out.println("* "+region+" - основной регион их распространения");
        System.out.println("* Занимаемая должность в муравейнике - "+position);
    }

    @Override
    public void getPhotos() {
        Reference.openReference("https://ru.pinterest.com/pin/830069775047305235/");
    }

    public String getName(){
        return "Муравей-панда "+name;
    }

}
