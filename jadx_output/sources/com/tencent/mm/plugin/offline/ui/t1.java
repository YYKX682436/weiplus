package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152720d;

    public t1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152720d = walletOfflineCoinPurseUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click jump info layout");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14515, 6);
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152720d;
        com.tencent.mm.plugin.offline.ui.u3 u3Var = walletOfflineCoinPurseUI.S;
        if (u3Var.f152737f == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(u3Var.f152734c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "jump to tinyapp, username : %s", walletOfflineCoinPurseUI.S.f152734c);
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            com.tencent.mm.plugin.offline.ui.u3 u3Var2 = walletOfflineCoinPurseUI.S;
            java.lang.String str = u3Var2.f152734c;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = u3Var2.f152735d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1137;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
        } else {
            com.tencent.mm.plugin.offline.ui.u3 u3Var3 = walletOfflineCoinPurseUI.S;
            if (u3Var3.f152737f == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(u3Var3.f152736e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "jump to h5 : %s", walletOfflineCoinPurseUI.S.f152736e);
                com.tencent.mm.wallet_core.ui.r1.X(walletOfflineCoinPurseUI.getContext(), walletOfflineCoinPurseUI.S.f152736e, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
