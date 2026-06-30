package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f115302d;

    public z60(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f115302d = v70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f115302d;
        v70Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onClickExitBtn");
        ml2.q2 q2Var = ml2.q2.f327844z1;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 63 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        fj2.j jVar = fj2.j.f263174a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = v70Var.U;
        android.content.Context context = v70Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        v70Var.U = jVar.c(k0Var, context, new com.tencent.mm.plugin.finder.live.plugin.o70(v70Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
