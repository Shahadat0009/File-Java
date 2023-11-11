
package com.mycompany.htlab5;

import java.util.Calendar;
import java.util.GregorianCalendar;

interface Comparable<T> {
    int compareTo(T o);
}

interface Cloneable {
    Object clone();
} 

class NewDate implements Comparable<NewDate>, Cloneable {
    private int day, month, year;

    public NewDate() {
        Calendar calendar = new GregorianCalendar();
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1; 
        this.year = calendar.get(Calendar.YEAR);
    }

    public NewDate(String dateStr) {
        String[] dateParts = dateStr.split("[/-:]");
        if (dateParts.length == 3) {
            this.day = Integer.parseInt(dateParts[0]);
            this.month = Integer.parseInt(dateParts[1]);
            this.year = Integer.parseInt(dateParts[2]);
        } else {
           
        }
    }

    public NewDate(Calendar calendar) {
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

   public boolean setDate(int day, int month, int year) {
        
        return true; 
    }

    public NewDate getDate() {
        
        return this; 
    }

    public int difference(NewDate otherDate) {
        
        return 0;
    }

    @Override
    public int compareTo(NewDate o) {
        
        return 0; 
    }

    @Override
    public Object clone() {
        
        return null; 
    }

    @Override
    public String toString() {
        return "NewDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

    
}

class NewTime implements Comparable<NewTime>, Cloneable {
    private int hour, minute, second;

    public NewTime() {
        Calendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public NewTime(String timeStr) {
        String[] timeParts = timeStr.split("[/-:]");
        if (timeParts.length == 3) {
            this.hour = Integer.parseInt(timeParts[0]);
            this.minute = Integer.parseInt(timeParts[1]);
            this.second = Integer.parseInt(timeParts[2]);
        } else {
            
        }
    }

    public NewTime(Calendar calendar) {
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    

    public boolean setTime(int hour, int minute, int second) {
        
        return true; 
    }

    public NewTime getTime() {
        return this; 
    }

    public int difference(NewTime otherTime) { 
        return 0; 
    }

    @Override
    public int compareTo(NewTime o) {
        return 0; 
    }

    @Override
    public Object clone() {
        return null; 
    }

    @Override
    public String toString() {
        return "NewTime{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }

   
}

public class Main {
    public static void main(String[] args) {
       
        NewDate x = new NewDate(); 
        NewDate y = new NewDate("10/11/2023");
        Calendar gc = new GregorianCalendar();
        NewDate z = new NewDate(gc); 

       
        x.setDate(15, 11, 2023);
        System.out.println("Date x: " + x);

        int dateDifference = x.difference(y);
        System.out.println("Difference between x and y: " + dateDifference);

        int timeComparison = x.compareTo(z);
        System.out.println("Comparison between x and z: " + timeComparison);

        NewDate clonedDate = (NewDate) x.clone();
        System.out.println("Cloned Date: " + clonedDate);
    }
}






