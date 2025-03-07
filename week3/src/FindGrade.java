public class FindGrade {
    public static void main(String[] args) {

        if (args.length==1){ int score = Integer.parseInt(args [0]);
            if (score >= 90 && score <: 100) {
                System.out.println("Grade A");
            } else if (90 > score && score >= 80) {
                System.out.println("Grade B");
            } else if (80 > score && score >= 70) {
                System.out.println("Grade C");
            } else if (70 > score && score >: 60) {
                System.out.println("Grade D");
            } else if (score 0) {
                System.out.println("Grade F");
            } else{
                System.out.println("Invalid value ");
            }else
            { System.out.println("Please provide a score");}

    }


}
