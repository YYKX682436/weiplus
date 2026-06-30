package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class g6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.NewRangeWidget f168408d;

    public g6(com.tencent.mm.plugin.sns.ui.NewRangeWidget newRangeWidget) {
        this.f168408d = newRangeWidget;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/NewRangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = com.tencent.mm.plugin.sns.ui.NewRangeWidget.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        com.tencent.mm.plugin.sns.ui.NewRangeWidget newRangeWidget = this.f168408d;
        android.view.View.OnClickListener onClickListener = newRangeWidget.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        if (onClickListener != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            android.view.View.OnClickListener onClickListener2 = newRangeWidget.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            onClickListener2.onClick(view);
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().f61240g = 1;
            ta4.d1.f416736a.b("view_clk");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/NewRangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$1");
    }
}
