package tj3;

/* loaded from: classes8.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f419760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f419761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f419762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f419763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f419764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f419765i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f419766m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f419767n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f419768o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f419769p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f419770q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f419771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f419772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f419773t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f419774u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f419775v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f419776w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f419777x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f419778y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f419779z;

    public m(tj3.p pVar, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, float f48, float f49, float f57, float f58, float f59, float f66, int i17, int i18, float f67, float f68) {
        this.f419760d = pVar;
        this.f419761e = f17;
        this.f419762f = f18;
        this.f419763g = f19;
        this.f419764h = f27;
        this.f419765i = f28;
        this.f419766m = f29;
        this.f419767n = f37;
        this.f419768o = f38;
        this.f419769p = f39;
        this.f419770q = f47;
        this.f419771r = f48;
        this.f419772s = f49;
        this.f419773t = f57;
        this.f419774u = f58;
        this.f419775v = f59;
        this.f419776w = f66;
        this.f419777x = i17;
        this.f419778y = i18;
        this.f419779z = f67;
        this.A = f68;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        tj3.p pVar = this.f419760d;
        pVar.f419784c.setX((it.getAnimatedFraction() * this.f419761e) + this.f419762f);
        pVar.f419784c.setY((it.getAnimatedFraction() * this.f419763g) + this.f419764h);
        pVar.f419785d.setX((it.getAnimatedFraction() * this.f419765i) + this.f419766m);
        pVar.f419785d.setY((it.getAnimatedFraction() * this.f419767n) + this.f419768o);
        pVar.d().setX((it.getAnimatedFraction() * this.f419769p) + this.f419770q);
        pVar.d().setY((it.getAnimatedFraction() * this.f419771r) + this.f419772s);
        pVar.c().setX((it.getAnimatedFraction() * this.f419773t) + this.f419774u);
        pVar.c().setY((it.getAnimatedFraction() * this.f419775v) + this.f419776w);
        android.view.ViewGroup.LayoutParams layoutParams = pVar.c().getLayoutParams();
        layoutParams.width = (int) ((it.getAnimatedFraction() * this.f419777x) + this.f419778y);
        pVar.c().setLayoutParams(layoutParams);
        android.widget.RelativeLayout c17 = pVar.c();
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f419779z;
        float f18 = this.A;
        c17.setAlpha((animatedFraction * f17) + f18);
        pVar.d().setAlpha((it.getAnimatedFraction() * f17) + f18);
    }
}
