package d0;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f225075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.g0 f225076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225077f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yz5.q qVar, d0.g0 g0Var, int i17) {
        super(2);
        this.f225075d = qVar;
        this.f225076e = g0Var;
        this.f225077f = i17;
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
        this.f225075d.invoke(this.f225076e, oVar, java.lang.Integer.valueOf((this.f225077f >> 6) & 112));
        return jz5.f0.f302826a;
    }
}
