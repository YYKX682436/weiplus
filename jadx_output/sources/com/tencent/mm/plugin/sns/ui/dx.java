package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kw f168214d;

    public dx(com.tencent.mm.plugin.sns.ui.kw kwVar) {
        this.f168214d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "cardRediretListener");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
        } else {
            com.tencent.mm.plugin.sns.ui.kw.d(com.tencent.mm.plugin.sns.ui.kw.b(this.f168214d), (com.tencent.mm.plugin.sns.ui.i2) view.getTag(), com.tencent.mm.plugin.sns.ui.kw.B);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$26");
        }
    }
}
