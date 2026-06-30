package ww5;

/* loaded from: classes8.dex */
public final class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final long f450400d;

    /* renamed from: e, reason: collision with root package name */
    public final vw5.c f450401e;

    public e(long j17, vw5.c delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f450400d = j17;
        this.f450401e = delegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450401e).b(this.f450400d, new android.view.Surface(surface));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450401e).c(this.f450400d);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        ((com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier) this.f450401e).a(this.f450400d, 0, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
