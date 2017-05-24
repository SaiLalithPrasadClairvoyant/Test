/**
 * Created by Sai Lalith Pathi on 23-May-17.
 */
public class Students {
    int regNum;
    String name;
    public Students(int i, String pure) {
        this.name = pure;
        this.regNum = i;
    }
    public void display(){
        System.out.println(name + "  " +regNum);
    }
    public static void main(String args[]){
        Students students = new Students(123,"zoom");
        students.display();
    }
}
