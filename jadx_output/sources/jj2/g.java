package jj2;

/* loaded from: classes10.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f299983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f299984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f299985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f299986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jj2.a f299987h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f299988i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f299989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v65.n f299990n;

    public g(float f17, int i17, int i18, int i19, int i27, int i28, jj2.a aVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView, kotlin.jvm.internal.c0 c0Var, v65.n nVar) {
        this.f299983d = f17;
        this.f299984e = i17;
        this.f299985f = i18;
        this.f299986g = i27;
        this.f299987h = aVar;
        this.f299988i = ripperAnimateView;
        this.f299989m = c0Var;
        this.f299990n = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f299984e;
        float f18 = this.f299983d - ((int) ((r1 - f17) * floatValue));
        int i17 = this.f299985f - ((int) ((r0 - 1) * floatValue));
        int i18 = this.f299986g - ((int) ((r0 + 0) * floatValue));
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f299988i;
        jj2.d dVar = ripperAnimateView.f111720f;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("initData");
            throw null;
        }
        this.f299987h.b(new jj2.d(i17, dVar.f299975b, f18, i18, android.graphics.Paint.Style.STROKE));
        if (floatValue > 0.3f) {
            kotlin.jvm.internal.c0 c0Var = this.f299989m;
            if (c0Var.f310112d || !ripperAnimateView.f111723i) {
                return;
            }
            c0Var.f310112d = true;
            this.f299990n.a(jz5.f0.f302826a);
        }
    }
}
