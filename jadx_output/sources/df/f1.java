package df;

/* loaded from: classes13.dex */
public final class f1 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f229455d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.TextureView.SurfaceTextureListener f229456e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f229457f;

    public f1(android.view.TextureView.SurfaceTextureListener surfaceTextureListener, android.view.TextureView.SurfaceTextureListener newListener) {
        kotlin.jvm.internal.o.g(newListener, "newListener");
        this.f229455d = surfaceTextureListener;
        this.f229456e = newListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f229455d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i17, i18);
        }
        this.f229456e.onSurfaceTextureAvailable(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        boolean z17 = this.f229457f;
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f229456e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineSurfaceTextureListenerWrap", " skipTextureDestroyed=true ,can reuse SurfaceTexture again", new java.lang.Object[0]);
            this.f229457f = false;
            return surfaceTextureListener.onSurfaceTextureDestroyed(surface);
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineSurfaceTextureListenerWrap", " skipTextureDestroyed=false ,can;t reuse SurfaceTexture again", new java.lang.Object[0]);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f229455d;
        return (surfaceTextureListener2 != null ? surfaceTextureListener2.onSurfaceTextureDestroyed(surface) : true) || surfaceTextureListener.onSurfaceTextureDestroyed(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f229455d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i17, i18);
        }
        this.f229456e.onSurfaceTextureSizeChanged(surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f229455d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
        this.f229456e.onSurfaceTextureUpdated(surface);
    }
}
