/*
SPDX-FileCopyrightText: Copyright (c) 2022 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class AppInfo {
    private String javaRuntimeVersion;
    private String micronautVersion;
    private String thymeleafVersion;

    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    public String getMicronautVersion() {
        return micronautVersion;
    }

    public void setMicronautVersion(String micronautVersion) {
        this.micronautVersion = micronautVersion;
    }

    public String getThymeleafVersion() {
        return thymeleafVersion;
    }

    public void setThymeleafVersion(String thymeleafVersion) {
        this.thymeleafVersion = thymeleafVersion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "["
                + "javaRuntimeVersion=" + javaRuntimeVersion + ", "
                + "micronautVersion=" + micronautVersion + ", "
                + "thymeleafVersion=" + thymeleafVersion
                + "]";
    }
}
