package vw3;

/* loaded from: classes15.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI f440928d;

    public d5(com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI repairerSdkCgiReportUI) {
        this.f440928d = repairerSdkCgiReportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI.r;
        this.f440928d.getClass();
        try {
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("sdk_data_report"), false);
            com.tencent.wechat.aff.data_report.h hVar = com.tencent.wechat.aff.data_report.h.f216606c;
            if (hVar.b(i18)) {
                hVar.a(3);
                hVar.g("onIdKeyReport", vw3.x4.f441180a);
                hVar.h("onKVReport", vw3.y4.f441194a);
                hVar.f(true, vw3.z4.f441207a);
            }
        } catch (java.lang.Exception unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
