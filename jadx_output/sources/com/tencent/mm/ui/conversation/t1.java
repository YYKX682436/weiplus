package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public abstract class t1 {
    public static void a(android.content.Context context, boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("chat_from_scene", 4);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
            return;
        }
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI != null) {
            launcherUI.startChatting(str, null, true);
        }
    }

    public static void b(android.content.Context context, java.lang.String str, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, boolean z17) {
        f(str);
        if (z17) {
            g(context);
        }
        kn.l0.e(str);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.a(str);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(str);
        c01.w9.h(str, new com.tencent.mm.ui.conversation.e1(pBool, progressDialog, str));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r21, android.content.Context r22, com.tencent.mm.storage.l4 r23, boolean r24, java.lang.Runnable r25, java.lang.Runnable r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.t1.c(java.lang.String, android.content.Context, com.tencent.mm.storage.l4, boolean, java.lang.Runnable, java.lang.Runnable, boolean, boolean):void");
    }

    public static void d(android.content.Context context, java.lang.String str, com.tencent.mm.storage.l4 l4Var, com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog, boolean z17) {
        f(str);
        if (z17) {
            g(context);
        }
        c01.w9.h(str, new com.tencent.mm.ui.conversation.d1(pBool, progressDialog));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(str, 15);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.a(str);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(str);
        com.tencent.mm.storage.z3 g07 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).g0(str);
        if (g07 != null && g07.k2() && !com.tencent.mm.sdk.platformtools.t8.D0(g07.t0(), g07.d1())) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(str);
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).k(str);
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        n17.setType(n17.getType() & (-3));
        n17.setType(n17.getType() & (-2049));
        if (n17.k2() && r01.z.n(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13773, 0, java.lang.Integer.valueOf(l4Var.d1()), 1, l4Var.h1());
        }
        java.lang.String d17 = n17.d1();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvDelLogic", "oplog modContact user:%s", d17);
        if (com.tencent.mm.storage.z3.m4(d17)) {
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.x(d17, 2));
        } else {
            r45.tn4 n18 = c01.e2.n(n17);
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(2, n18));
        }
        ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n17);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
        e(str);
        if (p17 != null) {
            if (p17.d2(4194304) || (n17.k2() && !n17.r2() && p17.w0() < r01.q3.rj())) {
                c01.d9.e().g(new com.tencent.mm.modelsimple.e0(str, null));
            }
        }
    }

    public static void e(java.lang.String str) {
        boolean i47 = com.tencent.mm.storage.z3.i4(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvDelLogic", "doDeleteConv() called talker:%s isNormalContact:%s", str, java.lang.Boolean.valueOf(i47));
        if (i47) {
            c01.h2.j(str);
        } else {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(str);
        }
    }

    public static void f(java.lang.String str) {
        if (((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str) != null) {
            com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct leftSlideOptionStruct = new com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct();
            leftSlideOptionStruct.f58551d = 15L;
            leftSlideOptionStruct.f58552e = leftSlideOptionStruct.b("SessionName", str, true);
            leftSlideOptionStruct.f58554g = c01.h2.b(str);
            leftSlideOptionStruct.f58553f = r0.d1();
            leftSlideOptionStruct.k();
        }
    }

    public static void g(android.content.Context context) {
        if (com.tencent.mm.ui.bk.y()) {
            if (com.tencent.mm.ui.bk.A() && context.getResources().getConfiguration().orientation == 1) {
                return;
            }
            j45.l.u(context, ".ui.EmptyActivity", new android.content.Intent(), null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvDelLogic", "start empty activity");
        }
    }
}
