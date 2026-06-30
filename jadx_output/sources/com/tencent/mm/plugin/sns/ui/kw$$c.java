package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class kw$$c implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$new$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array2 = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.tencent.mm.plugin.sns.ui.kw.m((com.tencent.mm.plugin.sns.ui.i2) view.getTag(), view.getContext(), com.tencent.mm.plugin.sns.ui.kw.B);
            yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$3", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
