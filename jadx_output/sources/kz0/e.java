package kz0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f313680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f313681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f313682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.jvm.internal.e0 e0Var, b0.p2 p2Var, kotlin.jvm.internal.e0 e0Var2) {
        super(1);
        this.f313680d = e0Var;
        this.f313681e = p2Var;
        this.f313682f = e0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.o animateDecay = (z.o) obj;
        kotlin.jvm.internal.o.g(animateDecay, "$this$animateDecay");
        float floatValue = ((java.lang.Number) animateDecay.b()).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f313680d;
        float f17 = floatValue - e0Var.f310115d;
        float a17 = this.f313681e.a(f17);
        e0Var.f310115d = ((java.lang.Number) animateDecay.b()).floatValue();
        this.f313682f.f310115d = ((java.lang.Number) animateDecay.c()).floatValue();
        if (java.lang.Math.abs(f17 - a17) > 0.5f) {
            animateDecay.a();
        }
        return jz5.f0.f302826a;
    }
}
