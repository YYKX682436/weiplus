package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class b8 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI f157651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI remittanceResultNewUI) {
        super(false);
        this.f157651d = remittanceResultNewUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int[] iArr = com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.A;
        this.f157651d.Y6();
    }
}
