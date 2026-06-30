package vw3;

/* loaded from: classes15.dex */
public final class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI f440941d;

    public e5(com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI repairerSdkCgiReportUI) {
        this.f440941d = repairerSdkCgiReportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerSdkCgiReportUI repairerSdkCgiReportUI = this.f440941d;
        android.widget.EditText editText = repairerSdkCgiReportUI.e;
        if (editText == null) {
            kotlin.jvm.internal.o.o("etReportCount");
            throw null;
        }
        java.lang.Integer h17 = r26.h0.h(editText.getText().toString());
        if (h17 != null && h17.intValue() > 0) {
            int intValue = h17.intValue();
            for (int i17 = 0; i17 < intValue; i17++) {
                bw5.q4 V6 = repairerSdkCgiReportUI.V6();
                android.widget.Switch r47 = repairerSdkCgiReportUI.n;
                if (r47 == null) {
                    kotlin.jvm.internal.o.o("switchAggregation");
                    throw null;
                }
                V6.f31932r = r47.isChecked();
                V6.f31936v[12] = true;
                bw5.q4 V62 = repairerSdkCgiReportUI.V6();
                V62.f31928n = "garencliuTest_" + (i17 % 5);
                V62.f31936v[8] = true;
                com.tencent.wechat.aff.data_report.h.f216606c.d(repairerSdkCgiReportUI.V6(), vw3.b5.f440893a);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSdkCgiReportUI$setupListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
