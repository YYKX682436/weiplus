package te2;

/* loaded from: classes14.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x91.h f418426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(te2.a3 a3Var, x91.h hVar) {
        super(0);
        this.f418425d = a3Var;
        this.f418426e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk2.e eVar;
        te2.a3 a3Var = this.f418425d;
        java.lang.String str = a3Var.f417860h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLinkingDevice mrDevice:");
        x91.h hVar = this.f418426e;
        sb6.append(hVar);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        te2.b2 b2Var = a3Var.f417859g;
        je2.i iVar = (b2Var == null || (eVar = ((te2.l2) b2Var).f418191d) == null) ? null : (je2.i) eVar.a(je2.i.class);
        if (iVar != null) {
            iVar.f299235f = hVar;
        }
        a3Var.g(a3Var.f417864o);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327727i, a3Var.a());
        return jz5.f0.f302826a;
    }
}
