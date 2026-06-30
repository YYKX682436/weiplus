package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI f157961d;

    public t8(com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI selectRemittanceContactUI) {
        this.f157961d = selectRemittanceContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.I;
        this.f157961d.getContentView().findViewById(com.tencent.mm.R.id.og6).sendAccessibilityEvent(128);
    }
}
