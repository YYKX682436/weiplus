package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class f0 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.r0 f157697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l0 f157698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI f157699c;

    public f0(com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI remittanceAdapterUI, com.tencent.mm.plugin.remittance.model.r0 r0Var, com.tencent.mm.plugin.wallet_core.utils.l0 l0Var) {
        this.f157699c = remittanceAdapterUI;
        this.f157697a = r0Var;
        this.f157698b = l0Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        if (n34Var.f381049e != 2) {
            this.f157698b.f180921a = true;
        } else {
            int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI.f157117u;
            this.f157699c.U6(this.f157697a);
        }
    }
}
