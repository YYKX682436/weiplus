package com.tencent.tinker.entry;

/* loaded from: classes12.dex */
public interface ApplicationLifeCycle {
    void onBaseContextAttached(android.content.Context context);

    void onConfigurationChanged(android.content.res.Configuration configuration);

    void onCreate();

    void onLowMemory();

    void onTerminate();

    void onTrimMemory(int i17);
}
