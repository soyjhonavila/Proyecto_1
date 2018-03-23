package Proyecto1_F_E_D;

import java.io.*;
import java.util.Random;


/**
 * <p>
 * Search class causes bioinformatics motive
 *  
 * </p>
 * <p>
 * The class contains the methods and functions necessary to:
 * <ul>
 * <li> Show each of the attributes of a particular instance of a genetic sequence
 * </li> 
 * <li>Segment of genetic sequences 
 * <li>Search of the employer (motif) that appears
 * </ul>
 * </p>
 *  
 * @author Jhon Avila
 * @since 17/march/2018
 *
 */
       public class CreatedateSet 
{
              
    	      /**
    	       * getNeucleotide
    	       * 
    	       * @param random
    	       * @return
    	       */
              public String getNucleotide(int random) 
             {
            	                                        //Random search of the information generated
	                switch(random)
	               {
	                     case 0: return "A";      
	                     case 1: return "C";
	                     case 2: return "G";            //Nucleotide bases
	                     case 3: return "T";
	                     default : return "";
	               }
       
             }
              
      /**
       * Recursive size shape     
       *         
       * @param length
       * @return
       */
      public String sequence(int length)                // Sequence 
     {
    	  
    	       Random rd = new Random();
    	       
	            if (length == 1)                        // Recursivity of size
	           {
		              return getNucleotide(rd.nextInt(4)); 
	           }  else
	                  {
		                return getNucleotide(rd.nextInt(4)) + sequence(length - 1);
	                  }
     }
           /**
            * Representation of present chromosomes of the human genome
            *      
            * @return
            */
           public String getChromosome()
          {
	          Random rd = new Random();
	          return "chr" + (rd.nextInt(23)+1); // prefix chr and random whole number of the human genome
          }
       /**
        * Start position starting from a base
        *     
        * @param j
        */
       public  CreatedateSet(int j)
     {
         try  {
		               FileWriter file = new FileWriter("sequence.txt");
		               BufferedWriter bw = new BufferedWriter(file);
		
		
		               Random rd = new Random();
		
		               int length = rd.nextInt(50) + 1;            //Sequence size
		               int Start = rd.nextInt(1000) + 1;           //random integer with the start position
		               
		
		                   for (int i = 0; i < j; i++) 
		                  {
			                 length = rd.nextInt(50) + 1;      
			                 Start = rd.nextInt(1000) + 1;                 
			                 bw.write(sequence(length) + "," + getChromosome() + ","  // equation: start + size sequence -1                                             
			                 + Start + "," + (Start + length) + "," + ""); 
		                  }
		          
		               bw.write(sequence(length)+ "," + getChromosome()); // Get the chromosome
		            
	          }        catch (Exception ex)
                      {   
	                        ex.printStackTrace();
	                  }
     }
         public static void main (String [] args)
                 {
	                  CreatedateSet cd = new CreatedateSet(1000);    // Base   
	                  
	                  
	                  Sequence_y_motif sm = new Sequence_y_motif ();
	                  
	                  sm.getCombinations("", 3);
	                  System.out.println(sm.ocurrences + " - " + sm.winner_motif );
	                  
                 }
	
}
