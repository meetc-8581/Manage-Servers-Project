package dev.meetc.server.reop;

import dev.meetc.server.model.server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<server, Long> {
    server findByIpAddress(String ipAddress);
}
