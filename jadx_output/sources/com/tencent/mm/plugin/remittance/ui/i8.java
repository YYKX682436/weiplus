package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.k8 f157770d;

    public i8(com.tencent.mm.plugin.remittance.ui.k8 k8Var) {
        this.f157770d = k8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.k8 k8Var = this.f157770d;
        com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI = k8Var.f157797a;
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceUI.f157595u2;
        remittanceUI.C7();
        k8Var.f157797a.B7();
    }
}
