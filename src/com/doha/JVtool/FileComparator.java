package com.doha.JVtool;

import java.io.File;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class FileComparator implements Comparator {  
    public final int compare(Object pFirst, Object pSecond) {  
       
        if(((File) pFirst).isDirectory()&&!((File) pSecond).isDirectory()){
        	return -1;
        }
        else if(!((File) pFirst).isDirectory()&&((File) pSecond).isDirectory()){
        	return 1;
        }
        String name1 = ((File) pFirst).getName();
        String name2 = ((File) pSecond).getName();
        if(name1.compareToIgnoreCase(name2)<0){
        	return -1;
        }
        else
        	return 1;
    }  
}  

@SuppressWarnings("rawtypes")
class FileComparator1 implements Comparator {  
    public final int compare(Object pFirst, Object pSecond) {  
       
        String name1 = ((File) pFirst).getName();
        String name2 = ((File) pSecond).getName();
        if(name1.compareToIgnoreCase(name2)<0){
        	return -1;
        }
        else
        	return 1;
    }  
}  