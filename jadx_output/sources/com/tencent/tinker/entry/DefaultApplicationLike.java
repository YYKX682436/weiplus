package com.tencent.tinker.entry;

/* loaded from: classes12.dex */
public class DefaultApplicationLike extends com.tencent.tinker.entry.ApplicationLike {
    private static final java.lang.String TAG = "Tinker.DefaultAppLike";

    public DefaultApplicationLike(android.app.Application application, int i17, boolean z17, long j17, long j18, android.content.Intent intent) {
        super(application, i17, z17, j17, j18, intent);
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(android.content.Context context) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "onBaseContextAttached:", new java.lang.Object[0]);
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "onConfigurationChanged:" + configuration.toString(), new java.lang.Object[0]);
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "onCreate", new java.lang.Object[0]);
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "onLowMemory", new java.lang.Object[0]);
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "onTerminate", new java.lang.Object[0]);
    }

    @Override // com.tencent.tinker.entry.ApplicationLike, com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i17) {
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "onTrimMemory level:" + i17, new java.lang.Object[0]);
    }
}
