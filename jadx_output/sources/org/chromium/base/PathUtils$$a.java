package org.chromium.base;

/* loaded from: classes13.dex */
public final /* synthetic */ class PathUtils$$a implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String[] privateDirectoryPathInternal;
        privateDirectoryPathInternal = org.chromium.base.PathUtils.setPrivateDirectoryPathInternal();
        return privateDirectoryPathInternal;
    }
}
