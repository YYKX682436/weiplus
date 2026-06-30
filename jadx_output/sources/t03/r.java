package t03;

/* loaded from: classes11.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f414503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t03.k0 k0Var, long j17) {
        super(0);
        this.f414502d = k0Var;
        this.f414503e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        t03.k0 k0Var = this.f414502d;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "setOnBufferingEndListener");
        pm0.v.X(new t03.q(this.f414503e, k0Var));
        return jz5.f0.f302826a;
    }
}
