package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157626g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157627h;

    public a1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f157627h = remittanceBaseUI;
        this.f157623d = q0Var;
        this.f157624e = str;
        this.f157625f = str2;
        this.f157626g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157627h;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "onClick1 realNameCheckMessage %s", remittanceBaseUI.A1);
        com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct();
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157623d;
        wCPayTrasnferCheckRealNameReportStruct.f62128f = (int) q0Var.f156982y;
        wCPayTrasnferCheckRealNameReportStruct.p(q0Var.S);
        wCPayTrasnferCheckRealNameReportStruct.f62126d = 9L;
        wCPayTrasnferCheckRealNameReportStruct.k();
        q0Var.R = null;
        remittanceBaseUI.i7(this.f157624e, this.f157625f, this.f157626g, q0Var);
    }
}
