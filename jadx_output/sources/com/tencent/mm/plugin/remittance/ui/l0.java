package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class l0 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157800a;

    public l0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157800a = remittanceBaseUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157800a;
        if (z17) {
            remittanceBaseUI.scrollToFormEditPosAfterShowTenPay(remittanceBaseUI.B, remittanceBaseUI.f157146q, 30);
        } else {
            remittanceBaseUI.B.scrollTo(0, 0);
        }
    }
}
