package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class re {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.re f205424a = new com.tencent.mm.ui.chatting.viewitems.re();

    public static final boolean a(com.tencent.mm.ui.chatting.viewitems.re reVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, android.view.View view) {
        reVar.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 111) {
            if (com.tencent.mm.ui.chatting.la.a(f9Var)) {
                com.tencent.mm.ui.chatting.viewitems.s1.c(dVar, f9Var, a0Var.A(dVar, f9Var), 2000, new com.tencent.mm.ui.chatting.viewitems.qe(f9Var, a0Var));
                return false;
            }
            db5.e1.y(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.c96), "", dVar.g().getString(com.tencent.mm.R.string.l_e), null);
            return false;
        }
        if (itemId == 114) {
            com.tencent.mm.ui.chatting.ed.b(f9Var, c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()), dVar.g(), 512);
            return false;
        }
        com.tencent.mm.ui.chatting.o6 o6Var = com.tencent.mm.ui.chatting.o6.f202065a;
        if (itemId == 161) {
            ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
            kotlin.jvm.internal.o.f(v17, "parse(...)");
            bw5.lp0 a17 = o6Var.a(f9Var, v17);
            if (a17 == null) {
                return false;
            }
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).k(a17, bw5.ar0.TingScene_UnDefined);
            return false;
        }
        if (itemId != 162) {
            return false;
        }
        ot0.q v18 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        kotlin.jvm.internal.o.f(v18, "parse(...)");
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
        bw5.lp0 a18 = o6Var.a(f9Var, v18);
        if (a18 != null) {
            i95.m c17 = i95.n0.c(qk.a8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            bw5.ar0 ar0Var = bw5.ar0.TingScene_Chat;
            bw5.v70 d17 = a18.d();
            kotlin.jvm.internal.o.f(d17, "getListenItem(...)");
            ef0.q1.wi((ef0.q1) ((qk.a8) c17), g17, baseChattingUIFragment, ar0Var, d17, null, 0, 0, view, null, null, false, 1024, null);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, reVar.d((com.tencent.mm.pluginsdk.ui.tools.i0) v18.y(com.tencent.mm.pluginsdk.ui.tools.i0.class), f9Var, v18), 5, false);
        return false;
    }

    public static final boolean b(com.tencent.mm.ui.chatting.viewitems.re reVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        ot0.q v17;
        reVar.getClass();
        if (dVar != null) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
            if (f9Var.j() != null && (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) != null) {
                int i17 = v17.f348666i;
                if (3 == i17 || 76 == i17 || 92 == i17) {
                    if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ai()) {
                        int i18 = ((ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class))).Bi() ? com.tencent.mm.R.raw.star_heavy : com.tencent.mm.R.raw.icons_outlined_listen_later_medium;
                        int i19 = ((ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class))).Bi() ? com.tencent.mm.R.string.omo : com.tencent.mm.R.string.jyv;
                        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = (com.tencent.mm.pluginsdk.ui.tools.i0) v17.y(com.tencent.mm.pluginsdk.ui.tools.i0.class);
                        if (il4.l.g(i0Var != null ? i0Var.f191706r : 0)) {
                            g4Var.c(0, 162, 0, dVar.s().getString(i19), i18);
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, reVar.d(i0Var, f9Var, v17), 5, false);
                        }
                    }
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str = v17.f348646d;
                    ((kt.c) i0Var2).getClass();
                    com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
                    if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(j17) && !com.tencent.mm.ui.chatting.n3.k(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && f9Var.P0() != 1) {
                        g4Var.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                    }
                    if (!z17 && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar.A())) {
                        g4Var.c(d17, 123, 0, dVar.g().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                    }
                    if ((r01.q3.cj().u1(512) > 0) && !dVar.F()) {
                        g4Var.add(d17, 114, 0, dVar.g().getString(com.tencent.mm.R.string.b3l));
                    }
                    j45.l.g("favorite");
                    if (j17 == null || !j17.k()) {
                        g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
                    }
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    long msgId = f9Var.getMsgId();
                    am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
                    b6Var.f6219a = msgId;
                    b6Var.f6220b = f9Var.Q0();
                    exDeviceHaveBindNetworkDeviceEvent.e();
                    if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                        g4Var.c(d17, 129, 0, dVar.g().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
                    }
                    if (!dVar.F()) {
                        g4Var.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgTingMusic", "onCreateContextMenu(from), not music type, but enter here.");
                }
            }
        }
        return true;
    }

    public static final boolean c(com.tencent.mm.ui.chatting.viewitems.re reVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        reVar.getClass();
        com.tencent.mm.modelstat.b.d(f9Var, com.tencent.mm.modelstat.a.Click, dVar.f460722q, dVar.k());
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        java.lang.String t17 = com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var);
        if (j17 != null) {
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, t17, j17, f9Var.I0(), dVar.x());
        }
        te5.t.i(dVar, f9Var, 0);
        android.app.Activity g17 = dVar.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgTingMusic", "handleMusicVideoClick, content:%s", v17.H2);
        com.tencent.mm.ui.chatting.o6.f202065a.d(g17, f9Var, v17);
        return true;
    }

    public final java.util.HashMap d(com.tencent.mm.pluginsdk.ui.tools.i0 i0Var, com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        bw5.v70 c17;
        bw5.j40 b17;
        bw5.e70 g17;
        java.lang.String str = null;
        if (qVar.f348666i == 3) {
            bw5.lp0 a17 = com.tencent.mm.ui.chatting.o6.f202065a.a(f9Var, qVar);
            c17 = a17 != null ? a17.d() : null;
        } else {
            c17 = rk4.l5.c(i0Var != null ? i0Var.f191707s : null);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_listen_later");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        hashMap.put("currscene", 1300);
        hashMap.put("which_button", 41);
        java.lang.String tid = (c17 == null || (g17 = c17.g()) == null) ? null : g17.getTid();
        if (tid == null) {
            tid = "";
        }
        hashMap.put("actionfinderfeedid", tid);
        if (c17 != null && (b17 = c17.b()) != null) {
            str = b17.getUrl();
        }
        hashMap.put("actionbizinfo", rk4.j5.f(str));
        return hashMap;
    }
}
