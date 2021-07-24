package com.envyful.placeholders.forge;

import com.envyful.papi.api.PlaceholderManager;
import net.minecraft.entity.player.EntityPlayerMP;

public class ForgePlaceholders implements PlaceholderManager<EntityPlayerMP> {

    @Override
    public String getIdentifier() {
        return "forge";
    }

    @Override
    public String[] getAuthors() {
        return new String[] { "Envyful" };
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getName() {
        return getIdentifier();
    }

    @Override
    public String onPlaceholderRequest(EntityPlayerMP player, String placeholder) {
        switch (placeholder.toLowerCase()) {
            case "name" : return player.getName();
            case "displayname" : return player.getDisplayNameString();
            case "health" : return player.getHealth() + "";
            case "food" : return player.getFoodStats().getFoodLevel() + "";
        }

        return "UNDEFINED";
    }
}