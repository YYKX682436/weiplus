package ty0;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f422940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f422942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yz5.q qVar, yz5.a aVar, ty0.b1 b1Var) {
        super(2);
        this.f422940d = qVar;
        this.f422941e = aVar;
        this.f422942f = b1Var;
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
        java.lang.Object obj3 = n0.e1.f333492a;
        ty0.z0.i(this.f422940d, this.f422941e, this.f422942f, oVar, 512);
        return jz5.f0.f302826a;
    }
}
