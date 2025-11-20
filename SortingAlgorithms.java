/*
SortingAlgorithms.java
ICS4U - Sorting using Algorithms
Sudhanya Golla
Created July 11th, 2024
Last Modified July 11th 2024
*/

// Java setup
import java.util.*;

class SortingAlgorithms {
	
	public static void main(String[] args) {

		// Question 1 - sort array numberically (lowest to highest) using Insertion Sort
		int [] intArray = {6, 2, 8, 3, 1, 7, 4, 9, 5};
		insertionPass(intArray);

		// Question 2 - sort array (highest to lowest) using Insertion Sort 
		System.out.println("\nReversed array: ");
		insertionReversePass(intArray);

		// Question 3 - sort array in alphabetical order using Selection Sort
		String [] names = {"ROBERT", "BRIAN", "VICTOR", "DAVID", "SCOTT"};
		System.out.println("\nArray in alphabetical order: ");
		selectionSort(names);

		// Question 4 - sort array in alphabetical order using Bubble Sort
		String[] nhlTeams ={"MinnesotaWild","CalgaryFlames","SanJoseSharks","ColoradoAvalanche","BostonBruins","AnaheimDucks","MontrealCanadiens","BuffaloSabres","PittsburghPenguins","TampaBayLightning","ChicagoBlackhawks","WashingtonCapitals","LosAngelesKings","NewJerseyDevils","St.LouisBlues","NewYorkIslanders","WinnipegJets","EdmontonOilers","DallasStars","VegasGoldenKnights","FloridaPanthers","NashvillePredators","OttawaSenators","TorontoMapleLeafs",
"PhiladelphiaFlyers","ArizonaCoyotes","CarolinaHurricanes","DetroitRedWings","VancouverCanucks","SeattleKraken","NewYorkRangers"};
		bubbleSortString(nhlTeams);
		System.out.println("\nFinal sorted teams: ");
		printListStr(nhlTeams);

		// Question 5 - sort same array using the same sort, except reversed
		System.out.println("\n\nFinal sorted teams Reversed: ");
		bubbleSortStringReverse(nhlTeams);
		printListStr(nhlTeams);

		// Question 6 - sort array using merge sort
		int [] intArray2 = {21,1,26,5,29,28,2,9,16,49,39,27,43,34,46,40};
		mergeSort(intArray2, 0, intArray2.length - 1);
    
	}

	// All subprograms used
	// Print out a set of integers
	public static void printListNum(int[]list)
	{
		// Print out each integer from an array
		for (int ind = 0; ind < list.length; ind++)
		{
			System.out.print(list[ind] + " ");	
		}
	}

	// Print out a set of strings
	public static void printListStr(String[]list)
	{
		// Print out each integer from an array
		for (int ind = 0; ind < list.length; ind++)
		{
			System.out.print(list[ind] + ", ");	
		}
	}
	
	// Sort integers using insertion sort
	public static void insertionPass(int[]intArray)
	{
		// Store temporary item
		for (int top = 1; top < intArray.length; top++)
		{ 
			int item = intArray[top]; 
			int i = top; 

			// Shift larger items to the right by one
			// Prepare to check the next item to the left
			while (i > 0 && item < intArray[i-1])
			{ 
				intArray[i] = intArray[i-1];
			i--; 
			}

			// Put sorted item in open location
			intArray[i] = item;

		// Print array after each pass
		System.out.println("Array after each pass: ");
		printListNum(intArray);
		System.out.println("");
		}
	}

	// Reverse sort order using insertion sort
	public static void insertionReversePass(int[]intArray)
	{
		// Store temporary item
		for (int top = 1; top < intArray.length; top++)
		{ 
			int item = intArray[top]; 
			int i = top; 

			// Shift smaller items to the right by one
			// Prepare to check the next item to the left
			while (i > 0 && item > intArray[i-1])
			{ 
				intArray[i] = intArray[i-1];
				i--; 
			}	

			// Put sorted item in open location
			intArray[i] = item;

			// Print array after each pass
			System.out.println("Array after each pass: ");
			printListNum(intArray);
			System.out.println("");
		}
	}

	// Sort array using selection sort
	public static void selectionSort(String[]names)
	{
		// Assume largest element is names[0]
		for (int top = names.length - 1; top > 0; top--)
		{ 
			int largeLoc = 0; 
			
			// Make sure all elements are compared to
			for (int i = 0; i <= top; i++)
			{
				// Determine whether adjacent element is larger
				if (names[i].compareTo(names[largeLoc]) > 0)
				{ 
					largeLoc = i; 
				} 
			} 

			//temporary storage for the item last looked at
			String temp = names[top]; 
			names[top] = names[largeLoc]; 
			names[largeLoc] = temp;

			// Print out array after each pass
			System.out.println("Array after each pass: ");
			printListStr(names);
			System.out.println("");
		}
	}

	// Sort an array using bubble sort
	public static void bubbleSortString(String[]list)
	{
		boolean sorted = false; 

		// Keep on reducing size of array being examined after each pass
		for (int top = list.length - 1; top > 0 && sorted == false; top--)
		{
			sorted = true; 

			// Check every single adjacent item
			for (int i = 0; i < top; i++)
			{ 
				// Check if previous item is greater in alpha order in comparison to next item
				// If so, swap both items
				if (list[i].compareTo(list[i+1]) > 0)
				{ 
					sorted = false; 
					String temp = list[i]; 
					list[i] = list[i+1]; 
					list[i+1] = temp; 
				}
			} 
		} 
	}

	// Sort an array using bubble sort in the reverse way
	public static void bubbleSortStringReverse(String[]list)
	{
		boolean sorted = false; 

		// Keep on reducing size of array being examined after each pass
		for (int top = list.length - 1; top > 0 && sorted == false; top--)
		{
			sorted = true;
			
			// Check every single adjacent item
			for (int i = 0; i < top; i++)
			{ 
				// Check if previous item is lower in alpha order in comparison to next item
				// If so, swap both items
				if (list[i].compareTo(list[i+1]) < 0)
				{ 
					sorted = false; // a swap was required 
					String temp = list[i]; 
					list[i] = list[i+1]; 
					list[i+1] = temp; 
				}
			} 
		} 
	}

	// Sort array using merge sort
	public static void merge(int [] items, int start, int mid, int end)
	{
		// Split array into left and right parts
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		/* Create temp arrays */
		int L[] = new int [n1];
		int R[] = new int [n2]; 
	
		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
		{
			L[i] = items[start + i];
		}
		
		for (int j=0; j<n2; ++j) 
		{
			R[j] = items[mid + 1+ j];
		}
		
		/* Merge the temp arrays */
		int i = 0, j = 0;   
		int k = start;
		
		while (i < n1 && j < n2)
		{ 
			if (L[i] <= R[j])
			{ 
				items[k] = L[i]; 
				i++;
				k++;
			} 
			else
			{ 
				items[k] = R[j]; 
				j++;
				k++;
			}	
		
	}
	
		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{ 
			items[k] = L[i]; 
			i++; 
			k++;
		}
		
		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{ 
			items[k] = R[j]; 
			j++; 
			k++; 
		}
		
	}

	// Sort using a recursive merge sort
	public static void mergeSort(int [] items, int start, int end)
	{
		if (start < end)
		{
			int mid = (start + end) / 2;

			// Sort using merge sort
			mergeSort(items, start, mid);
			mergeSort(items, mid+1, end);
			merge(items, start, mid, end);

			// Print out numbers at the end of each merge
			System.out.println("\nNumbers at the end of merge: ");
			printListNum(items);
			System.out.println("");
		}
	}

}