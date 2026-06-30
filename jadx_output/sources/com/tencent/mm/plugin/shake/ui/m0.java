package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.o0 f162308d;

    public m0(com.tencent.mm.plugin.shake.ui.o0 o0Var) {
        this.f162308d = o0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.qa qaVar = this.f162308d.f162315d.f162212d;
        qaVar.f195251d.delete(qaVar.getTableName(), null, null);
        this.f162308d.f162315d.f162213e.q();
        android.widget.TextView textView = (android.widget.TextView) this.f162308d.f162315d.findViewById(com.tencent.mm.R.id.dfo);
        textView.setText(com.tencent.mm.R.string.i8k);
        textView.setVisibility(0);
        this.f162308d.f162315d.enableOptionMenu(false);
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        ku5.u0 u0Var = ku5.t0.f312615d;
        y24.a aVar = new y24.a(shakeActionReportStruct, 152);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
    }
}
