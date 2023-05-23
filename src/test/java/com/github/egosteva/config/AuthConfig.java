package com.github.egosteva.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:authentication.properties"
})
public interface AuthConfig extends Config {
    @Key("browserstack.user")
    @DefaultValue("elenagosteva_YsZjEc")
    String getUser();

    @Key("browserstack.key")
    @DefaultValue("nG4yqzYHbrwsAi8zwNJr")
    String getKey();

    @Key("remoteUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getRemoteUrl();
}