package org.purpurmc.purpur.client.config;

import org.spongepowered.configurate.objectmapping.ConfigSerializable;

@ConfigSerializable
@SuppressWarnings("CanBeFinal")
public class Config {
    public boolean fixChatStutter = true;
    public boolean beeCountInDebug = true;

    public Seats seats = new Seats();
}
