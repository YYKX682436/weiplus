package ja0;

@j95.b
/* loaded from: classes11.dex */
public class o0 extends i95.w implements ka0.r0 {
    public boolean Ai(java.lang.String str, java.lang.String str2) {
        int i17 = ll3.j2.f319185a;
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) ? false : true;
    }

    public boolean Bi(java.lang.String str) {
        return ll3.j2.i(str);
    }

    public void wi(b21.r rVar, r45.hf2 hf2Var, android.app.Activity activity, r45.xs4 xs4Var) {
        int i17 = ll3.j2.f319185a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10910, "3");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.O0(hf2Var.getString(0));
        gp0Var.E0(hf2Var.getString(6));
        gp0Var.D0(hf2Var.getString(8));
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(xs4Var.getInteger(18) > 0 ? 36 : 27);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).bj(ll3.j2.d(rVar))) {
            jq0Var.b(ll3.j2.d(rVar));
        }
        gp0Var.I0(rVar.f17352n);
        gp0Var.J0(rVar.f17353o);
        gp0Var.K0(rVar.f17354p);
        ql3.a y07 = ll3.o2.Ai().y0(xl3.c.a(rVar));
        if (y07 != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(y07.field_songHAlbumUrl)) {
                gp0Var.o0(y07.field_songHAlbumUrl);
            } else {
                gp0Var.o0(y07.field_songAlbumUrl);
            }
        }
        gp0Var.x0(true);
        java.lang.String f17 = ll3.j2.f(rVar);
        if (com.tencent.mm.vfs.w6.j(f17)) {
            gp0Var.B0(f17);
        } else {
            gp0Var.z0(true);
        }
        gp0Var.O0(rVar.f17348g);
        gp0Var.m0(rVar.f17349h);
        gp0Var.h0(xs4Var.getInteger(18) > 0 ? 32 : 29);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17362x)) {
            gp0Var.D0(rVar.f17362x);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17355q)) {
            gp0Var.E0(rVar.f17355q);
        }
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.C = xs4Var;
        gp0Var.J1 = hp0Var;
        java.lang.String str = rVar.f17348g;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6319e = rVar.f17349h;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = xs4Var.getInteger(18) <= 0 ? 21 : 32;
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        c4Var.f6323i = activity;
        c4Var.f6327m = 3;
        doFavoriteEvent.e();
    }
}
