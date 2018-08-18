import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(((c>=65)&&(c<=90))||((c>=97)&&(c<=122)))
		{
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
		System.out.println("Vowel");
		else
		System.out.println("Consonant");
		}
		else
		System.out.println("invalid");
	}
}
