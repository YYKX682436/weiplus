package fr5;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f266010a;

    /* renamed from: b, reason: collision with root package name */
    public final er5.c f266011b;

    /* renamed from: c, reason: collision with root package name */
    public final er5.g f266012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f266013d;

    /* renamed from: e, reason: collision with root package name */
    public final int f266014e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f266015f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f266016g;

    /* renamed from: h, reason: collision with root package name */
    public final fr5.j f266017h;

    public q(android.view.View view, er5.c scrollBarSpec, er5.g zoomableEngine) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(scrollBarSpec, "scrollBarSpec");
        kotlin.jvm.internal.o.g(zoomableEngine, "zoomableEngine");
        this.f266010a = view;
        this.f266011b = scrollBarSpec;
        this.f266012c = zoomableEngine;
        this.f266013d = 255;
        this.f266014e = a06.d.b(scrollBarSpec.f256231b / 2);
        this.f266016g = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(scrollBarSpec.f256230a);
        paint.setAlpha(255);
        this.f266015f = paint;
        this.f266017h = new fr5.j(view, 255, 0.0f, 300, new android.view.animation.DecelerateInterpolator(), new fr5.n(this), fr5.o.f266004d);
        view.addOnAttachStateChangeListener(new fr5.p(this));
    }
}
