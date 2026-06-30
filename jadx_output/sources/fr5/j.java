package fr5;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f265967a;

    /* renamed from: b, reason: collision with root package name */
    public final float f265968b;

    /* renamed from: c, reason: collision with root package name */
    public final float f265969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f265970d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Interpolator f265971e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f265972f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f265973g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f265974h;

    /* renamed from: i, reason: collision with root package name */
    public long f265975i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f265976j;

    public j(android.view.View view, float f17, float f18, int i17, android.view.animation.Interpolator interpolator, yz5.l onUpdateValue, yz5.a onEnd) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(interpolator, "interpolator");
        kotlin.jvm.internal.o.g(onUpdateValue, "onUpdateValue");
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        this.f265967a = view;
        this.f265968b = f17;
        this.f265969c = f18;
        this.f265970d = i17;
        this.f265971e = interpolator;
        this.f265972f = onUpdateValue;
        this.f265973g = onEnd;
        this.f265974h = new fr5.i(this);
    }

    public final void a() {
        if (this.f265976j) {
            this.f265976j = false;
            this.f265967a.removeCallbacks(this.f265974h);
            this.f265973g.invoke();
        }
    }
}
