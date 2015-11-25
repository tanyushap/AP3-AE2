
public class dependencyDiscoverer{

/* 
1. The main function takes the ommand from the terminal as follows:
./dependencyDiscoverer [-Idir] ... file.c or file.l or file.y ...
2. It separtes the -Idir flags from the file 




*/
public static void main(String[] args){
	
	for (String env : args){
		System.out.println(env);

		}

	


	}

//file is parsed for all #includes "a.h"
/*
1.Open file
2. for each line if it contains #include "
3. add the name of the file to a list
4.Return the list  */
public static void processFile(){



}


//output should be foo.o: foo.c inc1.h inc2.h inc3.h
public static void printDependencies(){


}

}
