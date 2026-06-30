package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.e0 f162246d;

    public c0(com.tencent.mm.plugin.shake.ui.e0 e0Var) {
        this.f162246d = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c34.u uVar = this.f162246d.f162255d.f162102d;
        uVar.f38243d.delete(uVar.getTableName(), null, null);
        this.f162246d.f162255d.f162103e.q();
        this.f162246d.f162255d.T6();
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        ku5.u0 u0Var = ku5.t0.f312615d;
        y24.a aVar = new y24.a(shakeActionReportStruct, 202);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
    }
}
