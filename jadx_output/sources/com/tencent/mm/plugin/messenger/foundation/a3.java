package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public class a3 implements vg3.w4 {
    @Override // vg3.w4
    public void a(java.lang.Object obj, r45.b50 b50Var, int i17, byte[] bArr, boolean z17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        if (b50Var.f370530d != 1) {
            return;
        }
        r45.fp4 fp4Var = (r45.fp4) new r45.fp4().parseFrom(bArr);
        int i18 = fp4Var.f374508d;
        gm0.j1.u().c().l(2, null);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", "processModUserInfo bitFlag:%d status:%d PluginFlag:%d PluginSwitch:%d", java.lang.Integer.valueOf(fp4Var.f374508d), java.lang.Integer.valueOf(fp4Var.f374514m), java.lang.Integer.valueOf(fp4Var.f374523v), java.lang.Integer.valueOf(fp4Var.E));
        java.lang.String selfUsername = x51.j1.g(fp4Var.f374509e);
        java.lang.String g17 = x51.j1.g(fp4Var.f374510f);
        java.lang.String g18 = x51.j1.g(fp4Var.f374512h);
        java.lang.String g19 = x51.j1.g(fp4Var.f374513i);
        int i19 = fp4Var.f374511g;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(selfUsername, true);
        if (n17 == null || n17.d1() == null || !n17.d1().equals(selfUsername)) {
            n17 = new com.tencent.mm.storage.z3(selfUsername);
        }
        n17.k1(fp4Var.G);
        n17.M1(g17);
        n17.c3(com.tencent.mm.storage.ha.q(fp4Var.S, fp4Var.f374518q, fp4Var.f374519r));
        n17.g3(fp4Var.f374517p);
        n17.h3(fp4Var.f374520s);
        n17.a2(fp4Var.I);
        n17.p3(fp4Var.D);
        n17.b2(fp4Var.H);
        n17.m3(i19);
        n17.R1(x51.k.b(n17.P0()));
        n17.S1(x51.k.a(n17.P0()));
        n17.o1(x51.k.a(n17.w0()));
        n17.p1(n17.w0());
        int W0 = n17.W0();
        int c27 = n17.c2();
        n17.T1(c27);
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", "newHead:%d oldHead:%d", java.lang.Integer.valueOf(c27), java.lang.Integer.valueOf(W0));
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(n17);
        c17.w(2, selfUsername);
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        bn0.g.f22779a.h("USERINFO_USERNAME", selfUsername);
        c17.w(4, g17);
        c17.w(5, g18);
        com.tencent.mm.storage.z3 g27 = c01.z1.g();
        c01.uc ucVar = c01.uc.f37514c;
        java.lang.String c18 = ucVar.c(g27.d1(), "login_user_name");
        java.lang.String u17 = gm0.j1.u().c().u(6, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", "checkSwitchInfoWhenMobileChange: wxid=%s, switchLastUsername=%s oldMobile=%s newMobile=%s", g27.d1(), c18, u17, g19);
        if (b(u17, c18)) {
            ucVar.h(g27.d1(), "login_user_name", com.tencent.mm.sdk.platformtools.t8.u1(g19, com.tencent.mm.sdk.platformtools.t8.u1(g27.t0(), g27.d1())));
        }
        c01.b9 b9Var = c01.b9.f37069c;
        java.lang.String a17 = b9Var.a("login_user_name", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", "checkSwitchInfoWhenMobileChange: wxid=%s, loginUsername=%s oldMobile=%s newMobile=%s", g27.d1(), a17, u17, g19);
        if (b(u17, a17)) {
            b9Var.d("login_user_name", com.tencent.mm.sdk.platformtools.t8.u1(g19, com.tencent.mm.sdk.platformtools.t8.u1(g27.t0(), g27.d1())));
        }
        c17.w(6, g19);
        c17.w(9, java.lang.Integer.valueOf(i19));
        int i27 = fp4Var.f374514m;
        java.lang.String str15 = "code=" + java.lang.Integer.toHexString(i27) + ", status = " + i27;
        if ((i27 & 1) != 0) {
            str15 = str15 + ", open";
        }
        if ((i27 & 2) != 0) {
            str15 = str15 + ", email-verified";
        }
        if ((i27 & 4) != 0) {
            str15 = str15 + ", mobile-verified";
        }
        if ((i27 & 8) != 0) {
            str15 = str15 + ", hide-qq-search";
        }
        if ((i27 & 16) != 0) {
            str15 = str15 + ", hide-qq-promote";
        }
        if ((i27 & 32) != 0) {
            str15 = str15 + ", need-verify";
        }
        if ((i27 & 64) != 0) {
            str15 = str15 + ", has-qq-msg";
        }
        if ((i27 & 128) != 0) {
            str15 = str15 + ", no-qq-promote";
        }
        if ((i27 & 256) != 0) {
            str15 = str15 + ", no-mobile-promote";
        }
        if ((i27 & 512) != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str15);
            sb6.append(", hide-mobile_search");
        }
        c17.w(7, java.lang.Integer.valueOf(fp4Var.f374514m));
        c01.fb fbVar = new c01.fb();
        c01.fb a18 = c01.fb.a();
        fbVar.f37187a = 1;
        int i28 = fp4Var.f374517p;
        fbVar.f37188b = i28;
        fbVar.f37191e = fp4Var.f374520s;
        fbVar.f37193g = fp4Var.S;
        fbVar.f37195i = fp4Var.f374518q;
        fbVar.f37194h = fp4Var.f374519r;
        fbVar.f37192f = fp4Var.D;
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", "[modPersonalCard] mod Sex: %s, Signature: %s, Country: %s, Province: %s, City: %s, Weibo: %s,", java.lang.Integer.valueOf(i28), fp4Var.f374520s, fp4Var.S, fp4Var.f374518q, fp4Var.f374519r, fp4Var.D);
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", "[modPersonalCard] origin Sex: %s, Signature: %s, Country: %s, Province: %s, City: %s, Weibo: %s,", java.lang.Integer.valueOf(a18.f37188b), a18.f37191e, a18.f37193g, a18.f37195i, a18.f37194h, a18.f37192f);
        c01.fb.e(fbVar);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("userinfo Plugstate: ");
        int i29 = fp4Var.f374523v;
        java.lang.String str16 = "code=" + java.lang.Integer.toHexString(i29) + ", pluginFlag = " + i29;
        if ((i29 & 1) != 0) {
            str = str16 + ", QQMAIL_UNINSTALL";
        } else {
            str = str16 + ", QQMAIL_INSTALL";
        }
        if ((i29 & 2) != 0) {
            str2 = str + ", PM_UNINSTALL";
        } else {
            str2 = str + ", PM_INSTALL";
        }
        if ((i29 & 4) != 0) {
            str3 = str2 + ", FM_UNINSTALL";
        } else {
            str3 = str2 + ", FM_INSTALL";
        }
        if ((i29 & 8) != 0) {
            str4 = str3 + ", WEIBO_UNINSTALL";
        } else {
            str4 = str3 + ", WEIBO_INSTALL";
        }
        if ((i29 & 16) != 0) {
            str5 = str4 + ", MEDIANOTE_UNINSTALL";
        } else {
            str5 = str4 + ", MEDIANOTE_INSTALL";
        }
        if ((i29 & 32) != 0) {
            str6 = str5 + ", QMSG_UNINSTALL";
        } else {
            str6 = str5 + ", QMSG_INSTALL";
        }
        if ((i29 & 64) != 0) {
            str7 = str6 + ", BOTTLE_UNINSTALL";
        } else {
            str7 = str6 + ", BOTTLE_INSTALL";
        }
        if ((i29 & 128) != 0) {
            str8 = str7 + ", QSYNC_UNISTALL";
        } else {
            str8 = str7 + ", QSYNC_INSTALL";
        }
        if ((i29 & 256) != 0) {
            str9 = str8 + ", SHAKE_UNISTALL";
        } else {
            str9 = str8 + ", SHAKE_INSTALL";
        }
        if ((i29 & 512) != 0) {
            str10 = str9 + ", LBS_UNISTALL";
        } else {
            str10 = str9 + ", LBS_INSTALL";
        }
        if ((i29 & 1024) != 0) {
            str11 = str10 + ", BOTTLE_CHART_INSTALL";
        } else {
            str11 = str10 + ", BOTTLE_CHART_INSTALL";
        }
        if ((i29 & 4096) != 0) {
            str12 = str11 + ",CHECKQQF_UNINSTALL";
        } else {
            str12 = str11 + ",CHECKQQF_INSTALL";
        }
        if ((i29 & 32768) != 0) {
            str13 = str12 + ",MM_FEEDSAPP_UNINSTALL";
        } else {
            str13 = str12 + ",MM_FEEDSAPP_INSTALL";
        }
        sb7.append(str13);
        com.tencent.mars.xlog.Log.i("MicroMsg.UserInfoSyncExtension", sb7.toString());
        c17.w(34, java.lang.Integer.valueOf(fp4Var.f374523v));
        c17.w(8200, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.m1(java.lang.Boolean.valueOf(1 == fp4Var.f374522u.f372372d), false)));
        c17.w(8201, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(fp4Var.f374522u.f372373e.f373383d), 22)));
        c17.w(8208, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(fp4Var.f374522u.f372373e.f373384e), 8)));
        c17.w(66049, java.lang.Integer.valueOf(fp4Var.f374524w));
        c17.w(66050, fp4Var.f374525x);
        c17.w(40, java.lang.Integer.valueOf(fp4Var.E));
        b9Var.d("last_login_use_voice", fp4Var.E + "");
        c17.w(41, java.lang.Integer.valueOf(fp4Var.I));
        c17.w(43, fp4Var.H);
        c17.w(868518889, java.lang.Integer.valueOf(fp4Var.Q));
        c17.w(42, fp4Var.G);
        c17.w(65825, "" + fp4Var.K);
        c17.w(65826, "" + fp4Var.L);
        java.lang.String str17 = (java.lang.String) gm0.j1.u().c().l(65830, null);
        if ((str17 != null ? str17 : "").length() == 0 && (str14 = fp4Var.R) != null && str14.length() > 0) {
            gm0.j1.u().c().w(65830, str14);
        }
        vg3.b5.b(1, fp4Var);
    }

    public final boolean b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        return (str.startsWith("+") || str2.startsWith("+")) ? str.endsWith(str2) || str2.endsWith(str) : str.equals(str2);
    }
}
