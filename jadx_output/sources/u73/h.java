package u73;

/* loaded from: classes9.dex */
public abstract class h {
    public static java.lang.String a(long j17) {
        return com.tencent.mm.wallet_core.ui.r1.i("" + j17, "100", 2, java.math.RoundingMode.HALF_UP).toString();
    }

    public static java.lang.String b(long j17) {
        return new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date(j17 * 1000));
    }

    public static int c(int i17) {
        if (i17 == 1) {
            return com.tencent.mm.R.raw.honey_pay_father_card_icon;
        }
        if (i17 == 2) {
            return com.tencent.mm.R.raw.honey_pay_mother_card_icon;
        }
        if (i17 == 3) {
            return com.tencent.mm.R.raw.honey_pay_child_card_icon;
        }
        if (i17 == 4) {
            return com.tencent.mm.R.raw.honey_pay_relatives_card_icon;
        }
        return -1;
    }

    public static int d(int i17) {
        return !com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.honey_pay_input_logo : com.tencent.mm.R.raw.honey_pay_input_logo_dm;
    }

    public static void e(int i17, java.lang.String str) {
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        walletGetUserInfoEvent.f54958g.f7215a = 8;
        walletGetUserInfoEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "trigger offline event");
        com.tencent.mm.autogen.events.OfflineUpdateCardListEvent offlineUpdateCardListEvent = new com.tencent.mm.autogen.events.OfflineUpdateCardListEvent();
        am.dm dmVar = offlineUpdateCardListEvent.f54558g;
        dmVar.f6477a = i17;
        dmVar.f6478b = str;
        offlineUpdateCardListEvent.e();
        if (i17 != 1 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (!yo3.m.k()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "setOfflineBindSerialForHoneyPayCard but offline is not create, ignore");
            return;
        }
        if (yo3.m.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineUtil", "offline kinda enable, update default card in kinda");
            ((h45.q) i95.n0.c(h45.q.class)).updateOfflinePayDefaultCard(str, "QMF");
        } else {
            if (yo3.m.f() == 2) {
                new wo3.b(str, "QMF", 0).l();
            } else {
                yo3.m.s(str);
            }
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "insert sys msg: %s, %s", str, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String j17 = j(j(str2, str, -1), str3, -1);
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(0);
        f9Var.u1(str);
        f9Var.r1(6);
        f9Var.d1(j17);
        f9Var.e1(c01.w9.m(str, java.lang.System.currentTimeMillis() / 1000));
        f9Var.setType(10000);
        f9Var.f1(f9Var.w0() | 8);
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "insert msgId: %s", java.lang.Long.valueOf(M9));
        if (M9 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayUtil", "insert sys msg fail!");
        }
    }

    public static boolean g() {
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_HoneyPayCross_Int, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "isOpenCrossSwitch: %s, %s", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(g17));
        return g17 == 0 || g17 == 1;
    }

    public static void h(com.tencent.mm.ui.MMActivity mMActivity, r45.ft5 ft5Var, java.lang.String str, int i17, r45.an6 an6Var) {
        java.util.LinkedList linkedList;
        if (ft5Var == null || (linkedList = ft5Var.f374594d) == null || linkedList.isEmpty()) {
            return;
        }
        u73.g gVar = new u73.g(mMActivity, ft5Var, str, an6Var, i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(ft5Var.f374595e)) {
            mMActivity.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, gVar);
        } else {
            mMActivity.addTextOptionMenu(0, ft5Var.f374595e, com.tencent.mm.R.color.aaw, gVar);
        }
    }

    public static void i(com.tencent.mm.ui.MMActivity mMActivity, android.os.Bundle bundle, r45.bv3 bv3Var, boolean z17) {
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
        realnameGuideHelper.d("" + bv3Var.f371079d, bv3Var.f371080e, bv3Var.f371081f, bv3Var.f371082g, bv3Var.f371083h, 0);
        if (bundle == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayUtil", "bundle is null!");
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle2 = bundle;
        bundle2.putString("realname_verify_process_jump_plugin", "honey_pay");
        realnameGuideHelper.b(mMActivity, bundle2, null, new u73.d(z17), false);
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 0, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        }
    }

    public static java.lang.String j(java.lang.String str, java.lang.String str2, int i17) {
        if (i17 >= 0) {
            return str.replace("$" + str2 + "$", com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(str2), i17));
        }
        return str.replace("$" + str2 + "$", com.tencent.mm.wallet_core.ui.r1.x(str2));
    }

    public static void k(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "update msg: %s, %s", str, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String j17 = j(str2, str3, 6);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            j17 = j(j17, str4, 6);
        }
        u73.b bVar = new u73.b();
        bVar.field_payMsgId = str;
        ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f360381d.a()).get(bVar, new java.lang.String[0]);
        long j18 = bVar.field_msgId;
        if (j18 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayUtil", "find msg: %s", java.lang.Long.valueOf(j18));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && !str4.equals(c01.z1.r())) {
                str3 = str4;
            }
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str3, bVar.field_msgId);
            if (Li.getMsgId() <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayUtil", "can't find msg: %s, may be deleted", java.lang.Long.valueOf(bVar.field_msgId));
            } else {
                Li.d1(j17);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
            }
        }
    }
}
