package vh4;

/* loaded from: classes11.dex */
public class e2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh4.e f437071d;

    public e2(vh4.t1 t1Var, uh4.e eVar) {
        this.f437071d = eVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j25 j25Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "enable teen mode scene end errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        uh4.e eVar = this.f437071d;
        if (i17 != 0 || i18 != 0) {
            if (eVar != null) {
                ((com.tencent.mm.plugin.teenmode.ui.v4) eVar).a(false);
                return;
            }
            return;
        }
        try {
            r45.i25 i25Var = ((e21.j) m1Var).f246537e.f246521b.f246528a;
            int i19 = i25Var.f376687d;
            if (i19 == 0 && (j25Var = i25Var.f376688e) != null && j25Var.f377518e != null) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
                com.tencent.mm.autogen.events.FinderTeenModeChangeEvent finderTeenModeChangeEvent = new com.tencent.mm.autogen.events.FinderTeenModeChangeEvent();
                finderTeenModeChangeEvent.f54331g.f7139a = 1;
                finderTeenModeChangeEvent.e();
                ((uh4.c0) i95.n0.c(uh4.c0.class)).T(5);
                if (eVar != null) {
                    ((com.tencent.mm.plugin.teenmode.ui.v4) eVar).a(true);
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i19));
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493845pb5, 0).show();
            if (eVar != null) {
                ((com.tencent.mm.plugin.teenmode.ui.v4) eVar).a(false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "enable teen mode scene end handle error: %s", e17.toString());
            if (eVar != null) {
                ((com.tencent.mm.plugin.teenmode.ui.v4) eVar).a(false);
            }
        }
    }
}
