import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Sai Lalith Pathi on 23-May-17.
 */
class Students extends People{
    Zoom in and out !
    private int regNum;
    private String name;
    static ArrayList<String> strings = new ArrayList<>();
    static HashMap<Integer,String> pairs = new LinkedHashMap<>();
    private void display(){
        if(name.equals("Zoom")){
            System.out.println("Zoom Bro !");
        }
        else {
            System.out.println(getName() + "  " + getRegNum() +" "+getGender());
        }
    }
    public int getRegNum(){
        return regNum;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setregNum(int regNum) {
        this.regNum = regNum;
    }
    public static void main(String args[]){
        Students[] stud = new Students[2];
        stud[0] = new Students();
        stud[1] = new Students();
        stud[0].setName("H");
        stud[0].setregNum(123);
        stud[0].setGender("Female");
        stud[1].setName("I");
        stud[1].setregNum(456);
        stud[1].setGender("Male");
        for(int i=0;i<stud.length;i++){
            pairs.put(stud[i].getRegNum(),stud[i].getName());
            strings.add(stud[i].getName());
            stud[i].display();
        }
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        for(Map.Entry<Integer, String> hm:pairs.entrySet()){
            System.out.println("Value:"+hm.getValue() +" Key:"+hm.getKey());
        }
    }
}
