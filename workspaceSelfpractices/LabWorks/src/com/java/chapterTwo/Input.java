package com.java.chapterTwo;

import java.io.*;
public class Input
{
	private static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    public static Double getDouble(String prompt)
   
    {
        Double value;
        System.out.print(prompt);
        try
        {
            value=Double.parseDouble(Input.input.readLine());
        }
        catch(Exception error){
		  	// error condition
            value=null;
        }
        return value;
    }
    
    public static Integer getInteger(String prompt){
        Integer value=0;
        try{
        System.out.print(prompt);
        try{
            value=Integer.parseInt(Input.input.readLine());
        }
        catch(Exception error)
        {
		  	// error condition
            value=null;
        }
       
        }
        catch(java.lang.NullPointerException a)
        {
        	a.addSuppressed(null);
        }
     // return value;
        return value;
       
    }
    public static String getString(String prompt){
        String string;
        System.out.print(prompt);
        try{
            string=Input.input.readLine();
        }
        catch(Exception error){
		  	// error condition
            string=null;
        }
        return string;
    }
}