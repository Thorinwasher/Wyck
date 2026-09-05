package dev.wyck.worldgen;

import java.util.UUID;

/**
 * Information about a world
 * @param worldUuid The world UUID
 * @param worldName The world name
 */
public record WorldInfo(UUID worldUuid, String worldName) {
}
