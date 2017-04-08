import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class abs {
   
	 public static int GetJumpCount(int input1,int input2,int[] input3)
	    {int jumps=0;
	    	for(int i=0;i<input3.length;i++){
	    		while(input3[i]!=0)
	    		if(input3[i]<=input1){	jumps++; input3[i]=0;}
	    		else if(input3[i]>input1){jumps++; System.out.println("input="+ input3[i]);input3[i]=input3[i]-input1+input2;}
	    	}
		 
		 return jumps;
	    }

public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1,ip2,ip3);
        System.out.println("total jumps="+String.valueOf(output));
    }
}
