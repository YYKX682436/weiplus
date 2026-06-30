package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/tencent/skyline/ISkylineRuntimeFromNative;", "", "", "taskId", "Ljz5/f0;", "notifyRouteDone", dm.i4.COL_ID, "pageId", "notifyBack", "notifyBackDone", "Lcom/tencent/skyline/IRouteBackCallback;", "routeBackCallback", "waitForBack", "notifyWindowReady", "notifyWindowDestroy", "", "runtimeDelegatePtr", "notifyBootstrapDone", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public interface ISkylineRuntimeFromNative {
    void notifyBack(int i17, int i18);

    void notifyBackDone(int i17, int i18);

    void notifyBootstrapDone(long j17);

    void notifyRouteDone(int i17);

    void notifyWindowDestroy(int i17);

    void notifyWindowReady(int i17);

    void waitForBack(com.tencent.skyline.IRouteBackCallback iRouteBackCallback);
}
