package com.tencent.mm.plugin.finder.view;

/* loaded from: classes14.dex */
public final class wm implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.xm f133300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f133302f;

    public wm(com.tencent.mm.plugin.finder.view.xm xmVar, yz5.l lVar, yz5.a aVar) {
        this.f133300d = xmVar;
        this.f133301e = lVar;
        this.f133302f = aVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.finder.view.xm xmVar = this.f133300d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = xmVar.f133350k;
        if (n3Var != null) {
            n3Var.post(new com.tencent.mm.plugin.finder.view.vm(xmVar, surface, this.f133301e, this.f133302f));
        } else {
            kotlin.jvm.internal.o.o("handler");
            throw null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f133300d.d();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
