package qy0;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f367594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ty0.b1 b1Var, yz5.a aVar) {
        super(3);
        this.f367594d = b1Var;
        this.f367595e = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).f(booleanValue) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        if (booleanValue) {
            ty0.z0.f((com.tencent.maas.model.MJMusicInfo) this.f367594d.f422792b.getValue(), ty0.a1.f422774j, this.f367595e, oVar, 56);
        }
        return jz5.f0.f302826a;
    }
}
