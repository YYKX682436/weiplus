package gf;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.f1 f271033d;

    public d1(gf.f1 f1Var) {
        this.f271033d = f1Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gf.c1] */
    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.embedding.engine.FlutterEngine attachedFlutterEngine;
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer;
        final gf.f1 f1Var = this.f271033d;
        io.flutter.embedding.android.FlutterView flutterView = (io.flutter.embedding.android.FlutterView) kz5.n0.Y(f1Var.f271056p);
        android.graphics.Bitmap bitmap = (flutterView == null || (attachedFlutterEngine = flutterView.getAttachedFlutterEngine()) == null || (renderer = attachedFlutterEngine.getRenderer()) == null) ? null : renderer.getBitmap();
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        f1Var.setForeground(new android.graphics.drawable.BitmapDrawable(f1Var.getResources(), bitmap));
        if (flutterView != null) {
            flutterView.removeOnFirstFrameRenderedListener((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) new kotlin.jvm.internal.y(f1Var) { // from class: gf.c1
                @Override // kotlin.jvm.internal.y, f06.s
                public java.lang.Object get() {
                    return ((gf.f1) this.receiver).f271059s;
                }
            }.get());
        }
    }
}
