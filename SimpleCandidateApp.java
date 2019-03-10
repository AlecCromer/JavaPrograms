import java.text.DecimalFormat;
import java.util.Scanner;;


//application takes an input of a specific number of candidates as well as their number of votes.
// The application then displays the winner as well as their percentage of the total votes
public class SimpleCandidateApp {


	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("#.00");

	        int allVotes =0;
	        int mostVotes =0;
	        String winner="";

	        // creates two arrays for a specific number of candidates
			int NumOfCandidates = 5;
	        String[] candidates = new String [NumOfCandidates];
	        int [] votes = new int [NumOfCandidates];


	        for(int i=0;i<candidates.length;i++) // runs through to get each candidates info and votes
	        {
	            System.out.println("Candidate "+(i+1));
	            System.out.println("Please enter the name of the Candidate");
	            String a=scan.next();
	            candidates[i]=a;
	            System.out.println("Please enter the amount of votes they received");
	            int b=scan.nextInt();
	            votes[i]=b;
	            allVotes=allVotes+b;
	        }


	        for(int i=0;i<candidates.length;i++) //calculates the winner
	        {
	            System.out.println("Name : "+candidates[i]);
	            System.out.println("Votes : "+votes[i]);


	            if(votes[i]>mostVotes) //checks if candidates has the most votes
	            {
	                mostVotes=votes[i];
	                winner=candidates[i];
	            }

	            //Percentage of votes for one individual compared to the total number of votes
	            double percentage=((double)votes[i]/(double)allVotes)*100;

	            System.out.println("Percentage : "+df.format(percentage)+"%");

	        }

			System.out.println("The winner of the election is: "+winner);
	    }
	}



