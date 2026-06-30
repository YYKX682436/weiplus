package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pc0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113857d;

    public pc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f113857d = nd0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$forceUpdateExpandToBizMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f113857d;
        com.tencent.mm.plugin.finder.live.plugin.nd0.t1(nd0Var);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).uj(nd0Var.D1());
        if (((mm2.c1) nd0Var.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) nd0Var.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
            vVar.a();
            vVar.c(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_MESSAGE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$forceUpdateExpandToBizMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
