package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class m0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169838d;

    public m0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169838d = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof ca4.j)) {
            ca4.j jVar = (ca4.j) view.getTag();
            if (i17 < jVar.f39952a.f39940b.adUnlikeInfo.a().size()) {
                com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = jVar.f39952a.f39940b;
                if (aDInfo.forbidClick) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
                    return;
                }
                com.tencent.mm.plugin.sns.storage.c cVar = (com.tencent.mm.plugin.sns.storage.c) aDInfo.adUnlikeInfo.a().get(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "unlike item click, reason=%s, id=%s", cVar.f165942a, java.lang.Integer.valueOf(cVar.f165945d));
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(jVar.f39954c);
                if (k17 == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
                    return;
                }
                this.f169838d.G(view);
                cVar.f165948g = jVar.f39956e;
                cVar.f165949h = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(k17.field_snsId, 8, cVar);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(q2Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
    }
}
