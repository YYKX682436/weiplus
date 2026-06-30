package rk4;

/* loaded from: classes11.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f397109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f397110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ il4.e f397111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(bw5.lp0 lp0Var, bw5.o50 o50Var, il4.e eVar) {
        super(0);
        this.f397109d = lp0Var;
        this.f397110e = o50Var;
        this.f397111f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zk4.l lVar = zk4.l.f473538a;
        jm4.g3 b17 = lVar.b();
        java.util.List c17 = kz5.b0.c(this.f397109d);
        bw5.o50 o50Var = this.f397110e;
        il4.e eVar = this.f397111f;
        jm4.m3 m3Var = (jm4.m3) lVar.a(c17, o50Var, null, eVar);
        if (b17 != null) {
            jm4.f3.a(b17, m3Var, eVar.f292105b, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
