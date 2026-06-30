package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent f180821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180822e;

    public z3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI, com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent) {
        this.f180822e = walletCheckPwdUI;
        this.f180821d = openFingerPrintAuthEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback");
        am.pn pnVar = this.f180821d.f54596h;
        if (pnVar == null) {
            com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, result == null");
            return;
        }
        int i17 = pnVar.f7635a;
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI = this.f180822e;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "hy: payInfo soterAuthReq: %s", pnVar.f7639e);
            walletCheckPwdUI.f179981f.setVisibility(8);
            java.lang.String str = pnVar.f7639e;
            walletCheckPwdUI.getClass();
            com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "do check pwd by fp");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONObject.put("soter_type", "1");
                str = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.WalletCheckPwdUI", e17, "", new java.lang.Object[0]);
            }
            walletCheckPwdUI.doSceneProgress(new ss4.y(walletCheckPwdUI.f179988p, 1, str), true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15021, 2);
            re4.n.f(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i18 = currentTimeMillis - walletCheckPwdUI.f179992t;
        if (i18 > 1) {
            walletCheckPwdUI.f179992t = currentTimeMillis;
            walletCheckPwdUI.f179991s++;
        }
        boolean z17 = i17 == 2 || i17 == 10308;
        boolean z18 = pnVar.f7640f == 2;
        int i19 = walletCheckPwdUI.f179991s;
        if ((z18 || (walletCheckPwdUI.f179991s < 3 && i18 > 1)) && !z17) {
            if (walletCheckPwdUI.f179997y == null) {
                walletCheckPwdUI.f179997y = na5.e.a(walletCheckPwdUI.getContext());
            }
            walletCheckPwdUI.f179981f.setVisibility(0);
            walletCheckPwdUI.f179981f.startAnimation(walletCheckPwdUI.f179997y);
            walletCheckPwdUI.f179997y.setFillAfter(true);
            re4.n.f(1);
            return;
        }
        if (walletCheckPwdUI.f179991s >= 3 || z17) {
            walletCheckPwdUI.U6();
            walletCheckPwdUI.f179990r = 0;
            walletCheckPwdUI.Z6();
            walletCheckPwdUI.f179984i.setVisibility(8);
            re4.n.f(2);
        }
    }
}
