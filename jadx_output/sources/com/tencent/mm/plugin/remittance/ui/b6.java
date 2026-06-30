package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class b6 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157649a;

    public b6(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157649a = remittanceDetailUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        if (n34Var.f381049e == 1) {
            this.f157649a.finish();
        }
    }
}
