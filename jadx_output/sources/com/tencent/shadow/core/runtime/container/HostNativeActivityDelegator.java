package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public interface HostNativeActivityDelegator extends com.tencent.shadow.core.runtime.container.HostActivityDelegator {
    void superOnGlobalLayout();

    void superOnInputQueueCreated(android.view.InputQueue inputQueue);

    void superOnInputQueueDestroyed(android.view.InputQueue inputQueue);

    void superSurfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19);

    void superSurfaceCreated(android.view.SurfaceHolder surfaceHolder);

    void superSurfaceDestroyed(android.view.SurfaceHolder surfaceHolder);

    void superSurfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder);
}
