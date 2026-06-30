package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f115159d;

    public y60(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f115159d = v70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f115159d;
        v70Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onClickContinueBtn");
        ml2.q2 q2Var = ml2.q2.f327828p0;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 55 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        ((mm2.o4) v70Var.P0(mm2.o4.class)).R = 2;
        ((mm2.o4) v70Var.P0(mm2.o4.class)).Q.postValue(java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
