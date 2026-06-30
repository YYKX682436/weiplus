package uz0;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f432125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f432126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f432127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uz0.n f432128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f432129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f432130i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f432131m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.internal.e0 e0Var, b0.p2 p2Var, kotlin.jvm.internal.e0 e0Var2, uz0.n nVar, boolean z17, int i17, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f432125d = e0Var;
        this.f432126e = p2Var;
        this.f432127f = e0Var2;
        this.f432128g = nVar;
        this.f432129h = z17;
        this.f432130i = i17;
        this.f432131m = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.o animateDecay = (z.o) obj;
        kotlin.jvm.internal.o.g(animateDecay, "$this$animateDecay");
        float floatValue = ((java.lang.Number) animateDecay.b()).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f432125d;
        float f17 = floatValue - e0Var.f310115d;
        b0.p2 p2Var = this.f432126e;
        float a17 = p2Var.a(f17);
        e0Var.f310115d = ((java.lang.Number) animateDecay.b()).floatValue();
        this.f432127f.f310115d = ((java.lang.Number) animateDecay.c()).floatValue();
        if (java.lang.Math.abs(f17 - a17) > 0.5f) {
            animateDecay.a();
        }
        uz0.n nVar = this.f432128g;
        uz0.s d17 = nVar.f432143a.d();
        if (d17 == null) {
            animateDecay.a();
        } else {
            boolean d18 = animateDecay.d();
            int i17 = this.f432130i;
            if (d18 && this.f432129h) {
                float floatValue2 = ((java.lang.Number) animateDecay.c()).floatValue();
                kotlin.jvm.internal.c0 c0Var = this.f432131m;
                if (floatValue2 > 0.0f && d17.a() == i17 - 1) {
                    c0Var.f310112d = true;
                    animateDecay.a();
                } else if (((java.lang.Number) animateDecay.c()).floatValue() < 0.0f && d17.a() == i17) {
                    c0Var.f310112d = true;
                    animateDecay.a();
                }
            }
            if (animateDecay.d() && uz0.n.b(nVar, animateDecay, d17, i17, new uz0.i(p2Var))) {
                animateDecay.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
