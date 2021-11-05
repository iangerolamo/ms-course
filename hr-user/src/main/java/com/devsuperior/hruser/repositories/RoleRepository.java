package com.devsuperior.hruser.repositories;

import com.devsuperior.hruser.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
