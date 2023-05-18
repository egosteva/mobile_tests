package com.github.egosteva.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface MobileConfig extends Config {
    @Key("app")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getApp();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("os_version")
    @DefaultValue("9.0")
    String getOsVersion();

    @Key("networkLogs")
    @DefaultValue("true")
    Boolean networkLogs();

    @Key("project")
    @DefaultValue("First Java Project")
    String getProjectName();

    @Key("build")
    @DefaultValue("browserstack-build-1")
    String getBuildName();

    @Key("name")
    @DefaultValue("first_test")
    String getTestName();

    @Key("remoteUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getRemoteUrl();

    @Key("browserstack.user")
    @DefaultValue("elenagosteva_YsZjEc")
    String getUser();

    @Key("browserstack.key")
    @DefaultValue("nG4yqzYHbrwsAi8zwNJr")
    String getKey();
}