package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157643d;

    public b1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157643d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "onClick1");
        com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct();
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157643d;
        wCPayTrasnferCheckRealNameReportStruct.f62128f = (int) q0Var.f156982y;
        wCPayTrasnferCheckRealNameReportStruct.p(q0Var.S);
        wCPayTrasnferCheckRealNameReportStruct.f62126d = 8L;
        wCPayTrasnferCheckRealNameReportStruct.k();
    }
}
