/**
 * Created by Sai Lalith Pathi on 23-May-17.
 */
class Students {
    private int regNum;
    private String name;
    public void display(){
        if(name.equals("Zoom")){
            System.out.println("Zoom Bro !");
        }
        else {
            System.out.println(getName() + "  " + getRegNum());
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
        stud[1].setName("I");
        stud[1].setregNum(456);
        for(int i=0;i<stud.length;i++){
            stud[i].display();
        }
    }
}
