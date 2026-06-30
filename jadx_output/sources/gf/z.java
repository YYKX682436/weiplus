package gf;

/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics f271194a = new io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics();

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f271195b;

    public z(android.view.View view) {
        this.f271195b = view;
    }

    public final int a(android.view.WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < this.f271195b.getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }
}
