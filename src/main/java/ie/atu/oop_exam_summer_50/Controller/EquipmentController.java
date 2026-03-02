package ie.atu.oop_exam_summer_50.Controller;

import ie.atu.oop_exam_summer_50.Service.EquipmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EquipmentController {
    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService EquipmentService) {
        this.equipmentService = EquipmentService;
    }

    @PostMapping("addEquiptment")
    public <Equipment> ResponseEntity<Equipment> addEquipment(Valid @RequestBody Equipment equipment) {
        Equipment saved = equipmentService.addEquipment(equipment);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/allEquipment")
    public ResponseEntity<List> allEquipment() {
        return ResponseEntity.ok(equipmentService.getAllEquipment());
    }
}
