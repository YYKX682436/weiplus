package gp2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gp2.l0 l0Var) {
        super(2);
        this.f274230d = l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3847p8).getValue()).r()).intValue() == 1) {
            pm0.v.X(new gp2.i(this.f274230d, longValue, longValue2));
        }
        return jz5.f0.f302826a;
    }
}
