package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes9.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.q f155549d;

    public o(com.tencent.mm.plugin.record.ui.viewWrappers.q qVar) {
        this.f155549d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!fp.i.b()) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        et3.b bVar = (et3.b) view.getTag();
        boolean k07 = o72.x1.k0(bVar.f256590a);
        com.tencent.mm.plugin.record.ui.viewWrappers.q qVar = this.f155549d;
        if (k07) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OtherViewWrapper", "same song, do release");
            com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
            mvCardActionReportStruct.f59456j = 2L;
            mvCardActionReportStruct.f59457k = 16L;
            zy2.oc.b(mvCardActionReportStruct);
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).pj();
            if (!qVar.f155555d) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = qVar.f155554c;
                n3Var.sendMessageAtFrontOfQueue(n3Var.obtainMessage(1));
            }
        } else {
            qVar.f155555d = true;
            r45.gp0 gp0Var = bVar.f256590a;
            o72.x1.u0(gp0Var, gp0Var.J1.f376353d.f377245w, java.lang.Boolean.TRUE, qVar.H().f25422d, qVar.G(bVar.f256591b), java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(qVar.f155559h)), qVar.f155557f, qVar.f155556e);
            com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
            mvCardActionReportStruct2.f59456j = 1L;
            mvCardActionReportStruct2.f59457k = 16L;
            zy2.oc.b(mvCardActionReportStruct2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
