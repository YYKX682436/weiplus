package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.z5 f158050d;

    public y5(com.tencent.mm.plugin.remittance.ui.z5 z5Var) {
        this.f158050d = z5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158050d.f158064d.f157635c;
        if (remittanceDetailUI.f157348g2) {
            remittanceDetailUI.f157348g2 = false;
        } else {
            remittanceDetailUI.d7(0);
        }
    }
}
