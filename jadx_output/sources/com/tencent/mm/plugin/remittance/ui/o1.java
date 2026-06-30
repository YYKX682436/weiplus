package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f157855d;

    public o1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, java.lang.Runnable runnable) {
        this.f157855d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f157855d.run();
    }
}
