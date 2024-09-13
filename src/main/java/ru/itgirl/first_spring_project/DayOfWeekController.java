package ru.itgirl.first_spring_project;

import ru.itgirl.first_spring_project.DayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayOfWeekController {
    @GetMapping("/translate")
    public String translateDay(@RequestParam String day) {
        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
            return "День недели: " + dayOfWeek.getRussianName();
        } catch (IllegalArgumentException e) {
            return "Ошибка: день недели не распознан!";
        }
    }
}
