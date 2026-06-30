package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r5 implements com.tencent.mm.plugin.remittance.ui.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157919b;

    public r5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.ui.h3 h3Var) {
        this.f157919b = remittanceDetailUI;
        this.f157918a = h3Var;
    }

    public void a(int i17, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        int i18 = z0Var.f157069a;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157919b;
        remittanceDetailUI.X1 = i18;
        remittanceDetailUI.Y1 = z0Var.f157088t;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "[mDataAdapter.setClickItemCallback] receChannelType: %d,bindSerial: %s", java.lang.Integer.valueOf(i18), remittanceDetailUI.Y1);
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157918a;
        h3Var.notifyItemRangeChanged(0, h3Var.getItemCount(), java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27731, 2, java.lang.Integer.valueOf(z0Var.f157069a), 0, 0, z0Var.f157088t);
    }
}
