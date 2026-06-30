package en5;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.k f255514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fn5.n0 n0Var, c1.k kVar) {
        super(1);
        this.f255513d = n0Var;
        this.f255514e = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        aq.v0 it = (aq.v0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        f65.p.f259934a.b(7);
        f65.o oVar = f65.o.f259912a;
        oVar.c(56);
        oVar.c(57);
        fn5.n0 n0Var = this.f255513d;
        java.lang.String str = it.f12986a;
        n0Var.P6(str, it.f12987b);
        f65.p.f259946m = 3;
        java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        f65.p.f259945l = sessionId;
        f65.p.f259949p = str;
        oVar.f();
        oVar.e(str);
        f65.o.f259922k = 2;
        oVar.c(52);
        c1.j.a(this.f255514e, false, 1, null);
        return jz5.f0.f302826a;
    }
}
