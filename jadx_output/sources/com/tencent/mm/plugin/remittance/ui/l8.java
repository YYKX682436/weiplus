package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.m8 f157811d;

    public l8(com.tencent.mm.plugin.remittance.ui.m8 m8Var) {
        this.f157811d = m8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.ui.m8 m8Var = this.f157811d;
        com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI = m8Var.f157823a;
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceUI.f157595u2;
        remittanceUI.C7();
        m8Var.f157823a.B7();
    }
}
