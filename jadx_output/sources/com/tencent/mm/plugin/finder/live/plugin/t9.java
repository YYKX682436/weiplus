package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w9 f114362d;

    public t9(com.tencent.mm.plugin.finder.live.plugin.w9 w9Var) {
        this.f114362d = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorRandomMicBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.q2 q2Var = ml2.q2.L;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 41 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        com.tencent.mm.plugin.finder.live.plugin.w9 w9Var = this.f114362d;
        ((mm2.o4) w9Var.f114888d.a(mm2.o4.class)).R = 3;
        ((mm2.o4) w9Var.f114888d.a(mm2.o4.class)).Q.postValue(java.lang.Boolean.TRUE);
        ((mm2.i5) w9Var.f114888d.a(mm2.i5.class)).f329140f.postValue(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorRandomMicBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
