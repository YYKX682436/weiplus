package lr;

/* loaded from: classes13.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.j1 f320526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(lr.j1 j1Var) {
        super(1);
        this.f320526d = j1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        if (v75Var != null) {
            lr.j1 j1Var = this.f320526d;
            r45.v75 v75Var2 = j1Var.f320548s;
            if (v75Var2 != null && v75Var.f387964d == v75Var2.f387964d) {
                j1Var.f320548s = v75Var;
                j1Var.l();
            }
        }
        return jz5.f0.f302826a;
    }
}
