package com.project.d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Quiz q=new Quiz();
	q.logic();
	InsertData i=new InsertData();
	i.insertData();
	//Sorting s=new Sorting();
   // s.sorting();
    Retrive r=new Retrive();
    r.retriveDetail();
    Sorting s=new Sorting();
    s.sorting();
}

				
	}


	
	

	

