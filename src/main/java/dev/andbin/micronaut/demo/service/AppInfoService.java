/*
SPDX-FileCopyrightText: Copyright (c) 2022 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.service;

import org.thymeleaf.Thymeleaf;

import dev.andbin.micronaut.demo.model.AppInfo;
import jakarta.inject.Singleton;

@Singleton
public class AppInfoService {
    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(getJavaRuntimeVersion());
        appInfo.setMicronautVersion(getMicronautVersion());
        appInfo.setThymeleafVersion(getThymeleafVersion());
        return appInfo;
    }

    private String getJavaRuntimeVersion() {
        return Runtime.version().toString();   // Java 9+
    }

    private String getMicronautVersion() {
        return io.micronaut.core.version.VersionUtils.getMicronautVersion();
    }

    private String getThymeleafVersion() {
        return Thymeleaf.getVersion();
    }
}
