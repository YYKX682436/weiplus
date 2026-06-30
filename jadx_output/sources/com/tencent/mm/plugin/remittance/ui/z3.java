package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class z3 implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f158062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158063b;

    public z3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, boolean z17) {
        this.f158063b = remittanceDetailUI;
        this.f158062a = z17;
    }

    @Override // hp3.a
    public void onClick(android.view.View view) {
        boolean z17 = this.f158062a;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158063b;
        if (!z17) {
            h45.a0.b(remittanceDetailUI, 0);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
        remittanceDetailUI.v7(intent, false);
    }
}
