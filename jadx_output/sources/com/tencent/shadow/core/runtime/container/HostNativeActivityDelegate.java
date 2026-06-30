package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public interface HostNativeActivityDelegate extends com.tencent.shadow.core.runtime.container.HostActivityDelegate {
    android.content.pm.PackageManager getPackageManager();

    void onGlobalLayout();

    void onInputQueueCreated(android.view.InputQueue inputQueue);

    void onInputQueueDestroyed(android.view.InputQueue inputQueue);

    void onPostSuperOnCreate();

    void onPreSuperOnCreate();

    void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19);

    void surfaceCreated(android.view.SurfaceHolder surfaceHolder);

    void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder);

    void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder);
}
