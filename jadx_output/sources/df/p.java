package df;

/* loaded from: classes15.dex */
public final class p extends bj0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.z f229530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.FlutterTextureView f229531e;

    public p(df.z zVar, io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
        this.f229530d = zVar;
        this.f229531e = flutterTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        df.z zVar = this.f229530d;
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = zVar.getRenderSurface();
        io.flutter.embedding.android.FlutterTextureView flutterTextureView = this.f229531e;
        if (kotlin.jvm.internal.o.b(renderSurface, flutterTextureView) && flutterTextureView.isAvailableForRendering()) {
            df.z.a(zVar, io.flutter.embedding.android.RenderMode.texture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        kotlin.jvm.internal.o.b(this.f229530d.getRenderSurface(), this.f229531e);
        return false;
    }
}
