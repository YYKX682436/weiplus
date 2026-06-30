package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f192228d;

    public f(com.tencent.mm.rfx.RfxPagView rfxPagView, android.graphics.SurfaceTexture surfaceTexture) {
        this.f192228d = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192228d.release();
    }
}
