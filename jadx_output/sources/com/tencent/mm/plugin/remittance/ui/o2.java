package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class o2 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157856a;

    public o2(com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        this.f157856a = z0Var;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.remittance.ui.l2 l2Var = com.tencent.mm.plugin.remittance.ui.h3.f157733t;
        com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f157856a;
        l2Var.e(5, z0Var.f157069a, z0Var.f157088t);
    }
}
