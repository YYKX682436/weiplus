package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169861d;

    public x(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169861d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169861d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar));
        if (!(view.getTag() instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20");
            return;
        }
        java.lang.String str = (java.lang.String) view.getTag();
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "delItemListener local id:" + str + ", id:" + k17.field_snsId);
        u1Var.g(k17.field_snsId == 0 ? com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getResources().getString(com.tencent.mm.R.string.jg8) : com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getResources().getString(com.tencent.mm.R.string.jg7));
        u1Var.n(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getResources().getString(com.tencent.mm.R.string.f490367t0));
        u1Var.k(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getResources().getColor(com.tencent.mm.R.color.f479482a31));
        u1Var.l(new com.tencent.mm.plugin.sns.ui.listener.w(this, view));
        u1Var.j(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getResources().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.i(new com.tencent.mm.plugin.sns.ui.listener.v(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20");
    }
}
