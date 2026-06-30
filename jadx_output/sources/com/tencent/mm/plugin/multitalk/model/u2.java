package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class u2 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f150154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f150155e;

    public u2(com.tencent.mm.plugin.multitalk.model.b3 b3Var, android.graphics.SurfaceTexture surfaceTexture) {
        this.f150154d = b3Var;
        this.f150155e = surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f150154d;
        b3Var.getClass();
        b3Var.a(new com.tencent.mm.plugin.multitalk.model.x2(b3Var));
        this.f150155e.updateTexImage();
    }
}
