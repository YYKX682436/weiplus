package m85;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.SnsWithTaUI f324829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.sns_compose.SnsWithTaUI snsWithTaUI) {
        super(2);
        this.f324829d = snsWithTaUI;
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
        int i17 = com.tencent.mm.sns_compose.SnsWithTaUI.f193421g;
        com.tencent.mm.sns_compose.page.p1 p1Var = (com.tencent.mm.sns_compose.page.p1) ((jz5.n) this.f324829d.f193424f).getValue();
        kotlin.jvm.internal.o.f(p1Var, "access$getViewModel(...)");
        com.tencent.mm.sns_compose.page.j1.e(p1Var, oVar, 8);
        return jz5.f0.f302826a;
    }
}
