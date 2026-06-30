package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f192226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.RfxPagView f192227e;

    public e(com.tencent.mm.rfx.RfxPagView rfxPagView, android.graphics.SurfaceTexture surfaceTexture) {
        this.f192227e = rfxPagView;
        this.f192226d = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192227e.destroySurface(this.f192226d);
    }
}
