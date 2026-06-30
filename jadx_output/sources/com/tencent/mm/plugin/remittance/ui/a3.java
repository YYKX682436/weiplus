package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class a3 implements com.tencent.mm.plugin.wallet_core.utils.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157630b;

    public a3(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        this.f157629a = h3Var;
        this.f157630b = z0Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.x1
    public void a(r45.yt5 yt5Var, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        if (yt5Var == null) {
            return;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putBinary("route_info", yt5Var.initialProtobufBytes());
        int i17 = yt5Var.f391354d;
        com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f157630b;
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157629a;
        boolean z17 = (i17 == 1 || i17 == 2) && !h3Var.y(z0Var.f157069a, z0Var.f157088t);
        int i18 = z0Var.f157069a;
        java.lang.String str = z0Var.f157088t;
        com.tencent.mm.plugin.remittance.model.x0 x0Var = z0Var.f157079k;
        java.lang.String str2 = x0Var != null ? x0Var.f157064e : null;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.remittance.ui.h3.x(h3Var, i18, str, str2);
        com.tencent.mm.plugin.remittance.ui.h3.f157733t.e(7, z0Var.f157069a, z0Var.f157088t);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "need refresh item");
            h3Var.notifyItemRangeChanged(0, h3Var.getItemCount(), java.lang.Boolean.TRUE);
        }
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            qVar.startUseCase("commonRoute", create, new com.tencent.mm.plugin.remittance.ui.z2());
        }
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.x1
    public boolean b(r45.yt5 yt5Var, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(args, "args");
        return false;
    }
}
