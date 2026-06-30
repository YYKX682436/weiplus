package uz0;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f432138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f432139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f432140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uz0.n f432141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f432142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.internal.e0 e0Var, b0.p2 p2Var, kotlin.jvm.internal.e0 e0Var2, uz0.n nVar, int i17) {
        super(1);
        this.f432138d = e0Var;
        this.f432139e = p2Var;
        this.f432140f = e0Var2;
        this.f432141g = nVar;
        this.f432142h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.o animateTo = (z.o) obj;
        kotlin.jvm.internal.o.g(animateTo, "$this$animateTo");
        float floatValue = ((java.lang.Number) animateTo.b()).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f432138d;
        float f17 = floatValue - e0Var.f310115d;
        b0.p2 p2Var = this.f432139e;
        float a17 = p2Var.a(f17);
        e0Var.f310115d = ((java.lang.Number) animateTo.b()).floatValue();
        this.f432140f.f310115d = ((java.lang.Number) animateTo.c()).floatValue();
        uz0.n nVar = this.f432141g;
        uz0.s d17 = nVar.f432143a.d();
        if (d17 == null) {
            animateTo.a();
        } else {
            if (uz0.n.b(nVar, animateTo, d17, this.f432142h, new uz0.l(p2Var))) {
                animateTo.a();
            } else if (java.lang.Math.abs(f17 - a17) > 0.5f) {
                animateTo.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
