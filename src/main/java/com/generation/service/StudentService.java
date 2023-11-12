package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

//    private final Map<Student, Character> studentGrade = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

//    public void gradeStudent (Student student, Character grade){studentGrade.put(student, grade);}

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        return students.containsKey(studentId);
    }

    public void showSummary()
    {
        //TODO implement
        for(Map.Entry<String, Student> entry : students.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        for(Map.Entry<Student, Character> entry : studentGrade.entrySet()){
//            Student students = entry.getKey();
//            System.out.println(students.getId() + ": Student{" + students.getId() + " , name= '" + students.getName() + "' , grade = '" + entry.getValue() + "'}");
//        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
