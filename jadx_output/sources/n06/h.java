package n06;

/* loaded from: classes15.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.i f333978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e26.c0 f333979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n06.i iVar, e26.c0 c0Var) {
        super(0);
        this.f333978d = iVar;
        this.f333979e = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n06.i iVar = this.f333978d;
        yz5.l lVar = iVar.f333986b;
        o06.v0 v0Var = iVar.f333985a;
        r06.t tVar = new r06.t((o06.m) lVar.invoke(v0Var), n06.i.f333983g, o06.t0.f341988h, o06.h.f341961e, kz5.b0.c(v0Var.h().f()), o06.x1.f342004a, false, this.f333979e);
        tVar.u0(new n06.a(this.f333979e, tVar), kz5.r0.f314002d, null);
        return tVar;
    }
}
