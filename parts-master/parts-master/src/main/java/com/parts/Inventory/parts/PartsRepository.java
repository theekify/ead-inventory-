package com.parts.Inventory.parts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

interface PartsRepository extends JpaRepository<Parts, Integer> {
}
