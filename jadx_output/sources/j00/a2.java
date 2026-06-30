package j00;

/* loaded from: classes9.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d2 f296708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f296709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(j00.d2 d2Var, boolean z17, java.lang.String str) {
        super(0);
        this.f296708d = d2Var;
        this.f296709e = z17;
        this.f296710f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j00.d2 d2Var = this.f296708d;
        d2Var.getClass();
        j00.n nVar = j00.n.f296837a;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) j00.n.f296838b).getValue()).booleanValue();
        boolean z17 = this.f296709e;
        java.lang.String str = this.f296710f;
        if (booleanValue) {
            c00.e4 wi6 = ((b00.t2) ((c00.f4) i95.n0.c(c00.f4.class))).wi(str, null);
            bw5.x7 wi7 = d2Var.wi(z17);
            if (wi7 != null) {
                pm0.v.L("EcsGiftPreloadNew", true, new j00.f(wi7, z17, str, wi6.f36969c));
            }
        } else {
            c00.j3 j3Var = new c00.j3(str, ((b00.t2) ((c00.f4) i95.n0.c(c00.f4.class))).wi(str, null));
            int wi8 = z17 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 1;
            b00.d dVar = b00.d.f16648a;
            java.lang.String a17 = dVar.a().a(z17 ? 1 : 0, j3Var.f36992a);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(a17);
            j00.x1 x1Var = new j00.x1(d2Var, z17, j3Var, wi8);
            if (!K0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "onExposureEnterSendGift preload directly with ticket: ".concat(a17));
                x1Var.invoke(a17);
            }
            dVar.a().c(z17 ? 1 : 0, str, new j00.w1(K0, z17, j3Var, x1Var));
        }
        return jz5.f0.f302826a;
    }
}
