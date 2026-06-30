package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157647d;

    public b3(com.tencent.mm.plugin.remittance.ui.h3 h3Var) {
        this.f157647d = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "need refresh item");
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157647d;
        h3Var.notifyItemRangeChanged(0, h3Var.getItemCount(), java.lang.Boolean.TRUE);
    }
}
