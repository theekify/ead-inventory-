package com.parts.Inventory.parts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartsController {

    @Autowired
    private PartsService partsService;

    @GetMapping(path = "/parts/{partId}")
    public List<Parts> getParts() {
        return partsService.getAllParts();
    }

    @PostMapping( path = "/parts")
    public Parts addPart(@RequestBody Parts parts) {
        return partsService.addpart(parts);
    }

    @PutMapping(path = "/parts/{partId}")
    public Parts updatePart(@PathVariable int partId, @RequestParam String partName, @RequestParam String serialnumber, @RequestParam int quantity,@RequestParam String category, @RequestParam float price, @RequestParam String warrantyDate ) {
        return partsService.updatePart(partId,partName,serialnumber,quantity,category,warrantyDate,price);
    }

    @DeleteMapping(path = "/parts/{partId}")
    public void deletePart(@PathVariable int partId) {
        partsService.deletePart(partId);
    }

}
