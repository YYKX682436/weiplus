package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156657d;

    public c1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156657d = mobileRemittanceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156657d;
        mobileRemittanceUI.f156628t = mobileRemittanceUI.F.getWidth();
        mobileRemittanceUI.H.setVisibility(8);
        int i17 = mobileRemittanceUI.f156628t;
    }
}
