#Search class causes bioinformatics motive
#The class contains the methods and functions necessary to:
#Show each of the attributes of a particular instance of a genetic sequence
#Segment of genetic sequences
#Search of the employer (motif) that appears
#@author Jhon Avila
#@since 17/march/2018

class CreatedateSet(object):
	                                   #FIRST PART
    def __init__(self):
		
        pass
	
    def getNucleotide(self):
		
        rd = Random()
		                        #Random search of the information generated
        if rd.nextInt(4) == 0:
			
            return "A"
		
        elif rd.nextInt(4) == 1:
			
            return "C"
		
        elif rd.nextInt(4) == 2:
			
            return "G"
		                          #Nucleotide bases
        elif rd.nextInt(4) == 3:
			
            return "T"
		
        else:
			
            return ""

	

    def sequence(self, length):           #Recursive size shape
                                               # Sequence 		
         if length == 1:
			
             return self.getNucleotide()
                                                #Recursivity of size		
         else:
			
             return self.getNucleotide() + self.sequence(length - 1)

	

    def getChromosome(self):           #Representation of present chromosomes of the human genome
		
         rd = Random()
		
         return "chr" + (rd.nextInt(23) + 1)

	                                         #prefix chr and random whole number of the human genome

    def CreatedateSet(self):                         #Start position starting from a base
		
         try:
			
             file = FileWriter("sequence.txt")
			
             bw = BufferedWriter(file)
			
             rd = Random()
			
             length = rd.nextInt(50) + 1
	                                                    #Sequence size		
             Start = rd.nextInt(1000) + 1
	                                                   #random integer with the start position 		
             reads = 1000000
			                  #Base
             i = 0
			
             while i < reads:
				
                 length = rd.nextInt(50) + 1
	  			
                 Start = rd.nextInt(1000) + 1
				
                 bw.write(self.sequence(length) + "," + self.getChromosome() + "," + Start + "," + (Start + length) + "," + "")
	                                                     #equation: start + size sequence -1 			
                 i += 1
                 bw.write(self.sequence(length) + "," + self.getChromosome())       #Get the chromosome
             except Exception, ex:
			
                 ex.printStackTrace()
		
             finally:
      def main(args):
		cd = CreatedateSet()
		cd.CreateFile()

      main = staticmethod(main)

class Sequence_y_motif(object):
	                                                     #SECOND PART
    def __init__(self):
	
        self._ocurrences = Integer.MIN_VALUE

        self._winner_motif = ""

    def Ocurrences(self, motif):                #Determine the next one that becomes greater
		
        counter = 0
		
        try:
			
            file = FileReader("sequence.txt")

            br = BufferedReader(file)
			
            sequence = br.readLine()
			
            length = motif.length()
			
            count = 0
			
            while sequence != None:
								
                i = 0
				
                while i < sequence.length() - length + 1:
					
                    if sequence.substring(i, i + 3).equals(motif):
	                                                                #Substrates of the same size as the motif					
                        counter+=0
                        i+= length-1
                    i += 1                             ##Motif winner
		
        except Exception, ex:
		
        finally:
		
        return counter

    def countOcurrences(self, motif):             #sequences of occurrences that report and number of occurrences that has
		
         pass


	
     def verifiquecandidato(self, motif):
		
         temp = self.countOcurrences(motif)
		
         if temp > ocurrences:
			                                #comparison to determine number of occurrences
             self._winner_motif = motif
			
             self._ocurrences = temp

	
     def getCombinations(self, sebsequence, size):
		
         if size == 1:
			
             tempSequence = sebsequence + "A"
			
             self.verifiquecandidato(tempSequence)
			
             tempSequence = sebsequence + "C"
		                                                     #for each chromosome number of times that 	
             self.verifiquecandidato(tempSequence)
	                                                               #the motif appears		
             tempSequence = sebsequence + "G"
			
             self.verifiquecandidato(tempSequence)
             tempSequence = sebsequence + "t"
			
             self.verifiquecandidato(tempSequence)
         else:
			
self.getCombinations(sebsequence + "A", size - 1)
			
self.getCombinations(sebsequence + "C", size - 1)
			
self.getCombinations(sebsequence + "G", size - 1)

self.getCombinations(sebsequence + "T", size - 1)
