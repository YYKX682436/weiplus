package dr4;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f242660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(dr4.n0 n0Var, int i17) {
        super(0);
        this.f242660d = n0Var;
        this.f242661e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.r1 r1Var;
        dr4.n0 n0Var = this.f242660d;
        if (n0Var.f242692r == 1 && (r1Var = n0Var.f242686l) != null) {
            r1Var.C(this.f242661e);
        }
        return jz5.f0.f302826a;
    }
}
