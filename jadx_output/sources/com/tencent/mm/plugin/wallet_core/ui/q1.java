package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI f180580d;

    public q1(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        this.f180580d = walletBindCardResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI = this.f180580d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "click tiny app, userName: %s, path: %s, version: %s", walletBindCardResultUI.f179875g, walletBindCardResultUI.f179876h, java.lang.Integer.valueOf(walletBindCardResultUI.f179877i));
        walletBindCardResultUI.V6(2);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        java.lang.String str = walletBindCardResultUI.f179875g;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = walletBindCardResultUI.f179876h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = 1034;
        nxVar.f7468c = 0;
        int i17 = walletBindCardResultUI.f179877i;
        if (i17 > 0) {
            nxVar.f7474i = i17;
        }
        startAppBrandUIFromOuterEvent.e();
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletBindCardResultUI.f179872d.f179622s.f13971e) || walletBindCardResultUI.f179872d.f179620q.f13975a <= 0) {
            walletBindCardResultUI.B = false;
        } else {
            walletBindCardResultUI.B = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
