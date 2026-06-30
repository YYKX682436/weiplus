package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public abstract class hk {
    public static boolean a(com.tencent.mm.sdk.platformtools.o4 o4Var, int i17, java.lang.String str) {
        if (str.equals("EnableFinderUnreadCountToTab")) {
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.q() == -100) {
                return true;
            }
        }
        java.lang.String concat = "active".concat(str);
        boolean z17 = o4Var.getBoolean(concat, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadCountHelper", "countToTab unreadCount %d dynaCfgKey %s activeDisable %b ", java.lang.Integer.valueOf(i17), str, java.lang.Boolean.valueOf(z17));
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(str, 0);
        if (i17 == 0) {
            if (!z17) {
                o4Var.putBoolean(concat, true);
            }
            return b17 == 1;
        }
        if (b17 != 1) {
            return !z17;
        }
        if (z17) {
            o4Var.putBoolean(concat, false);
        }
        return true;
    }

    public static int b() {
        int i17;
        int i18;
        int i19;
        int i27;
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UnreadCountHelper", "getFindTabUnreadCount, but mmcore not ready");
            return 0;
        }
        int a17 = ((c01.z1.n() & 64) == 0 && (c01.z1.p() & 32768) == 0) ? c01.f1.a() + 0 : 0;
        if ((c01.z1.n() & 256) == 0) {
            com.tencent.mm.storage.qa Di = r21.w.Di();
            i17 = (Di != null ? Di.f() + 0 : 0) + o25.u1.a().getShakeMessageUnreadCnt();
        } else {
            i17 = 0;
        }
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("CountToTabConfig");
        if (a(R, i17, "EnableShakeUnreadCountToTab")) {
            a17 += i17;
        }
        if ((c01.z1.n() & 32768) == 0 && p94.w0.a() != null) {
            com.tencent.mm.plugin.sns.storage.w1 w1Var = (com.tencent.mm.plugin.sns.storage.w1) p94.w0.a();
            w1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            boolean z18 = w1Var.f166157e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            a17 = z18 ? 0 : a17 + ((com.tencent.mm.plugin.sns.storage.w1) p94.w0.a()).L0();
        }
        om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UnreadCountHelper", "checkLookVisibility EuropeanUnionCountry");
        } else if (wi6.D()) {
            int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
            if (a(R, s17, "EnableStoriesUnreadCountToTab")) {
                java.util.LinkedList linkedList = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346436d;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList) && ((r45.qn6) linkedList.getLast()).f384122p == 1) {
                    z17 = true;
                }
                if (z17 && s17 > 0) {
                    a17 += s17;
                }
            }
        }
        if (!((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).aj()) {
            return a17;
        }
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("Discovery");
        if (I0 == null || (i27 = I0.f373888e) <= 0) {
            r45.f03 I02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderMentionEntrance");
            i18 = (I02 == null || (i19 = I02.f373888e) <= 0 || a17 <= 0) ? a17 : a17 + i19;
        } else {
            i18 = i27 + a17;
        }
        return a(R, i18, "EnableFinderUnreadCountToTab") ? i18 : a17;
    }
}
