package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w9 f114695d;

    public v9(com.tencent.mm.plugin.finder.live.plugin.w9 w9Var) {
        this.f114695d = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorRandomMicBubble$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.w9 w9Var = this.f114695d;
        com.tencent.mars.xlog.Log.i(w9Var.f114890f, "close promote");
        kotlinx.coroutines.r2 r2Var = w9Var.f114896o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ((mm2.i5) w9Var.f114888d.a(mm2.i5.class)).f329140f.postValue(null);
        ml2.q2 q2Var = ml2.q2.M;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 42 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorRandomMicBubble$refreshView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
