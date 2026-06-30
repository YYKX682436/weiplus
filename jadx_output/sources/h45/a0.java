package h45;

/* loaded from: classes9.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f278933a = "";

    public static void a(com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletJsapiData.S)) {
            java.lang.String str = walletJsapiData.P;
            if (str == null) {
                str = "";
            }
            walletJsapiData.S = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "fillInitInfo fallback initRawUrl from rawUrl: %s", str);
        }
        if (walletJsapiData.T == 0) {
            long a17 = c01.id.a() / 1000;
            walletJsapiData.T = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "fillInitInfo fallback initTimestamp to now: %d", java.lang.Long.valueOf(a17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "fillInitInfo final: initTimestamp=%d, initRawUrl=%s", java.lang.Long.valueOf(walletJsapiData.T), walletJsapiData.S);
    }

    public static boolean b(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene_balance_manager", i17);
        if (c01.z1.I()) {
            j45.l.j(context, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, null);
            return true;
        }
        if (((h45.q) i95.n0.c(h45.q.class)).startWalletBalanceEntryUseCase(context)) {
            return true;
        }
        j45.l.j(context, "wallet", ".balance.ui.WalletBalanceManagerUI", intent, null);
        return true;
    }

    public static boolean c(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_req_bind_scene", 5);
        intent.putExtra("key_offline_add_fee", i17);
        j45.l.j(context, "wallet", ".bind.ui.WalletBindUI", intent, null);
        return true;
    }

    public static boolean d(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, int i17, com.tencent.mm.ui.da daVar) {
        if (walletJsapiData == null) {
            return false;
        }
        a(walletJsapiData);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("WalletJsapiData", walletJsapiData);
        intent.putExtra("requestCode", i17);
        if (daVar != null) {
            mMActivity.mmSetOnActivityResultCallback(daVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startJsapiPay MMActivity %s from %s", mMActivity, new com.tencent.mm.sdk.platformtools.z3());
        j45.l.o(mMActivity, "wallet_index", ".ui.WalletBrandUI", intent, i17, false);
        return true;
    }

    public static boolean e(android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        android.content.Intent intent = new android.content.Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        j45.l.j(context, "mall", ".ui.MallIndexUIv2", intent, null);
        return true;
    }

    public static boolean f(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, int i17) {
        g(context, false, "", payInfo, null, new android.content.Intent(), i17);
        return true;
    }

    public static boolean g(android.content.Context context, boolean z17, java.lang.String str, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, java.lang.String str2, android.content.Intent intent, int i17) {
        int i18 = payInfo.f192109e;
        if (2 == i18 || 1 == i18 || 4 == i18 || 36 == i18) {
            payInfo.f192112h = false;
        } else {
            payInfo.f192112h = true;
        }
        if (i18 == 4 || i18 == 1 || 36 == i18 || 8 == i18) {
            payInfo.f192113i = true;
        } else {
            payInfo.f192113i = false;
        }
        payInfo.Q = str2;
        intent.putExtra("key_pay_info", payInfo);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_force_use_bind_serail", str);
        intent.putExtra("key_is_force_use_given_card", z17);
        if (context instanceof android.app.Activity) {
            intent.putExtra("key_context_hashcode", context.hashCode());
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startPay context %s %s", context, java.lang.Integer.valueOf(context.hashCode()));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            intent.putExtra("key_is_use_default_card", "");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startPay context %s from %s", context, new com.tencent.mm.sdk.platformtools.z3());
        intent.putExtra("key_receiver_true_name", str2);
        if (c01.z1.I()) {
            j45.l.n(context, "wallet_payu", ".pay.ui.WalletPayUPayUI", intent, i17);
        } else {
            j45.l.n(context, "wallet", ".pay.ui.WalletPayUI", intent, i17);
        }
        return true;
    }

    public static boolean h(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, java.util.Map map, int i17, com.tencent.mm.ui.da daVar) {
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = new com.tencent.mm.pluginsdk.wallet.WalletJsapiData();
        walletJsapiData.A = 4;
        walletJsapiData.W = str;
        walletJsapiData.V = map;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("WalletJsapiData", walletJsapiData);
        intent.putExtra("requestCode", i17);
        if (daVar != null) {
            mMActivity.mmSetOnActivityResultCallback(daVar);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startPayComponent context %s from %s", mMActivity, new com.tencent.mm.sdk.platformtools.z3());
        j45.l.o(mMActivity, "wallet_index", ".ui.WalletBrandUI", intent, i17, false);
        return true;
    }

    public static boolean i(android.content.Context context, int i17, java.lang.String str, int i18, nr4.a aVar) {
        j(context, i17, str, i18, aVar, null);
        return true;
    }

    public static boolean j(android.content.Context context, int i17, java.lang.String str, int i18, nr4.a aVar, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        intent.putExtra("receiver_name", str);
        if (i18 > 0) {
            intent.putExtra("pay_channel", i18);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        nr4.a.e(aVar, intent);
        if (c01.z1.I()) {
            j45.l.j(context, "wallet_payu", ".remittance.ui.PayURemittanceAdapterUI", intent, null);
        } else if (c01.z1.z()) {
            j45.l.j(context, "remittance", ".ui.RemittanceAdapterUI", intent, null);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(12097, 12, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var.d(11850, 7, 1);
        } else {
            j45.l.j(context, "remittance", ".ui.RemittanceAdapterUI", intent, null);
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(12097, 12, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var2.d(11850, 3, 1);
        }
        return true;
    }

    public static void k(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", i17);
        j45.l.j(context, "collect", ".ui.CollectAdapterUI", intent, null);
    }
}
