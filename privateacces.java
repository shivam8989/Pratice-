package OOPs;
import java.util.*;
class student{
    String name ;
    private String passWord;

    public String getPassWord(){

        return this.passWord;
    }
    public void setPassWord(String pass){
        this.passWord = pass;
    }
}
public class privateacces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        student s1 = new student();
        s1.name = sc.nextLine();
        s1.setPassWord("shiam123");
        System.out.println(s1.getPassWord());
    }
}
