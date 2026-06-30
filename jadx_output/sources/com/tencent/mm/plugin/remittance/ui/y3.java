package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class y3 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f158047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158048b;

    public y3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, boolean z17) {
        this.f158048b = remittanceDetailUI;
        this.f158047a = z17;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        boolean z17 = this.f158047a;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158048b;
        if (!z17) {
            h45.a0.b(remittanceDetailUI, 0);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
        remittanceDetailUI.v7(intent, false);
    }
}
