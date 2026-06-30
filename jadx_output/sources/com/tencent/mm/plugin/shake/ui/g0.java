package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class g0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeMsgListUI f162271d;

    public g0(com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI) {
        this.f162271d = shakeMsgListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c34.t tVar = (c34.t) this.f162271d.f162103e.getItem(i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(tVar.field_tag)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11316, this.f162271d.f162109n + "," + tVar.field_tag);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", tVar.field_tag);
            j45.l.j(this.f162271d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
            ku5.u0 u0Var = ku5.t0.f312615d;
            y24.a aVar = new y24.a(shakeActionReportStruct, 201);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(aVar, 100L, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
