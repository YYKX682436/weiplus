package df;

/* loaded from: classes15.dex */
public final class t implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.SwapRenderSurface f229550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.z f229551e;

    public t(io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface, df.z zVar) {
        this.f229550d = swapRenderSurface;
        this.f229551e = zVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        df.z zVar = this.f229551e;
        if (kotlin.jvm.internal.o.b(this.f229550d, zVar.f229618g)) {
            df.z.a(zVar, io.flutter.embedding.android.RenderMode.surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
