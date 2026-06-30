package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.RangeWidget f168113d;

    public c8(com.tencent.mm.plugin.sns.ui.RangeWidget rangeWidget) {
        this.f168113d = rangeWidget;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/RangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.RangeWidget.f166598x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.RangeWidget rangeWidget = this.f168113d;
        android.app.Activity activity = rangeWidget.f166599e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsLabelUI.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        int i18 = rangeWidget.f166608q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("KLabel_range_index", i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.lang.String str = rangeWidget.f166610s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("Klabel_name_list", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.lang.String str2 = rangeWidget.f166611t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("Kother_user_name_list", str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.lang.String str3 = rangeWidget.f166612u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        intent.putExtra("Kchat_room_name_list", str3);
        intent.putExtra("k_sns_label_ui_style", rangeWidget.f166614w);
        intent.putExtra("Kis_with_together", rangeWidget.f166249d);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        android.app.Activity activity2 = rangeWidget.f166599e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(5);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/RangeWidget$1", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = s0Var.f164959l;
        if (timelineGroupUserBehaviorStruct != null) {
            int i19 = timelineGroupUserBehaviorStruct.f61238e;
            if (i19 <= 0) {
                timelineGroupUserBehaviorStruct.f61238e = 1;
            } else {
                timelineGroupUserBehaviorStruct.f61238e = i19 + 1;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/RangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$1");
    }
}
