package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169764d;

    public c0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169764d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$25");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) view.getTag();
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "localId " + str);
            com.tencent.mm.plugin.sns.model.s5.s(com.tencent.mm.plugin.sns.storage.w2.m(str));
            com.tencent.mm.plugin.sns.model.s5.r(com.tencent.mm.plugin.sns.storage.w2.m(str));
            com.tencent.mm.plugin.sns.model.l4.Nj().d();
            this.f169764d.B();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$25");
    }
}
