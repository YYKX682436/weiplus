package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114513d;

    public u3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f114513d = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.widget.rx rxVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$updateLiveTask$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.dd ddVar = df2.od.f230952w;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114513d;
        ddVar.c(v3Var.S0(), ml2.t1.P2, null);
        df2.od odVar = (df2.od) v3Var.U0(df2.od.class);
        if (odVar != null && (rxVar = odVar.f230954n) != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(rxVar, null, false, 0, 7, null);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.c());
        android.content.Context context = v3Var.f113324f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        g0Var.d(22748, 3, 2, valueOf, xy2.c.e(context));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$updateLiveTask$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
