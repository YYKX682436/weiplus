package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class g0 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l0 f157716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI f157717b;

    public g0(com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI remittanceAdapterUI, com.tencent.mm.plugin.wallet_core.utils.l0 l0Var) {
        this.f157717b = remittanceAdapterUI;
        this.f157716a = l0Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        if (i17 == 0 || i17 == 1) {
            this.f157717b.finish();
        } else if (i17 == 3 || i17 == 4) {
            this.f157716a.f180921a = true;
        }
    }
}
