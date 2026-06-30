package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f157680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI) {
        super(false);
        this.f157680d = f2FAppBrandRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI = this.f157680d;
        f2FAppBrandRemittanceUI.f157093h.B();
        f2FAppBrandRemittanceUI.f157093h = null;
        f2FAppBrandRemittanceUI.T6(com.tencent.mm.ui.o2.CANCEL, "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19821, 3, f2FAppBrandRemittanceUI.f157089d, 0);
    }
}
