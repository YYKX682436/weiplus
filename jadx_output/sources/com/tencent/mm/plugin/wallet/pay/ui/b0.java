package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo f178747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI f178748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI, com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo deductShowInfo) {
        super(false);
        this.f178748e = walletPayDeductUI;
        this.f178747d = deductShowInfo;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo deductShowInfo = this.f178747d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayDeductUI", "click link_type: %s", java.lang.Integer.valueOf(deductShowInfo.f179736f));
        int i17 = deductShowInfo.f179736f;
        if (i17 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(deductShowInfo.f179739i)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", deductShowInfo.f179739i);
            intent.putExtra("showShare", false);
            com.tencent.mm.wallet_core.ui.r1.T(this.f178748e.getContext(), intent);
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = deductShowInfo.f179737g;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = deductShowInfo.f179738h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1097;
            nxVar.f7468c = 0;
            startAppBrandUIFromOuterEvent.e();
        }
    }
}
