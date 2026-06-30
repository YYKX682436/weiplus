package ne4;

/* loaded from: classes9.dex */
public class m implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public d50.o f336566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f336567b;

    public m(d50.o oVar, int i17) {
        this.f336566a = oVar;
        this.f336567b = i17;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.a aVar = (eu5.a) eVar;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SOTER_AUTHORIZE_FAILURE_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "request authorize result: %s, %s, %s", java.lang.Integer.valueOf(aVar.f475605a), aVar.f475606b, java.lang.Integer.valueOf(intValue));
        if (aVar.a()) {
            gm0.j1.u().c().x(u3Var, 0);
            d50.o oVar = this.f336566a;
            if (oVar != null) {
                oVar.b(aVar);
            }
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "5", "3", java.lang.String.valueOf(aVar.f475605a), aVar.f475606b, java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), "", java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) > 1.0f ? 1 : 0));
            int i17 = aVar.f475605a;
            if (i17 == 1007 || i17 == 1027 || i17 == 1018) {
                cu5.b.f(this.f336567b);
                int i18 = intValue + 1;
                if (i18 >= 2) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterManager", "authorize need remove ask");
                    wt5.a.r();
                }
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i18));
            }
            d50.o oVar2 = this.f336566a;
            if (oVar2 != null) {
                oVar2.c(0, aVar);
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17805, java.lang.Integer.valueOf(aVar.f475605a), aVar.f475606b);
    }
}
