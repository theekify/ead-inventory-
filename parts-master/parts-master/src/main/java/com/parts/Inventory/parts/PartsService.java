package com.parts.Inventory.parts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class PartsService {
    @Autowired
    private PartsRepository partsRepository;

    public List<Parts> getAllParts() {
        return partsRepository.findAll();

    }



    public Parts addpart(Parts parts) {
        return partsRepository.save(parts);
    }

    public Parts getPart(int partId) {
        return partsRepository.findById(partId).isPresent() ? partsRepository.findById(partId).get() : null;
    }

    @Transactional
    public Parts updatePart(int partId,String partName,String serialnumber,int quantity,String category,String warrtyDate,float price) {
      Parts parts = partsRepository.findById(partId).orElseThrow(()-> new RuntimeException("Part not found"));

      if (partName != null && !partName.trim().isEmpty() && !Objects.equals(parts.getPartName(), partName)) {
          parts.setPartName(partName);
      }

      if (serialnumber != null && !serialnumber.trim().isEmpty() && !Objects.equals(parts.getSerialnumber(), serialnumber)) {
          parts.setSerialnumber(serialnumber);
      }

      if (category != null && !category.isEmpty()){
          parts.setCategory(category);
      }

      if (warrtyDate != null){
          parts.setWarrantyDate(warrtyDate);
      }

        return parts;
    }

    public void deletePart(int partId) {
        partsRepository.deleteById(partId);
    }

}
