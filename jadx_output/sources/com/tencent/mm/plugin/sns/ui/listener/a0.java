package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes3.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169746d;

    public a0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169746d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$23");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f169746d.z(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$23");
    }
}
