package nu0;

/* loaded from: classes5.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f340121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f340122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(nu0.b4 b4Var, int i17, yz5.a aVar, int i18) {
        super(0);
        this.f340119d = b4Var;
        this.f340120e = i17;
        this.f340121f = aVar;
        this.f340122g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nu0.q0 U6 = this.f340119d.U6();
        int i17 = this.f340120e;
        nu0.u3 u3Var = new nu0.u3(this.f340121f, this.f340119d, this.f340122g, i17);
        U6.getClass();
        java.lang.String d76 = U6.d7(i17);
        if (d76 != null) {
            com.tencent.maas.imagestudio.MJImageSession mJImageSession = U6.f340075r;
            if (mJImageSession != null) {
                mJImageSession.p(d76);
            }
            U6.X6(false, new nu0.o0(u3Var));
        }
        return jz5.f0.f302826a;
    }
}
