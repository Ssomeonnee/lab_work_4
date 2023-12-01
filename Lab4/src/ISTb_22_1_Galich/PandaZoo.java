package ISTb_22_1_Galich;
import java.util.ArrayList;

public class PandaZoo {  // сделать сериализацию
    protected ArrayList<Pandable> list = new ArrayList<>();

    public void addPanda(Mammal panda){
        list.add(panda);
    }
    public void addPanda(Fish panda){
        list.add(panda);
    }
    public void addPanda(Ant panda){
        list.add(panda);
    }
    public void removePanda(int index){list.remove(index);}

    public void outputPanda(){ 
        int i=0;
        for (Pandable panda: list)
        {
            System.out.println(i+" "+panda.getName());
            i++;
        }
    }
    public void getMemberDescription(int index)
    {
        list.get(index).describe_panda();
    }
    public void getMemberPhoto(int index) {list.get(index).getPhotos();}

    public void makeMemberHunt()
    {
        int i=0;
        for (Pandable panda: list) {
            if (panda instanceof Mammal) {
                System.out.println(panda.getName() + " охотится");
                ((Mammal) panda).hunt();
            }
            i++;
        }
    }
    public void makeMemberSwim()
    {
        int i=0;
        for (Pandable panda: list) {
            if (panda instanceof Fish) {
                System.out.println(panda.getName() + " плавает");
                ((Fish) panda).swim();
            }
            i++;
        }
    }
    public void makeMemberBuildAntHill()
    {
        int i=0;
        for (Pandable panda: list) {
            if (panda instanceof Ant) {
                System.out.println(panda.getName() + " строит муравейник");
                ((Ant) panda).buildAnthill();
            }
            i++;
        }
    }

}
