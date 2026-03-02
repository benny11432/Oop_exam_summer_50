package ie.atu.oop_exam_summer_50;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class OopExamSummer50Application {

    public static void main(String[] args) {
        SpringApplication.run(OopExamSummer50Application.class, args);
    }

        @GetMapping("/ATU Equiptment Reservation")
        public String ATUEquiptmentReservation(){
        return "Welcome to the ATU Equipment Reservation";
        }

}

