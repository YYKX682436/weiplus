package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class e1 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.j1 f157682a;

    public e1(com.tencent.mm.plugin.remittance.ui.j1 j1Var) {
        this.f157682a = j1Var;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString());
        com.tencent.mm.plugin.remittance.ui.j1 j1Var = this.f157682a;
        if (K0) {
            com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = j1Var.f157777d;
            remittanceBaseUI.H = null;
            com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.V6(remittanceBaseUI);
            return true;
        }
        j1Var.f157777d.H = charSequence.toString();
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.V6(j1Var.f157777d);
        return true;
    }
}
