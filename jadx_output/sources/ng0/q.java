package ng0;

@j95.b
/* loaded from: classes9.dex */
public class q extends i95.w implements og0.o {
    public boolean Ai(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, int i17, com.tencent.mm.ui.da daVar) {
        if (walletJsapiData == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", walletJsapiData.f192129d);
        intent.putExtra("timeStamp", walletJsapiData.f192133h);
        intent.putExtra("nonceStr", walletJsapiData.f192132g);
        intent.putExtra("packageExt", walletJsapiData.f192134i);
        intent.putExtra("signtype", walletJsapiData.f192131f);
        intent.putExtra("paySignature", walletJsapiData.f192138p);
        intent.putExtra("url", walletJsapiData.f192140r);
        intent.putExtra("key_req_bind_scene", walletJsapiData.f192143u);
        intent.putExtra("pay_channel", walletJsapiData.f192144v);
        mMActivity.mmSetOnActivityResultCallback(daVar);
        j45.l.o(mMActivity, "wallet", ".bind.ui.WalletBindUI", intent, i17, false);
        return true;
    }

    public boolean Bi(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, int i17, com.tencent.mm.ui.xc xcVar) {
        if (walletJsapiData == null) {
            return false;
        }
        h45.a0.a(walletJsapiData);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("WalletJsapiData", walletJsapiData);
        intent.putExtra("requestCode", i17);
        if (xcVar != null) {
            mMFragmentActivity.setMMOnFragmentActivityResult(xcVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startJsapiPay MMFragmentActivity %s from %s", mMFragmentActivity, new com.tencent.mm.sdk.platformtools.z3());
        j45.l.o(mMFragmentActivity, "wallet_index", ".ui.WalletBrandUI", intent, i17, false);
        return true;
    }

    public void Di(android.content.Context context, android.content.Intent intent, int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.f9.PaymentOpenSdk.k(context, null)) {
            intent.putExtra("key_from_scene", 8);
            intent.putExtra("key_appid", str);
            j45.l.n(context, "offline", ".ui.WalletOfflineEntranceUI", intent, i17);
        }
    }

    public void Ni(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, int i18, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_qrcode_url", str);
        intent.putExtra("key_channel", i17);
        intent.putExtra("key_web_url", str2);
        intent.putExtra("key_scene", i18);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        j45.l.j(context, "collect", ".reward.ui.QrRewardSelectMoneyUI", intent, null);
    }

    public boolean wi(android.content.Context context, android.os.Bundle bundle, boolean z17, final java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("orderhandlerui_checkapp_result", z17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        com.tencent.mm.opensdk.modelpay.PayReq payReq = new com.tencent.mm.opensdk.modelpay.PayReq();
        payReq.fromBundle(intent.getExtras());
        final java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(payReq.prepayId) ? "" : payReq.prepayId;
        final java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(payReq.partnerId) ? "" : payReq.partnerId;
        int i17 = bundle.getInt("key_scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startAppPay scene:%s prepay_id:%s partner_id:%s packageName:%s", java.lang.Integer.valueOf(i17), str2, str3, str);
        if (i17 == 0) {
            h45.a0.f278933a = str2;
            intent.addFlags(268435456);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletManager", "startAppPay OrderHandlerUI add clear top flag");
            intent.addFlags(67108864);
            java.util.Map map = h45.i0.f278950a;
            java.lang.String str4 = h45.a0.f278933a;
            yz5.a aVar = new yz5.a() { // from class: h45.a0$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    java.lang.String str5 = h45.a0.f278933a + " time:" + java.lang.System.currentTimeMillis();
                    java.lang.String str6 = str;
                    java.lang.String str7 = str6 != null ? str6 : "";
                    java.lang.String str8 = str3;
                    java.lang.String str9 = str8 != null ? str8 : "";
                    java.lang.String str10 = str2;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36486, "9", "2", "", str5, "apppay", str7, str9, str10 != null ? str10 : "");
                    return jz5.f0.f302826a;
                }
            };
            if (str4 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPayUtil", "addOutTimeCheck failed, key is null");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addOutTimeCheck task:");
                sb6.append(str4);
                sb6.append(" times:3500 size:");
                java.util.Map map2 = h45.i0.f278950a;
                sb6.append(map2.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPayUtil", sb6.toString());
                wu5.c cVar = (wu5.c) ((java.util.LinkedHashMap) map2).get(str4);
                if (cVar != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WxPayUtil", "addOutTimeCheck waring, task:" + str4 + " is exits, cancel first");
                    cVar.cancel(false);
                    map2.remove(str4);
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                h45.h0 h0Var = new h45.h0(str4, aVar);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                wu5.c z18 = t0Var.z(h0Var, 3500L, false);
                if (z18 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPayUtil", "addOutTimeCheck failed, task:" + str4 + " is null");
                } else {
                    map2.put(str4, z18);
                }
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long a17 = c01.id.a();
        intent.putExtra("key_start_time", currentTimeMillis);
        m05.i iVar = m05.i.f322570a;
        if (i17 == 0) {
            iVar.d(2, "apppay", str != null ? str : "", str3 != null ? str3 : "", str2 != null ? str2 : "", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17));
        } else if (i17 == 1) {
            iVar.d(2, "h5pay", str != null ? str : "", str3 != null ? str3 : "", str2 != null ? str2 : "", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17));
        }
        j45.l.j(context, "wallet_index", ".ui.OrderHandlerUI", intent, null);
        return true;
    }
}
