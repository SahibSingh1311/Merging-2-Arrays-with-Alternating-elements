public class merger{
	public static void main(String[] args){
	int[] arr1 = {1,2};  //Input 1
	char[] arr2 = {'a','b','c'};	//Input 2
	char[] bigArr = arrMerger(arr1,arr2);
	for(int i =0;i<bigArr.length;i++){
		System.out.print(bigArr[i]);	//Printing Merged Array
}	
}
	public static char[] arrMerger(int[] intArr, char[] charArr){
	int intlen = intArr.length;
	int charlen = charArr.length;
	char[] mergerArr = new char [intlen+charlen];	//Creating new array having size as sum of 2 input arrays
	
	int i=0,j=0,k=0;

	while(i<intlen && j<charlen){
	mergerArr[k++]=(char)(intArr[i++]+'0');	//Type Casting of int to char, addition of '0' so as to avoid conversion to ASCII value. Ref: https://www.javatpoint.com/java-int-to-char#:~:text=We%20can%20convert%20int%20to,'0'%20with%20int%20variable.x
	mergerArr[k++]=charArr[j++];
	}
	while(i<intlen){	//To insert remaining elements of intArr to mergerArr
	mergerArr[k++]=(char)(intArr[i++]+'0');
	}
	while(j<charlen){	//To insert remaining elements of charArr to mergerArr
	mergerArr[k++]=charArr[j++];
	}
	return mergerArr;	
}

}