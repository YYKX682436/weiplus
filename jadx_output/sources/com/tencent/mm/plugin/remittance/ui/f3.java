package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class f3 implements com.tencent.mm.wallet_core.ui.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157708b;

    public f3(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        this.f157707a = h3Var;
        this.f157708b = z0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.o1
    public final void a() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157707a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(h3Var.f157740i);
        com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f157708b;
        g0Var.d(27731, 4, valueOf, java.lang.Integer.valueOf(z0Var.f157069a), java.lang.Integer.valueOf(z0Var.f157075g), h3Var.f157741m);
    }
}
