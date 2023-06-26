import java.util.Scanner;

public class athlete{
    int[] n = new int[22];
    int [] ts = new int[5];
    String rating = "";
    int m = 0;

    public static void main(String[] args){
        athlete a = new athlete();

        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to Sport Concussion Assessment System");
        System.out.print("\n\nPlease select one of the following options");
        System.out.println("\n\t 1.Enter symptoms");
        System.out.println("\t 2.Display symptoms summary");
        System.out.println("\t 3.Am I at risk?");
        System.out.println("\t 4.Exit");
    while(true) {
        int type = scan.nextInt();
        if (type == 1) {
            a.entersymptoms();
        } else if (type == 2) {
            a.seesummary();
        }else if (type ==3){
            a.riskyconditionindicator();
        } else if (type ==4) {
            System.exit(0);
        } else {
            System.out.println("\n Please enter 1-4.");
        }
    }
    }
    public void entersymptoms(){
        //int[] n = new int[22];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please score yourself on the following symptoms on a scale from 0(no pain) to 6(severe pain)");
        System.out.println("Headache: ");
        n[0] = scan.nextInt();
        System.out.println("Pressure in head: ");
        n[1] = scan.nextInt();
        System.out.println("Neck Pain: ");
        n[2] = scan.nextInt();
        System.out.println("Nausea or Vomiting: ");
        n[3] = scan.nextInt();
        System.out.println("Dizziness: ");
        n[4] = scan.nextInt();
        System.out.println("Blurred Vision: ");
        n[5] = scan.nextInt();
        System.out.println("Balance Problems: ");
        n[6] = scan.nextInt();
        System.out.println("Sensitivity to light: ");
        n[7] = scan.nextInt();
        System.out.println("Sensitivity to noise: ");
        n[8] = scan.nextInt();
        System.out.println("Feeling slowed down: ");
        n[9] = scan.nextInt();
        System.out.println("Feeling like in a fog: ");
        n[10] = scan.nextInt();
        System.out.println("Don't feel right: ");
        n[11] = scan.nextInt();
        System.out.println("Difficulty concentrating: ");
        n[12] = scan.nextInt();
        System.out.println("Difficulty Remembering: ");
        n[13] = scan.nextInt();
        System.out.println("Fatigue or low energy: ");
        n[14] = scan.nextInt();
        System.out.println("Confusion: ");
        n[15] = scan.nextInt();
        System.out.println("Drowsiness: ");
        n[16] = scan.nextInt();
        System.out.println("Trouble falling asleep: ");
        n[17] = scan.nextInt();
        System.out.println("More Emotional: ");
        n[18] = scan.nextInt();
        System.out.println("Irritability: ");
        n[19] = scan.nextInt();
        System.out.println("Sadness: ");
        n[20] = scan.nextInt();
        System.out.println("Nervous or anxious: ");
        n[21] = scan.nextInt();
        System.out.println("Please press 2 if you want to see the summary");

    }
    public void seesummary() {

        //total number and severity score
        Scanner scan = new Scanner(System.in);
        //int[] n = new int[22];
        //int num = scan.nextInt();//
        //int [] ts = new int[5];//
        int num=22;
        int totalnumber = 0;
        int totalscore = 0;
        int diff = 0;
        for (int i = 0; i < num; i++) {
            totalscore = totalscore + n[i];
            if (n[i] > 0) {
                totalnumber = totalnumber + 1;
            }
        }

        System.out.printf("Total Number Of Symptoms: %d",totalnumber);
        System.out.printf("\nSymptom Severity Score: %d",totalscore);

        // display overallrating
        // define array store the score difference.
        if(m<5){
            ts[m]=totalscore;
            m=m+1;
        } else {
            ts[0]=ts[1];
            ts[1]=ts[2];
            ts[2]=ts[3];
            ts[3]=ts[4];
            ts[4]=totalscore;
        }

        if(m > 1 && m < 5) {
            diff = totalscore - ts[m - 2];
        } else if(m==5){
            diff = totalscore-ts[3];
        }
        if(m>1){
            //String rating = "";
            if (Math.abs(diff) < 3 && totalscore < 10) {
                rating = "No Difference";
            } else if (Math.abs(diff) >= 3 || totalscore >= 15) {
                rating = "Very Different";
            } else if (Math.abs(diff) < 3 && totalscore >= 10) {
                rating = "Unsure";
            }
            //System.out.printf("\n Diff is %d", diff); // test
            System.out.printf("\nOverall Rating Is: %s\n", rating);
        }
        else {
            System.out.println("\nNo over rating since no previous data.\n");
        }

        System.out.println("\nPlease press 3 for risky condition indicator.");
    }
    public void riskyconditionindicator(){


        if (rating.equals("No Difference")){
            System.out.printf("\33[42;1m" + "Overall Rating Is: %s", rating+ "\33[0m\n");
        }else if (rating.equals("Unsure")){
            System.out.printf("\33[43;1m" + "Overall Rating Is: %s", rating+ "\33[0m\n");
        }else if(rating.equals("Very Different")){
            System.out.printf("\33[41;1m" + "Overall Rating Is: %s", rating+ "\33[0m\n");
        } else{
            System.out.printf("\33[44;1m" + "No over rating since no previous data." + "\33[0m\n");
        }

        System.out.println("Please press 1 if you want to enter the symptoms.");
        System.out.println("Please press 4 if you want to exit.");

    }
}
