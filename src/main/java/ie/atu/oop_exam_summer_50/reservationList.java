package ie.atu.oop_exam_summer_50;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class reservationList {

    @SpringBootApplication
}

public ResponseEntity<List> addStudent(Student s)
{
    @Nullable List myList;
    myList.ass(s);
    return ResponseEntity.ok(myList);
}