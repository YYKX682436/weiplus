package dr4;

/* loaded from: classes14.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f242666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(dr4.n0 n0Var, int i17) {
        super(0);
        this.f242666d = n0Var;
        this.f242667e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.r1 r1Var;
        dr4.n0 n0Var = this.f242666d;
        if (n0Var.f242692r == 1 && (r1Var = n0Var.f242686l) != null) {
            r1Var.D(this.f242667e);
        }
        return jz5.f0.f302826a;
    }
}
