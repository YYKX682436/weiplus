package df;

/* loaded from: classes15.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f229508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.m0 f229509e;

    public l0(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, df.m0 m0Var) {
        this.f229508d = flutterRenderer;
        this.f229509e = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f229508d.removeIsDisplayingFlutterUiListener(this.f229509e);
    }
}
