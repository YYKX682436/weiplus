package gf;

/* loaded from: classes7.dex */
public final class u1 implements io.flutter.embedding.engine.renderer.FlutterUiDisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f271177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f271178b;

    public u1(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, java.lang.Runnable runnable) {
        this.f271177a = flutterRenderer;
        this.f271178b = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiDisplayed() {
        this.f271177a.removeIsDisplayingFlutterUiListener(this);
        this.f271178b.run();
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiNoLongerDisplayed() {
    }
}
