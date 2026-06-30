package qi2;

/* loaded from: classes10.dex */
public final class l implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qi2.n f363564a;

    public l(qi2.n nVar) {
        this.f363564a = nVar;
    }

    @Override // si2.b
    public com.tencent.mm.plugin.finder.live.plugin.l a() {
        return this.f363564a.f363577h.a();
    }

    @Override // si2.b
    public void b(dk2.m battleData, yz5.l lVar) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.o.g(battleData, "battleData");
        qi2.n nVar = this.f363564a;
        dk2.u4 u4Var = ((mm2.o4) nVar.f363577h.g().a(mm2.o4.class)).Z;
        java.lang.Boolean valueOf = u4Var != null ? java.lang.Boolean.valueOf(u4Var.i()) : null;
        zh2.c cVar = nVar.f363577h;
        dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        int i17 = 1;
        boolean z17 = false;
        if (u4Var2 != null) {
            bool = java.lang.Boolean.valueOf(u4Var2.f234158e == 7);
        } else {
            bool = null;
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("VisitorPkPanelWidget", "onLaunchVisitorBattle isBattleFinish: " + valueOf + " isBattlePublicityFinish: " + bool, null);
        dk2.u4 u4Var3 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        if (u4Var3 != null && u4Var3.g()) {
            z17 = true;
        }
        if (!z17) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (kotlin.jvm.internal.o.b(valueOf, bool2) || kotlin.jvm.internal.o.b(bool, bool2)) {
                cVar.b(battleData, new qi2.j(lVar, nVar));
                return;
            }
        }
        qf2.y1 y1Var = (qf2.y1) cVar.getController(qf2.y1.class);
        if (y1Var != null) {
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            if (!kotlin.jvm.internal.o.b(valueOf, bool3) && !kotlin.jvm.internal.o.b(bool, bool3)) {
                i17 = 2;
            }
            qi2.k kVar = new qi2.k(lVar, nVar);
            ((mm2.y2) y1Var.business(mm2.y2.class)).f329568u = battleData;
            com.tencent.mm.plugin.finder.live.util.y.d(y1Var, null, null, new qf2.n1(y1Var, battleData, i17, kVar, null), 3, null);
        }
    }
}
