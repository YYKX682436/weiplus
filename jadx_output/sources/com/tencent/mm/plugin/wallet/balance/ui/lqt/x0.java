package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178431d;

    public x0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178431d = walletLqtDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        r45.pm4 pm4Var = this.f178431d.f177952f.f392027v;
        java.lang.String str = pm4Var.f383182g;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = pm4Var.f383183h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = 1061;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
