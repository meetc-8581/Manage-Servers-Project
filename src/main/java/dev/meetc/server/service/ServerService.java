package dev.meetc.server.service;

import java.util.Collection;

import dev.meetc.server.model.server;

public interface ServerService {
    server create(server server);

    server ping(String ipAddress);

    Collection<server> list(int limit);

    server get(long id);

    server update(server server);

    Boolean delete(long id);
}
