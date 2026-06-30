package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.l f178645d;

    public u(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI, at4.l lVar) {
        this.f178645d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        at4.l lVar = this.f178645d;
        java.lang.String str = lVar.f13890c;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = lVar.f13891d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = 1071;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
