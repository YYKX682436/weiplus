package ig2;

/* loaded from: classes3.dex */
public class p implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f291412d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f291413e;

    public p(java.lang.String source, boolean z17) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f291412d = source;
        this.f291413e = z17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("FluentSwitchTextureView", this.f291412d + " onSurfaceTextureAvailable surface:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("FluentSwitchTextureView", this.f291412d + " onSurfaceTextureDestroyed surface:" + surface);
        return this.f291413e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("FluentSwitchTextureView", this.f291412d + " onSurfaceTextureSizeChanged surface:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
