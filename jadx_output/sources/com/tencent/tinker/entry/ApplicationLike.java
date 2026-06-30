package com.tencent.tinker.entry;

/* loaded from: classes16.dex */
public abstract class ApplicationLike implements com.tencent.tinker.entry.ApplicationLifeCycle {
    private final android.app.Application application;
    private final long applicationStartElapsedTime;
    private final long applicationStartMillisTime;
    private final int tinkerFlags;
    private final boolean tinkerLoadVerifyFlag;
    private final android.content.Intent tinkerResultIntent;

    public ApplicationLike(android.app.Application application, int i17, boolean z17, long j17, long j18, android.content.Intent intent) {
        this.application = application;
        this.tinkerFlags = i17;
        this.tinkerLoadVerifyFlag = z17;
        this.applicationStartElapsedTime = j17;
        this.applicationStartMillisTime = j18;
        this.tinkerResultIntent = intent;
    }

    public android.app.Application getApplication() {
        return this.application;
    }

    public long getApplicationStartElapsedTime() {
        return this.applicationStartElapsedTime;
    }

    public long getApplicationStartMillisTime() {
        return this.applicationStartMillisTime;
    }

    public android.content.res.AssetManager getAssets(android.content.res.AssetManager assetManager) {
        return assetManager;
    }

    public android.content.Context getBaseContext(android.content.Context context) {
        return context;
    }

    public java.lang.ClassLoader getClassLoader(java.lang.ClassLoader classLoader) {
        return classLoader;
    }

    public android.content.res.Resources getResources(android.content.res.Resources resources) {
        return resources;
    }

    public java.lang.Object getSystemService(java.lang.String str, java.lang.Object obj) {
        return obj;
    }

    public android.content.res.Resources.Theme getTheme(android.content.res.Resources.Theme theme) {
        return theme;
    }

    public final int getTinkerFlags() {
        return this.tinkerFlags;
    }

    public final boolean getTinkerLoadVerifyFlag() {
        return this.tinkerLoadVerifyFlag;
    }

    public final android.content.Intent getTinkerResultIntent() {
        return this.tinkerResultIntent;
    }

    public int mzNightModeUseOf() {
        return 1;
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(android.content.Context context) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i17) {
    }
}
