package gx0;

/* loaded from: classes5.dex */
public final class z5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.c f277259e;

    public z5(gx0.w8 w8Var, com.tencent.maas.moviecomposing.c cVar) {
        this.f277258d = w8Var;
        this.f277259e = cVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gx0.w8 w8Var = this.f277258d;
        w8Var.A7().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        float width = w8Var.A7().getWidth();
        float height = w8Var.A7().getHeight();
        android.widget.FrameLayout y76 = w8Var.y7();
        com.tencent.maas.moviecomposing.c cVar = this.f277259e;
        java.lang.Float a17 = by0.b.a(cVar);
        by0.b.b(y76, a17 != null ? a17.floatValue() : 0.5625f, width, height);
        android.widget.FrameLayout z76 = w8Var.z7();
        java.lang.Float a18 = by0.b.a(cVar);
        by0.b.b(z76, a18 != null ? a18.floatValue() : 0.5625f, width, height);
        android.view.ViewGroup B7 = w8Var.B7();
        java.lang.Float a19 = by0.b.a(cVar);
        by0.b.b(B7, a19 != null ? a19.floatValue() : 0.5625f, width, height);
    }
}
