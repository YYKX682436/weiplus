package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cx implements android.view.View.OnClickListener {
    public cx(com.tencent.mm.plugin.sns.ui.kw kwVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$25");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "hardMallProductRedirectListener");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$25");
        } else {
            com.tencent.mm.plugin.sns.ui.kw.C(view.getContext(), (com.tencent.mm.plugin.sns.ui.i2) view.getTag(), com.tencent.mm.plugin.sns.ui.kw.B);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$25");
        }
    }
}
