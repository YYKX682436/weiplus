package n0;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f333734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n0.y0 y0Var, int i17) {
        super(2);
        this.f333734d = y0Var;
        this.f333735e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = obj2 instanceof n0.e4;
        int i17 = this.f333735e;
        n0.y0 y0Var = this.f333734d;
        if (z17) {
            y0Var.E.l(i17);
            y0Var.J(false, new n0.u(obj2, i17, intValue));
        } else if (obj2 instanceof n0.l3) {
            n0.l3 l3Var = (n0.l3) obj2;
            n0.j1 j1Var = l3Var.f333605a;
            if (j1Var != null) {
                j1Var.f333559t = true;
                l3Var.f333605a = null;
            }
            y0Var.E.l(i17);
            y0Var.J(false, new n0.v(obj2, i17, intValue));
        }
        return jz5.f0.f302826a;
    }
}
