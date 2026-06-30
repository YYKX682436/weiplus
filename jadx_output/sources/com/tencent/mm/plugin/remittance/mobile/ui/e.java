package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.f f156662d;

    public e(com.tencent.mm.plugin.remittance.mobile.ui.f fVar) {
        this.f156662d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "kinda transfer to bank pay success, go to launcherUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = this.f156662d.f156665a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bankMobileRemittanceChooseUI, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bankMobileRemittanceChooseUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(bankMobileRemittanceChooseUI, "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
