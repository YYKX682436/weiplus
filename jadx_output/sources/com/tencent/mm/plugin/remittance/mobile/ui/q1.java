package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class q1 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.t1 f156709a;

    public q1(com.tencent.mm.plugin.remittance.mobile.ui.t1 t1Var) {
        this.f156709a = t1Var;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString());
        com.tencent.mm.plugin.remittance.mobile.ui.t1 t1Var = this.f156709a;
        if (K0) {
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = t1Var.f156721d;
            mobileRemittanceUI.Q = null;
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.V6(mobileRemittanceUI);
            return true;
        }
        t1Var.f156721d.Q = charSequence.toString();
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.V6(t1Var.f156721d);
        return true;
    }
}
