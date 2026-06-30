package com.tencent.shadow.dynamic.host;

/* loaded from: classes13.dex */
public interface UuidManager {
    public static final java.lang.String DESCRIPTOR = "com.tencent.shadow.dynamic.host.UuidManager";
    public static final int TRANSACTION_CODE_FAILED_EXCEPTION = 1;
    public static final int TRANSACTION_CODE_NOT_FOUND_EXCEPTION = 2;
    public static final int TRANSACTION_CODE_NO_EXCEPTION = 0;
    public static final int TRANSACTION_getAndroidJar = 4;
    public static final int TRANSACTION_getPlugin = 1;
    public static final int TRANSACTION_getPluginLoader = 2;
    public static final int TRANSACTION_getRuntime = 3;

    android.os.ParcelFileDescriptor getAndroidJar();

    com.tencent.shadow.core.common.InstalledApk getPlugin(java.lang.String str, java.lang.String str2);

    com.tencent.shadow.core.common.InstalledApk getPluginLoader(java.lang.String str);

    com.tencent.shadow.core.common.InstalledApk getRuntime(java.lang.String str);
}
