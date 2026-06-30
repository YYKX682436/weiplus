package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class t1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "notifyAccountState";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        int optInt = e17.optInt("state", -1);
        if (!(1 <= optInt && optInt < 4)) {
            q5Var.a("state is invalid", null);
            return;
        }
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        com.tencent.mars.xlog.Log.i("GameAccountManager", "gamelog.account, manage ,jsapi handleAccountStateChanged state = " + optInt);
        if (optInt == 1) {
            l33.c.a();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            l33.c.f315428a = 1;
        } else if (optInt == 2) {
            com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
            Di.getClass();
            Di.execSQL("GameRawMessage", "update GameRawMessage set isHidden = 0 where isHidden = 2 and showType = 1");
            l33.c.f315428a = 0;
        } else if (optInt != 3) {
            com.tencent.mars.xlog.Log.e("GameAccountManager", "gamelog.account, manage , notify AccountStateChanged state = " + optInt);
        } else {
            l33.c.b();
            l33.c.f315428a = 0;
        }
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
