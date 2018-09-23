
linear search 


package search;

public class Line {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
	
	int numbers;int numbersSize = 0;int key = 0;{
			int   i = 0;

			   for (i = 0; i <  numbersSize; ++i) {
			      int[] numbers1 = null;
				if (  numbers1 [i] == key );{
			         return i;
			      }
			   }
			      
			   return -1; // not found
			}
	}
			void main() {
				int NUMBERSSIZE;
			int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
			  int NUMBERS_SIZE = 8;
			  int i = 0;
			  int key = 0;;
			   int keyIndex = 0;
			      
			   print("NUMBERS: ");
			   for (i = 0; i < NUMBERS_SIZE; ++i) {
			      print(numbers[i] + " ");
			   }
			   printLine(keyIndex);
			      
			   print("Enter a value: ");
			   key = (getIntFromUser());
			      
			   keyIndex = LinearSearch(numbers, NUMBERS_SIZE, key);
			      
			   if (keyIndex == -1) {
			      printLine(key + " was not found.");
			   } 
			   else {
			      printLine("Found " + key + " at index " + keyIndex + ".");
			   }
			}
			private void print(String string) {
				// TODO Auto-generated method stub
				
			}
			private void printLine(String string) {
				// TODO Auto-generated method stub
				
			}
			private int getIntFromUser() {
				// TODO Auto-generated method stub
				return 0;
			}
			private int LinearSearch(int[] numbers, int nUMBERS_SIZE, int key) {
				// TODO Auto-generated method stub
				return 0;
			}
			private void printLine(int i) {
				// TODO Auto-generated method stub
				
			}
}
		
		
		
		
		
		
		
		
