package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI f175333d;

    public p(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI) {
        this.f175333d = networkDiagnoseReportUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.f175304i)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.f175304i);
            if (r6Var.m()) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                com.tencent.mm.sdk.platformtools.i1.f(this.f175333d.getContext(), intent, r6Var, "text/plain", false);
                intent.addFlags(268435456);
                com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI = this.f175333d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(networkDiagnoseReportUI, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                networkDiagnoseReportUI.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(networkDiagnoseReportUI, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
