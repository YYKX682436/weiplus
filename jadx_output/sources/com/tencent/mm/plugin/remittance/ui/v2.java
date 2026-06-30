package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class v2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        super(false);
        this.f157989d = h3Var;
        this.f157990e = z0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157989d;
        com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f157990e;
        h3Var.z(z0Var, true);
        h3Var.L(z0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "onclick selectType" + h3Var.f157740i);
        com.tencent.mm.plugin.remittance.ui.j2 j2Var = h3Var.f157737f;
        if (j2Var != null) {
            ((com.tencent.mm.plugin.remittance.ui.r5) j2Var).a(h3Var.f157740i, z0Var);
        }
    }
}
