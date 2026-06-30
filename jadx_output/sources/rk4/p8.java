package rk4;

/* loaded from: classes11.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f396908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f396909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f396910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.pp0 f396911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ il4.e f396912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rk4.z8 f396913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(java.util.List list, bw5.lp0 lp0Var, bw5.o50 o50Var, bw5.pp0 pp0Var, il4.e eVar, rk4.z8 z8Var) {
        super(0);
        this.f396908d = list;
        this.f396909e = lp0Var;
        this.f396910f = o50Var;
        this.f396911g = pp0Var;
        this.f396912h = eVar;
        this.f396913i = z8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zk4.l lVar = zk4.l.f473538a;
        java.util.List list = this.f396908d;
        if (list == null) {
            bw5.lp0 lp0Var = this.f396909e;
            list = lp0Var != null ? kz5.b0.c(lp0Var) : new java.util.LinkedList();
        }
        bw5.o50 o50Var = this.f396910f;
        bw5.pp0 pp0Var = this.f396911g;
        il4.e eVar = this.f396912h;
        rk4.z8.wi(this.f396913i, (jm4.m3) lVar.a(list, o50Var, pp0Var, eVar), eVar.f292105b);
        return jz5.f0.f302826a;
    }
}
