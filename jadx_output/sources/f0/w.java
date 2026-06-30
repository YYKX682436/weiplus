package f0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f258255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f258256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n0.e5 e5Var, n0.v2 v2Var) {
        super(0);
        this.f258255d = e5Var;
        this.f258256e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f0.z0 z0Var = new f0.z0();
        ((yz5.l) this.f258255d.getValue()).invoke(z0Var);
        return new f0.b0(z0Var.f258281a, z0Var.f258282b, (e06.k) this.f258256e.getValue());
    }
}
