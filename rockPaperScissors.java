import java.util.Random;
	public class rockPaperScissors {
	    Random r = new Random();
	    private int  wins, losses, tie,compPick, usPick;
	    private String computerPick, userPick, nameWinner;
	    
	    rockPaperScissors(){
	    	compPick = 0;
	    	usPick = 0;
	    	
	        userPick = null;
	        computerPick = null;
	        nameWinner = "";
	        wins = 0;
	        losses = 0;
	        tie = 0;
	    }
	      
	    public void reset(){
	    		wins = 0;
		        losses = 0;
		        tie = 0;
	    }
	    
	    public void setPlayer(int p){	
	       if(p == -1) {
	    	   usPick = p;
	       }
	       else if(p >= 1 && p <= 3) {
	    	   usPick = p;
	       }
	       else {
	    	   System.out.println("Entry not valid");
	       }
	    }
	      
	    public void setPlayerCharacter() {
	    	 if(usPick == 1)
		            userPick = "Rock";
		     if (usPick == 2)
		            userPick = "Paper";
		     if (usPick == 3)
		            userPick = "Scissors";
		       
	    }
	    public int getComp(){
	    	compPick = r.nextInt(3+ 1);
	    	if(compPick ==0) compPick = 1; // in the case compPick was 0
	    	
	        return compPick;
	    }
	    
	    public void setComputerCharacter() {
	    	 if(compPick == 1)
		            computerPick = "Rock";
		     if (compPick == 2)
		           computerPick = "Paper";
		     if (compPick == 3)
		            computerPick = "Scissors";
	    }
	   
	    public String determineWinner(){
	    	getComp(); //compPick
	    	setComputerCharacter(); //computerPick
	    	setPlayerCharacter(); //userPick
	    	
	    	//when user pick is -1 -> exit
	    if(usPick == -1) return printStats(); //only printing stats after user inputs -1
	    	
	    	if(compPick == usPick) { //ties
	    		nameWinner = "computer picked " + computerPick +", you picked " + userPick + " - tie" ;
	    		tie++;
	    	}
	    	if(compPick == 1 && usPick == 3 || compPick == 2 && usPick == 1 ||compPick == 3 && usPick == 2){ //loses
	    		nameWinner = "computer picked " + computerPick +", you picked " + userPick + " - you lost" ;
	    		losses++;
	    	}
	    	if(compPick == 2 && usPick == 3 || compPick == 1 && usPick == 2 ||compPick == 3 && usPick == 1){ //wins
	    		nameWinner = "computer picked " + computerPick +", you picked " + userPick + " - you won !" ;
	    		wins++;
	    	}	
	    		
	       return nameWinner;
	    }
	 
	      
	    public String printStats(){
	    	Integer.toString(tie);
	    	Integer.toString(wins);
	    	Integer.toString(losses);
	        return "Wins: "+ wins + "\nLosses: " + losses + "\nTies: " + tie ;
	    }
	}