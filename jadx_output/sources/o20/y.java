package o20;

/* loaded from: classes14.dex */
public final class y implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.player.EcsVideoView f342401d;

    public y(com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView) {
        this.f342401d = ecsVideoView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        o20.c0 c0Var;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        if (this.f342401d.f65937h != null) {
            android.graphics.SurfaceTexture surfaceTexture2 = this.f342401d.f65936g;
            if (surfaceTexture2 != null) {
                this.f342401d.f65933d.setSurfaceTexture(surfaceTexture2);
                return;
            }
            return;
        }
        this.f342401d.f65936g = surfaceTexture;
        this.f342401d.f65937h = new android.view.Surface(surfaceTexture);
        android.view.Surface surface = this.f342401d.f65937h;
        if (surface == null || (c0Var = this.f342401d.f65938i) == null) {
            return;
        }
        kk4.b.h(((o20.i) c0Var).f342382a, surface, false, 2, null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        return false;
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
