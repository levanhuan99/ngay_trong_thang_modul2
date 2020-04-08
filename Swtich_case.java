import java.util.Scanner;

public class Swtich_case {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("thich tinh thang may?");
        int month=scanner.nextInt();
        String daysinMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysinMonth="31 days";

                break;
            case 2:
                daysinMonth=" 28 or 29 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
               daysinMonth="30 days";
                break;
            default:
                daysinMonth="invalid input";
                break;
        }
        System.out.println(daysinMonth);



    }
}
