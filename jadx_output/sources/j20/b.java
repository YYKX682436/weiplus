package j20;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f297218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j20.e f297219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar, j20.e eVar) {
        super(1);
        this.f297218d = lVar;
        this.f297219e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f297218d;
        if (booleanValue) {
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            d85.g0 g0Var = d85.g0.LOCAION;
            d85.f0 f0Var = d85.f0.G;
            if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
                lVar.invoke(0);
            } else {
                j20.a aVar = new j20.a(lVar);
                this.f297219e.getClass();
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(g0Var, f0Var, new j20.d(aVar));
            }
        } else {
            lVar.invoke(108);
        }
        return jz5.f0.f302826a;
    }
}
