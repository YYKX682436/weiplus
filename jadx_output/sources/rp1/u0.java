package rp1;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f398530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f398531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(rp1.v0 v0Var, boolean z17) {
        super(0);
        this.f398530d = v0Var;
        this.f398531e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rp1.v0 v0Var = this.f398530d;
        boolean z17 = this.f398531e;
        v0Var.f398539c = z17;
        rp1.p0 p0Var = v0Var.f398540d;
        if (p0Var != null) {
            p0Var.a(z17);
        }
        return jz5.f0.f302826a;
    }
}
