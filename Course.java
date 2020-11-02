package homework;

import java.util.ArrayList;

public class Course
{
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course()
    {
    	
    }

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudents(String student)
    {
        if (students.size() >= 100)
        {
            System.out.println("It is full.");
            return;
        }
        else
            students.add(student);
    }

    public ArrayList<String> getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return students.size();
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void dropStudents(String student)
    {
        students.remove(students.get(students.indexOf(student)));
    }

    private void setStudents(ArrayList<String> students)
    {
        this.students = students;
    }

    public Object clone()
    {
        Course newCourse = new Course(getCourseName());
        newCourse.setStudents(getStudents());
        return newCourse;
    }

public static void main(String [] args)
	{
    	Course course1 = new Course("IT");
    	course1.addStudents("Elbert");
    	course1.addStudents("Tom");
    	course1.addStudents("Tim");
    	System.out.println(course1.getNumberOfStudents());
    	
    	Course course2 = (Course)(course1.clone()); 
    	System.out.println(course2.getNumberOfStudents());
    	System.out.println(course1.equals(course2));
    	for (String name : course2.getStudents())
    	{
    		System.out.print(name + " ");
    	}
    		System.out.println();
	}
}