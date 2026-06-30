package com.tencent.mm.pluginsdk.model;

@j95.b
/* loaded from: classes4.dex */
public class b2 extends i95.w implements o72.c5 {
    public boolean wi(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        boolean z17 = com.tencent.mm.pluginsdk.model.a2.f188779a;
        if (doFavoriteEvent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(5);
        gp0Var.B0(str7);
        gp0Var.K0(str3);
        gp0Var.n0(i18);
        gp0Var.O0(str);
        gp0Var.m0(str2);
        gp0Var.H0(str11);
        r45.jp0 jp0Var = new r45.jp0();
        jp0Var.f378002h = str;
        jp0Var.f377999e = i18;
        jp0Var.f377998d = str3;
        jp0Var.f378001g = str5;
        jp0Var.f378000f = str4;
        jp0Var.f378003i = str6;
        jp0Var.f378004m = str9;
        jp0Var.f378005n = str10;
        gp0Var.O1 = jp0Var;
        jq0Var.e(str8);
        jq0Var.j(c01.z1.r());
        jq0Var.g(i17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        java.lang.String str12 = gp0Var.f375404d;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str12;
        c4Var.f6319e = str12;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "fillStreamVideo");
        return true;
    }
}
