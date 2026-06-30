package ee5;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f252070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ee5.z zVar) {
        super(2);
        this.f252070d = zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        ee5.z zVar = this.f252070d;
        fn5.n0 Q6 = zVar.Q6();
        kotlin.jvm.internal.o.f(Q6, "access$getImageDataQueryModel(...)");
        ee5.t tVar = new ee5.t(zVar);
        ee5.u uVar = new ee5.u(zVar);
        java.util.List list = fn5.n0.E;
        fn5.p.a(Q6, tVar, uVar, oVar, 8);
        return jz5.f0.f302826a;
    }
}
