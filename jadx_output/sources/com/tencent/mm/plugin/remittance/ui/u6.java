package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI f157976d;

    public u6(com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI) {
        this.f157976d = remittanceF2fLargeMoneyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI remittanceF2fLargeMoneyUI = this.f157976d;
        remittanceF2fLargeMoneyUI.f157421q = remittanceF2fLargeMoneyUI.f157416i.getWidth();
        remittanceF2fLargeMoneyUI.f157418n.setVisibility(8);
        int i17 = remittanceF2fLargeMoneyUI.f157421q;
    }
}
