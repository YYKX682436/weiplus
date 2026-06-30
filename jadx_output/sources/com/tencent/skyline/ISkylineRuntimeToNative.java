package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0002H&J*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&J*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&J0\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H&J\"\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\"\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\"\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\"\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/tencent/skyline/ISkylineRuntimeToNative;", "", "Ljz5/f0;", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "release", "", "isolatePtr", "contextPtr", "uvLoopPtr", "initJSEngine", "taskRunnerPtr", "initUITaskRunner", "clearJSBindings", "clearWorkletJSBindings", "", dm.i4.COL_ID, "pageId", "Lcom/tencent/skyline/PageConfig;", "pageConfig", "Lcom/tencent/skyline/IRouteDoneCallback;", "callback", nd1.r.NAME, nd1.m0.NAME, "delta", "", "animate", nd1.p.NAME, "appLaunch", "autoReLaunch", "reLaunch", nd1.h2.NAME, "destroyWindow", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public interface ISkylineRuntimeToNative {
    void appLaunch(int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    void autoReLaunch(int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    void clearJSBindings();

    void clearWorkletJSBindings();

    void destroyWindow(int i17);

    void init();

    void initJSEngine(long j17, long j18, long j19);

    void initUITaskRunner(long j17);

    int navigateBack(int id6, int pageId, int delta, boolean animate, com.tencent.skyline.IRouteDoneCallback callback);

    void navigateTo(int i17, int i18, com.tencent.skyline.PageConfig pageConfig, com.tencent.skyline.IRouteDoneCallback iRouteDoneCallback);

    void reLaunch(int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    void redirectTo(int i17, int i18, com.tencent.skyline.PageConfig pageConfig, com.tencent.skyline.IRouteDoneCallback iRouteDoneCallback);

    void release();

    void switchTab(int i17, int i18, com.tencent.skyline.PageConfig pageConfig);
}
