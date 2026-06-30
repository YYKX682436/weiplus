package l33;

/* loaded from: classes2.dex */
public final class b implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final l33.b f315427d = new l33.b();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        m53.o oVar2;
        m53.r rVar;
        m53.o oVar3;
        m53.r rVar2;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f70711b.f70700a) != null) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.protobuf.GetUserGameCenterAccountInfoResponse");
            m53.t2 t2Var = (m53.t2) fVar;
            m53.b bVar = t2Var.f324070d;
            long j17 = (bVar == null || (oVar3 = bVar.f323567d) == null || (rVar2 = oVar3.f323931d) == null) ? -1L : rVar2.f323996f;
            l33.c.f315429b = t2Var.f324071e;
            int i19 = (bVar == null || (oVar2 = bVar.f323567d) == null || (rVar = oVar2.f323931d) == null) ? 0 : rVar.f323995e;
            com.tencent.mars.xlog.Log.i("GameAccountManager", "gamelog.account, manage , handleCgiAccountState state = " + i19);
            if (i19 == 0) {
                if (j17 != -1) {
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC;
                    long t17 = c17.t(u3Var, -1L);
                    if (t17 != -1) {
                        if (j17 >= t17) {
                            l33.c.b();
                        } else {
                            gm0.j1.u().c().x(u3Var, -1L);
                        }
                    }
                } else {
                    com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC;
                    if (c18.t(u3Var2, -1L) != -1) {
                        gm0.j1.u().c().x(u3Var2, -1L);
                    }
                }
                l33.c.f315428a = 0;
            } else if (i19 == 1) {
                l33.c.f315428a = 1;
                com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC;
                if (c19.t(u3Var3, -1L) == -1) {
                    gm0.j1.u().c().x(u3Var3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                    l33.c.a();
                }
            } else if (i19 == 2 || i19 == 3) {
                l33.c.b();
                l33.c.f315428a = 3;
            } else {
                com.tencent.mars.xlog.Log.e("GameAccountManager", "gamelog.account, manage , handleCgiAccountState state = " + i19);
            }
        } else {
            com.tencent.mars.xlog.Log.e("GameAccountManager", "gamelog.cgi getusergamecenteraccountinfo CGI return, errType = " + i17 + ", errCode = " + str);
        }
        return 0;
    }
}
