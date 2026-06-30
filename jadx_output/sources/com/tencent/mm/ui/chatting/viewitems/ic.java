package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class ic {
    public static boolean a(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.modelstat.b.d(f9Var, com.tencent.mm.modelstat.a.Click, dVar.f460722q, dVar.k());
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        if (f9Var.j() == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        java.lang.String t17 = com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var);
        if (j17 != null) {
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, t17, j17, f9Var.I0(), dVar.x());
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13043, 2, v17.f348658g, v17.f348646d);
        te5.t.i(dVar, f9Var, 0);
        android.app.Activity g17 = dVar.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMusic", "handleMusicVideoClick, content:%s", v17.H2);
        com.tencent.mm.ui.chatting.o6.f202065a.d(g17, f9Var, v17);
        return true;
    }
}
