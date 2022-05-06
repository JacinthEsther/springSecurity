package com.example.springsecurity.student;

public class Student {

    private final int studentId;
    private final String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", studentName='").append(studentName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
