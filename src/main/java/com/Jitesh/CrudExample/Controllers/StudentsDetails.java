package com.Jitesh.CrudExample.Controllers;

import com.Jitesh.CrudExample.Bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
public class StudentsDetails {

//    public static List<Student> students = new ArrayList<>();
    public static HashMap<Integer, Student> students = new HashMap<>();
    private static int currentId = 103;



//    Default created some date
    public StudentsDetails(){
        students.put(101,new Student(101, "Jitesh",26, "jiteshborkar2001@gmail.com"));
        students.put(102,new Student(102, "Swabhavika", 24,"swabhavika12@gmail.com"));
        students.put(103,new Student(103,"Kartik",23,"kartikreddy@gmail.com"));

    }
    @GetMapping("/")
    public String message(){
        return "Welcome to Crud implementation Using HashMap";
    }

    //create
    @PostMapping("/students")
    public void addStudents(@RequestBody Student student){
        currentId++;
        student.setId(currentId);
        students.put(student.getId(),student);
    }

    //read
//    get all students
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return new ArrayList<>( students.values());
    }

//    get students by id
    @GetMapping("/student/{id}")
    public Student getStudentsById(@PathVariable int id){
        return students.get(id);
    }


    //update
//    update students by id
    @PutMapping("/student/{id}")
    public String updateStudents(@PathVariable int id, @RequestBody Student updatedStudent){

                if(students.containsKey(id)) {
                    updatedStudent.setId(id);
                    students.put(id, updatedStudent);
                    return "Student with ID " + id + " updated Succesfully";
                }
    return "Student with ID "+ id +" not found!!!!";
    }


    //Delete
//    Delete students by id
    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable int id, Student removedStudent){

            if(students.containsKey(id)){
                students.remove(id);
                return "Student with ID "+ id +"removed Succesfully!!";
            }
        return "Student with ID " + id +" not found!";
    }

}
