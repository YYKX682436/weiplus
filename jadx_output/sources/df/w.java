package df;

/* loaded from: classes15.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.RenderSurface f229566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.z f229567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229568g;

    public w(kotlinx.coroutines.q qVar, io.flutter.embedding.engine.renderer.RenderSurface renderSurface, df.z zVar, io.flutter.embedding.android.RenderMode renderMode) {
        this.f229565d = qVar;
        this.f229566e = renderSurface;
        this.f229567f = zVar;
        this.f229568g = renderMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f229566e;
        kotlinx.coroutines.q qVar = this.f229565d;
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) qVar;
        if (rVar.n()) {
            try {
                android.graphics.SurfaceTexture surfaceTexture = ((io.flutter.embedding.android.FlutterTextureView) renderSurface).getSurfaceTexture();
                if (surfaceTexture != null) {
                    ((io.flutter.embedding.android.FlutterTextureView) renderSurface).setRenderSurface(new android.view.Surface(surfaceTexture));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterView", "set renderSurface error, may cause flash", e17);
            }
            df.z zVar = this.f229567f;
            if (zVar.getRenderSurface().isAvailableForRendering()) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
                return;
            }
            io.flutter.embedding.android.RenderMode renderMode = this.f229568g;
            df.v vVar = new df.v(qVar, zVar, renderMode);
            if (renderMode == io.flutter.embedding.android.RenderMode.surface) {
                zVar.f229621m.add(vVar);
            } else if (renderMode == io.flutter.embedding.android.RenderMode.texture) {
                zVar.f229620i.add(vVar);
            }
        }
    }
}
