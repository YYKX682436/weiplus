package t03;

/* loaded from: classes11.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f414514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t03.k0 k0Var, long j17) {
        super(0);
        this.f414513d = k0Var;
        this.f414514e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        t03.k0 k0Var = this.f414513d;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "setOnBufferingStartListener");
        pm0.v.X(new t03.t(this.f414514e, k0Var));
        return jz5.f0.f302826a;
    }
}
