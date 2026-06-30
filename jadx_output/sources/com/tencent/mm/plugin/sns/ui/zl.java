package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zl implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f171699d;

    public zl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f171699d = snsMsgUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f171699d;
        if (i17 == com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getCount()) {
            snsMsgUI.p7();
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$9");
            return;
        }
        com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).getItem(i17);
        if (v1Var != null) {
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(v1Var.field_snsID);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            snsMsgUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("skipClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            boolean z17 = W0 != null && W0.getTypeFlag() == 7;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("skipClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.SnsMsgUI.b7(snsMsgUI, v1Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$9");
    }
}
