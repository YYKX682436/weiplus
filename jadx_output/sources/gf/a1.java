package gf;

/* loaded from: classes7.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.f1 f271010d;

    public a1(gf.f1 f1Var) {
        this.f271010d = f1Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gf.z0] */
    @Override // java.lang.Runnable
    public final void run() {
        final gf.f1 f1Var = this.f271010d;
        android.graphics.drawable.Drawable foreground = f1Var.getForeground();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = foreground instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) foreground : null;
        android.graphics.Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        f1Var.setForeground(null);
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        io.flutter.embedding.android.FlutterView flutterView = (io.flutter.embedding.android.FlutterView) kz5.n0.Y(f1Var.f271056p);
        if (flutterView != null) {
            flutterView.removeOnFirstFrameRenderedListener((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) new kotlin.jvm.internal.y(f1Var) { // from class: gf.z0
                @Override // kotlin.jvm.internal.y, f06.s
                public java.lang.Object get() {
                    return ((gf.f1) this.receiver).f271059s;
                }
            }.get());
        }
    }
}
