package com.tencent.shadow.dynamic.host;

/* loaded from: classes7.dex */
public interface PluginManagerUpdater {
    java.io.File getLatest();

    java.util.concurrent.Future<java.lang.Boolean> isAvailable(java.io.File file);

    java.util.concurrent.Future<java.io.File> update();

    boolean wasUpdating();
}
