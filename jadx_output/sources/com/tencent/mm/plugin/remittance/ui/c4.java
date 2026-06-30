package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157656d;

    public c4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157656d = remittanceDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f157656d.f157341d.sendAccessibilityEvent(128);
    }
}
