package df;

/* loaded from: classes15.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.SwapRenderSurface f229545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.z f229546e;

    public s(io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface, df.z zVar) {
        this.f229545d = swapRenderSurface;
        this.f229546e = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface = this.f229545d;
        ((io.flutter.embedding.android.SwapTextureViewRenderSurface) swapRenderSurface).setSurfaceTextureListener(new df.f1(((io.flutter.embedding.android.SwapTextureViewRenderSurface) swapRenderSurface).getSurfaceTextureListener(), new df.r(this.f229546e)));
    }
}
