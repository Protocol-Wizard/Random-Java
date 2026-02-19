import java.util.Scanner;
class Heisenberg{
    public static void main(String[] args){
        System.out.print("Say my name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String name1 = "heisenberg";
        String name2 = name.toLowerCase();
        boolean isequal1 = (name2).equals(name1);
        if (isequal1){
            System.out.println("You're goddamn right.");
        } else {
            System.out.println("You're goddamn wrong.");
        }
    }
}