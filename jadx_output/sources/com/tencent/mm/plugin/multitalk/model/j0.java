package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class j0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitalk.model.j0 f150018d = new com.tencent.mm.plugin.multitalk.model.j0();

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkCameraManager", "updateTexImage error");
        }
    }
}
