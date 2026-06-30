package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class l implements com.tencent.mm.wallet_core.model.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI f157799a;

    public l(com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI) {
        this.f157799a = personalPayRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.model.p
    public void a() {
        com.tencent.mm.ui.s2 s2Var = com.tencent.mm.ui.s2.FAIL;
        int i17 = com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.f157101t;
        this.f157799a.V6(s2Var, "intercept by jump remind");
    }
}
