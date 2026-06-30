package mf3;

/* loaded from: classes3.dex */
public final class y implements mg3.e, mf3.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f326133d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.n f326134e;

    /* renamed from: f, reason: collision with root package name */
    public final lf3.j f326135f;

    /* renamed from: g, reason: collision with root package name */
    public float f326136g;

    /* renamed from: h, reason: collision with root package name */
    public int f326137h;

    /* renamed from: i, reason: collision with root package name */
    public int f326138i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f326139m;

    public y(android.view.View content, mf3.n layer, lf3.j jVar) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(layer, "layer");
        this.f326133d = content;
        this.f326134e = layer;
        this.f326135f = jVar;
        this.f326136g = 1.0f;
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        int i17;
        int i18 = this.f326138i;
        android.view.View view = this.f326133d;
        if (i18 == 0 || this.f326137h == 0) {
            this.f326138i = view.getHeight();
            this.f326137h = view.getWidth();
        }
        if (this.f326137h == 0 || (i17 = this.f326138i) == 0) {
            return;
        }
        float f19 = 1;
        float f27 = f19 - (f18 / i17);
        if (f27 > 1.0f) {
            f27 = 1.0f;
        }
        view.setPivotX(r0 / 2);
        view.setPivotY(this.f326138i / 2);
        view.setScaleX(f27);
        view.setScaleY(f27);
        view.setTranslationX(f17);
        view.setTranslationY(f18);
        lf3.j jVar = this.f326135f;
        if (jVar != null) {
            jVar.d3(f27);
        }
        this.f326136g = f27;
        this.f326134e.d(f19 - f27);
        if (this.f326139m) {
            if (f17 == 0.0f) {
                if (f18 == 0.0f) {
                    this.f326139m = false;
                }
            }
        }
        if (this.f326139m) {
            return;
        }
        if (java.lang.Math.abs(f17) > 10.0d || java.lang.Math.abs(f18) > 10.0d) {
            this.f326139m = true;
        }
    }

    @Override // mg3.e
    public void d() {
        float f17 = this.f326136g;
        android.view.View view = this.f326133d;
        if (f17 < 1.0f) {
            lf3.j jVar = this.f326135f;
            if (jVar != null) {
                jVar.E2(view);
                return;
            }
            return;
        }
        view.setPivotX(this.f326137h / 2);
        view.setPivotY(this.f326138i / 2);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return this.f326134e.n(event);
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // mf3.o
    public void j() {
        lf3.j jVar = this.f326135f;
        if (jVar != null) {
            jVar.E2(this.f326133d);
        }
    }
}
