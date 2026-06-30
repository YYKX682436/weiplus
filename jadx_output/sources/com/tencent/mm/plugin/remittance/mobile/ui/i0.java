package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        super(false);
        this.f156678d = mobileRemitNumberInputUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "notice click!");
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f156678d;
        com.tencent.mm.wallet_core.model.f0.c(mobileRemitNumberInputUI.getContext(), mobileRemitNumberInputUI.f156586r.f381583m, null, new com.tencent.mm.plugin.remittance.mobile.ui.h0(this));
    }
}
