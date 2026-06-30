package vh4;

/* loaded from: classes11.dex */
public class f2 implements com.tencent.mm.modelbase.u0 {
    public f2(vh4.t1 t1Var) {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j25 j25Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "disable teen mode scene end errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            try {
                r45.i25 i25Var = ((e21.j) m1Var).f246537e.f246521b.f246528a;
                int i19 = i25Var.f376687d;
                if (i19 == 0 && (j25Var = i25Var.f376688e) != null && j25Var.f377518e != null) {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    c17.x(u3Var, bool);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_ENABLE_BY_SYS_BOOLEAN_SYNC, bool);
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).T(4);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i19));
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493845pb5, 0).show();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "disable teen mode scene end handle error: %s", e17.toString());
            }
        }
    }
}
