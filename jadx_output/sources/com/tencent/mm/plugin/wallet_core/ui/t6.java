package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class t6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Orders.Commodity f180627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.v6 f180628e;

    public t6(com.tencent.mm.plugin.wallet_core.ui.v6 v6Var, com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity) {
        this.f180628e = v6Var;
        this.f180627d = commodity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo recommendTinyAppInfo = this.f180627d.D;
        java.lang.String str = recommendTinyAppInfo.f179794g;
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7466a = str;
        java.lang.String str2 = recommendTinyAppInfo.f179795h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f7467b = str2;
        nxVar.f7469d = 1034;
        nxVar.f7468c = 0;
        startAppBrandUIFromOuterEvent.e();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = this.f180628e.f180671d;
        g0Var.d(14118, walletOrderInfoOldUI.f180065v, walletOrderInfoOldUI.getPayReqKey(), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
