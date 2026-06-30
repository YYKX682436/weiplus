package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI f156659a;

    public d(com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        this.f156659a = bankMobileRemittanceChooseUI;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "on receive value: %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("payState", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !optString.equals(ya.b.SUCCESS)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "mini program pay success, go to launcherUI");
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.LauncherUI"));
            intent.addFlags(67108864);
            com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = this.f156659a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(bankMobileRemittanceChooseUI, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$3", "onReceiveValue", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bankMobileRemittanceChooseUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(bankMobileRemittanceChooseUI, "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$3", "onReceiveValue", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", e17, "parse mini program response error", e17);
        }
    }
}
