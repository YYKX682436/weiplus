package df;

/* loaded from: classes15.dex */
public final class r extends bj0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.z f229541d;

    public r(df.z zVar) {
        this.f229541d = zVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        df.z zVar = this.f229541d;
        if (kotlin.jvm.internal.o.b(surface, zVar.f229618g)) {
            df.z.a(zVar, io.flutter.embedding.android.RenderMode.texture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        return false;
    }

    @Override // bj0.a, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
