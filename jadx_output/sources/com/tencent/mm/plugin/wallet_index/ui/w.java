package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class w implements com.tencent.mm.plugin.wallet_index.ui.o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f181217a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI f181218b;

    public w(com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI) {
        this.f181218b = walletBrandUI;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public int a() {
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181218b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand getGenPrepayFuncId packageExt:%s", walletBrandUI.f181086h.f192134i);
        if (nt4.a.a(walletBrandUI.f181086h.f192134i, "up_")) {
            return 2519;
        }
        if (nt4.a.a(walletBrandUI.f181086h.f192134i, "tax_")) {
            return 2923;
        }
        return nt4.a.a(walletBrandUI.f181086h.f192134i, "dc_") ? 2798 : 398;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public com.tencent.mm.modelbase.m1 b() {
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181218b;
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = walletBrandUI.f181086h;
        java.lang.String str = walletJsapiData.f192129d;
        java.lang.String str2 = walletJsapiData.f192131f;
        java.lang.String str3 = walletJsapiData.f192132g;
        java.lang.String str4 = walletJsapiData.f192134i;
        java.lang.String str5 = walletJsapiData.f192138p;
        java.lang.String str6 = walletJsapiData.f192133h;
        java.lang.String str7 = walletJsapiData.f192140r;
        java.lang.String str8 = walletJsapiData.f192141s;
        int i17 = walletJsapiData.f192144v;
        int i18 = walletJsapiData.f192142t;
        int i19 = walletJsapiData.f192146x;
        java.lang.String str9 = walletJsapiData.f192139q;
        com.tencent.mm.wallet_core.model.d1 rVar = nt4.a.a(str4, "up_") ? new nt4.r(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9) : nt4.a.a(str4, "tax_") ? new nt4.q(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9) : nt4.a.a(str4, "dc_") ? new nt4.j(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9) : new nt4.l(str, str2, str3, str4, str5, str6, str7, str8, i17, i18, i19, str9);
        rVar.setProcessSessionId(java.lang.System.currentTimeMillis());
        rVar.setProcessName("PayProcess");
        rVar.setScene(walletBrandUI.f181086h.f192142t);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(rVar);
        return rVar;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public java.lang.String c() {
        return this.f181217a;
    }

    @Override // com.tencent.mm.plugin.wallet_index.ui.o
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = this.f181218b;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand dialog");
            com.tencent.mm.wallet_core.model.a2.b(walletBrandUI.f181086h.f192142t, "", i18);
            com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI2 = this.f181218b;
            if (walletBrandUI2.f181086h.f192142t == 3) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = walletBrandUI.getString(com.tencent.mm.R.string.krl);
                }
                com.tencent.mm.ui.widget.dialog.j0 E = db5.e1.E(walletBrandUI2, str, "", walletBrandUI.getString(com.tencent.mm.R.string.kl_), false, new com.tencent.mm.plugin.wallet_index.ui.v(this));
                if (E != null) {
                    E.setCancelable(false);
                }
                android.app.Dialog dialog = walletBrandUI.f181083e;
                if (dialog != null) {
                    dialog.dismiss();
                    walletBrandUI.f181083e = null;
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand setResult ResultPayFailed");
            android.content.Intent intent = new android.content.Intent();
            if (i17 != 0) {
                i18 = -1;
            }
            intent.putExtra("key_jsapi_pay_onActivityResult", "jsapi_pay_onActivityResult");
            intent.putExtra("key_jsapi_pay_err_code", i18);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = walletBrandUI.getString(com.tencent.mm.R.string.krl);
            }
            intent.putExtra("key_jsapi_pay_err_msg", str);
            intent.putExtra("key_jsapi_pay_err_dialog_confirm", walletBrandUI.getString(com.tencent.mm.R.string.kl_));
            walletBrandUI.setResult(5, intent);
            walletBrandUI.finish();
            return;
        }
        nt4.l lVar = (nt4.l) m1Var;
        java.lang.String str2 = lVar.f339838f;
        this.f181217a = str2;
        new com.tencent.mm.autogen.events.WalletCloseProgressEvent().e();
        r45.v67 v67Var = lVar.f339840h;
        if (v67Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(v67Var.f387953d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand start WalletMixOrderInfoUI");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("prepayId", str2);
            intent2.putExtra("is_jsapi_offline_pay", false);
            intent2.putExtra("pay_gate_url", v67Var.f387953d);
            intent2.putExtra("need_dialog", v67Var.f387955f);
            intent2.putExtra("dialog_text", v67Var.f387956g);
            intent2.putExtra("max_count", v67Var.f387954e.f389408e);
            intent2.putExtra("inteval_time", v67Var.f387954e.f389407d);
            intent2.putExtra("default_wording", v67Var.f387954e.f389409f);
            j45.l.k(walletBrandUI, "wallet_core", ".ui.WalletMixOrderInfoUI", intent2, true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBrandUI", "TenpayWalletBrand startPay");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str2;
        com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData = walletBrandUI.f181086h;
        payInfo.f192116o = walletJsapiData.f192129d;
        payInfo.f192117p = lVar.f339839g;
        payInfo.f192109e = walletJsapiData.f192142t;
        payInfo.f192121t = str;
        payInfo.f192111g = walletJsapiData.f192144v;
        payInfo.F = lVar.sessionId;
        if (payInfo.f192122u == null) {
            payInfo.f192122u = new android.os.Bundle();
        }
        payInfo.f192122u.putString("extinfo_key_20", lVar.f339841i);
        payInfo.f192122u.putString("extinfo_key_21", walletBrandUI.f181086h.D);
        payInfo.f192122u.putString("extinfo_key_22", walletBrandUI.f181086h.E);
        com.tencent.mm.wallet_core.model.a2.b(payInfo.f192109e, str2, i18);
        h45.a0.f(walletBrandUI, payInfo, 1);
    }
}
