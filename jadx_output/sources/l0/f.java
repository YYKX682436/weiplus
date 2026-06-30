package l0;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f314174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f314175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f314176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n0.e5 e5Var, d0.d2 d2Var, yz5.q qVar, int i17) {
        super(2);
        this.f314174d = e5Var;
        this.f314175e = d2Var;
        this.f314176f = qVar;
        this.f314177g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        n0.n1.a(new n0.i3[]{l0.n.f314384a.b(java.lang.Float.valueOf(e1.y.d(((e1.y) this.f314174d.getValue()).f246322a)))}, u0.j.b(oVar, -1699085201, true, new l0.e(this.f314175e, this.f314176f, this.f314177g)), oVar, 56);
        return jz5.f0.f302826a;
    }
}
