package df;

/* loaded from: classes15.dex */
public final class o implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.z f229526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.FlutterSurfaceView f229527e;

    public o(df.z zVar, io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView) {
        this.f229526d = zVar;
        this.f229527e = flutterSurfaceView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        df.z zVar = this.f229526d;
        if (kotlin.jvm.internal.o.b(zVar.getRenderSurface(), this.f229527e)) {
            df.z.a(zVar, io.flutter.embedding.android.RenderMode.surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
