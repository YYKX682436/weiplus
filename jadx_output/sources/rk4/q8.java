package rk4;

/* loaded from: classes11.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il4.e f396945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f396946f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(java.lang.String str, il4.e eVar, rk4.z8 z8Var) {
        super(0);
        this.f396944d = str;
        this.f396945e = eVar;
        this.f396946f = z8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = jm4.m3.f300398e;
        java.lang.String str = this.f396944d;
        jm4.k3 k3Var = (jm4.k3) urgen.ur_0025.UR_65C4.UR_C306(new java.lang.String[]{str});
        kotlin.jvm.internal.o.e(k3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskServiceCpp");
        jm4.m3 m3Var = (jm4.m3) k3Var;
        il4.e eVar = this.f396945e;
        m3Var.e(eVar.f292106c);
        eVar.f292122s.f292135g = str;
        il4.l.q(eVar, false, null, null, 12, null);
        rk4.z8.wi(this.f396946f, m3Var, 0);
        return jz5.f0.f302826a;
    }
}
