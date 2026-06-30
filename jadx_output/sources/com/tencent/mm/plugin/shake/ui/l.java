package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.plugin.shake.ui.k {

    /* renamed from: g, reason: collision with root package name */
    public final int f162292g;

    /* renamed from: h, reason: collision with root package name */
    public final int f162293h;

    /* renamed from: i, reason: collision with root package name */
    public final float f162294i;

    /* renamed from: m, reason: collision with root package name */
    public final float f162295m;

    /* renamed from: n, reason: collision with root package name */
    public float f162296n;

    /* renamed from: o, reason: collision with root package name */
    public float f162297o;

    /* renamed from: p, reason: collision with root package name */
    public final float f162298p;

    /* renamed from: q, reason: collision with root package name */
    public float f162299q;

    /* renamed from: r, reason: collision with root package name */
    public float f162300r;

    /* renamed from: s, reason: collision with root package name */
    public float f162301s;

    /* renamed from: t, reason: collision with root package name */
    public float f162302t;

    /* renamed from: u, reason: collision with root package name */
    public float f162303u;

    public l(com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame shakeEggAnimFrame, int i17, int i18) {
        super(shakeEggAnimFrame);
        this.f162298p = 0.01f;
        this.f162299q = 0.02f;
        this.f162292g = i17;
        this.f162293h = i18;
        int i19 = com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame.f162091e;
        float random = 0.1f + (((float) java.lang.Math.random()) * 0.79999995f);
        this.f162294i = random;
        this.f162295m = random;
        this.f162297o = (-0.3f) + (((float) java.lang.Math.random()) * 0.20000002f);
        a();
    }

    public final void a() {
        float f17 = this.f162297o;
        if (f17 > 0.0f) {
            this.f162299q += this.f162298p;
        }
        this.f162296n = f17;
        this.f162297o = this.f162299q + f17;
        if (f17 > 1.1f) {
            iz5.a.g(null, this.f162286d != null);
            this.f162286d.post(new com.tencent.mm.plugin.shake.ui.j(this));
        }
        float f18 = this.f162292g;
        this.f162300r = this.f162294i * f18;
        this.f162301s = this.f162295m * f18;
        float f19 = this.f162296n;
        float f27 = this.f162293h;
        this.f162302t = f19 * f27;
        this.f162303u = this.f162297o * f27;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        float f18 = this.f162300r;
        float f19 = this.f162302t;
        float f27 = this.f162301s;
        if (f18 != f27) {
            f18 += (f27 - f18) * f17;
        }
        float f28 = this.f162303u;
        if (f19 != f28) {
            f19 += (f28 - f19) * f17;
        }
        transformation.getMatrix().setTranslate(f18, f19);
        if (f17 == 1.0f) {
            a();
        }
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
        setRepeatCount(-1);
        setDuration(this.f162287e);
    }
}
