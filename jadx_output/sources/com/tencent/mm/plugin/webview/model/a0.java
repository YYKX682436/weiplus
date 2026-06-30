package com.tencent.mm.plugin.webview.model;

/* loaded from: classes9.dex */
public abstract class a0 {
    public static boolean a(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.plugin.webview.model.z zVar) {
        if (doFavoriteEvent == null || zVar == null || !(!com.tencent.mm.sdk.platformtools.t8.K0(zVar.f183210a))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or wrapper is invalid");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        if (zVar.f183217h) {
            jq0Var.i(zVar.f183215f);
        }
        gp0Var.K0(zVar.f183210a);
        gp0Var.O0(zVar.f183211b);
        gp0Var.m0(zVar.f183212c);
        gp0Var.o0(zVar.f183213d);
        gp0Var.H0(zVar.f183218i);
        gp0Var.x0(true);
        gp0Var.z0(true);
        gp0Var.h0(5);
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.o(zVar.f183213d);
        tq0Var.p(zVar.f183211b);
        tq0Var.j(zVar.f183212c);
        if (zVar.f183217h) {
            tq0Var.f386682y = zVar.f183216g;
            tq0Var.f386683z = true;
        }
        bq0Var.r(tq0Var);
        bq0Var.k(zVar.f183219j);
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(3);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.b(zVar.f183214e);
        jq0Var.f(zVar.f183210a);
        java.lang.String str = gp0Var.f375404d;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 5;
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        return true;
    }
}
