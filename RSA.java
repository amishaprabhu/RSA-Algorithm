package com.exp;
import java.util.Scanner;

public class RSA 
{
	public static int gcd(int e,int g)
	{
		if(e==0)
		{
			return g;
		}
		else
		{
			return gcd(g%e,e);
		}
	}
	
	public static void rsa(int a,int b,int e, int p)
	{
		int n,g,i;
		double d=77,Cipher,Plain;
		n=a*b;
		g=(a-1)*(b-1);
		i=gcd(e,g);
		d=((g*i)+1)/e;
		System.out.println("The value of gcd("+e+","+n+") is:"+i);
		System.out.println("The value of n is:"+n);
		System.out.println("The value of g is:"+g);
		System.out.println("The value of d is:"+d);
		System.out.println("The public key is:{"+e+","+n+"}");
		System.out.println("The private key is:{"+a+","+n+"}");
		Cipher=Math.pow(p, e)%n;
		Plain=Math.pow(Cipher, d)%n;
		System.out.println("Cipher text is:"+Cipher);
		System.out.println("Plain text is:"+Plain);
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,e,P;
		System.out.println("Enter the value of a:");
        a=s.nextInt();
		System.out.println("Enter the value of b:");
        b=s.nextInt();
        System.out.println("Enter the value of e:");
        e=s.nextInt();
        System.out.println("Enter the value of P:");
        P=s.nextInt();
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        System.out.println("The value of e is:"+e);
        System.out.println("The value of P is:"+P);
        rsa(a,b,e,P);
	}
}