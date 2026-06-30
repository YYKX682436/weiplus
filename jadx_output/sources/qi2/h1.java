package qi2;

/* loaded from: classes10.dex */
public final class h1 implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qi2.j1 f363527a;

    public h1(qi2.j1 j1Var) {
        this.f363527a = j1Var;
    }

    @Override // si2.b
    public com.tencent.mm.plugin.finder.live.plugin.l a() {
        return this.f363527a.f363535h.a();
    }

    @Override // si2.b
    public void c(dk2.pf battleData, yz5.l lVar) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.o.g(battleData, "battleData");
        qi2.j1 j1Var = this.f363527a;
        dk2.u4 u4Var = ((mm2.o4) j1Var.f363535h.g().a(mm2.o4.class)).Z;
        java.lang.Boolean valueOf = u4Var != null ? java.lang.Boolean.valueOf(u4Var.i()) : null;
        zh2.c cVar = j1Var.f363535h;
        dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        int i17 = 1;
        if (u4Var2 != null) {
            bool = java.lang.Boolean.valueOf(u4Var2.f234158e == 7);
        } else {
            bool = null;
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("VisitorPkPanelWidget", "onLaunchVisitorBattle isBattleFinish: " + valueOf + " isBattlePublicityFinish: " + bool, null);
        qf2.c3 c3Var = (qf2.c3) cVar.getController(qf2.c3.class);
        if (c3Var != null) {
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (!kotlin.jvm.internal.o.b(valueOf, bool2) && !kotlin.jvm.internal.o.b(bool, bool2)) {
                i17 = 2;
            }
            c3Var.c7(i17, battleData, new qi2.g1(lVar, j1Var));
        }
    }
}
