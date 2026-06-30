package m85;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.SnsWithTaUI f324830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.sns_compose.SnsWithTaUI snsWithTaUI) {
        super(2);
        this.f324830d = snsWithTaUI;
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
        m85.h.a(u0.j.b(oVar, 2099685198, true, new m85.c(this.f324830d)), oVar, 6);
        return jz5.f0.f302826a;
    }
}
