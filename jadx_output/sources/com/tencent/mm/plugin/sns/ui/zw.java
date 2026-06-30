package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kw f171719d;

    public zw(com.tencent.mm.plugin.sns.ui.kw kwVar) {
        this.f171719d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$21");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int a17 = com.tencent.mm.plugin.sns.ui.kw.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.ui.rx rxVar = this.f171719d.f169653a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.ui.kw.f(view, a17, rxVar);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$21");
    }
}
