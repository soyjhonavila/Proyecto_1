package Proyecto1_F_E_D;

import java.io.*;

public class Sequence_y_motif {

	/**
	 * Determine the next one that becomes greater
	 */
	public int ocurrences =Integer.MIN_VALUE;
	/**
	 * Motif winner
	 */
	public String winner_motif ="";
	/**
	 * sequences of occurrences that report and number of occurrences that has
	 * 
	 * @param motif
	 * @return
	 */
	public int countOcurrences (String motif)
	{
		int counter =0;
		try 
		{
			FileReader file = new FileReader("sequence.txt");
			BufferedReader br = new BufferedReader(file);
			
			String sequence = br.readLine();
			int length = motif.length();
			
			
			while (sequence != null)
		    {
				
				for (int i = 0; i < sequence.length() - length +1; i++)
				{
					if (sequence.substring(i, i + 3).equals(motif))      //Substrates of the same size as the motif
					{
						counter += 1;
						
						i+= length-1;
					}	
					
				}
				
				sequence=br.readLine(); 
				
		    }
		}    
		catch(Exception ex)
		{ 
			
		}	
		return counter;
   }
	   /**
	    * verify candidate
	    * 
	    * @param motif
	    */
	   public void verifiqueCandidate (String motif )
	   {
		       int temp =countOcurrences(motif);
		
		            if(temp>ocurrences)                   //comparison to determine number of occurrences
		           {
			            this.winner_motif = motif ;
			            this.ocurrences=temp;
		           }
	   }
	/**
	 * Combinations possible
	 *    
	 * @param sebsequence
	 * @param size
	 */
	public void  getCombinations (String sebsequence,int size)
	{
		String tempSequence ;	
		if (size ==1)                                               
		      {
			      tempSequence = sebsequence + "A";
			      verifiqueCandidate(tempSequence);
			
			      tempSequence = sebsequence + "C";
			      verifiqueCandidate(tempSequence);          // for each chromosome number of times that
			                                                 // // the motif appears
			      tempSequence = sebsequence + "G";
			      verifiqueCandidate(tempSequence);
			
			      tempSequence = sebsequence + "T";
			      verifiqueCandidate(tempSequence);
		      }   else
		              {
			             getCombinations(sebsequence+ "A", size -1);
			             getCombinations(sebsequence+ "C", size -1);
			             getCombinations(sebsequence+ "G", size -1);
			             getCombinations(sebsequence+ "T", size -1);
		              }
	 }
}
