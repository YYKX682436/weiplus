package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class d8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.RangeWidget f168175d;

    public d8(com.tencent.mm.plugin.sns.ui.RangeWidget rangeWidget) {
        this.f168175d = rangeWidget;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/RangeWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.RangeWidget.f166598x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.RangeWidget rangeWidget = this.f168175d;
        android.view.View.OnClickListener onClickListener = rangeWidget.f166613v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        if (onClickListener != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            android.view.View.OnClickListener onClickListener2 = rangeWidget.f166613v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            onClickListener2.onClick(view);
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().f61240g = 1;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/RangeWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$2");
    }
}
