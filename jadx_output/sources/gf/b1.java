package gf;

/* loaded from: classes7.dex */
public final class b1 implements io.flutter.embedding.engine.renderer.FlutterUiDisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf.f1 f271025a;

    public b1(gf.f1 f1Var) {
        this.f271025a = f1Var;
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiDisplayed() {
        gf.f1 f1Var = this.f271025a;
        f1Var.f271057q.removeCallbacks(f1Var.f271058r);
        f1Var.f271057q.post(f1Var.f271058r);
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiNoLongerDisplayed() {
    }
}
