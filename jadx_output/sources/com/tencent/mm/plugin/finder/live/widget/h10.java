package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f118506e;

    public h10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var) {
        this.f118505d = m10Var;
        this.f118506e = fr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showJoinGameGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118505d;
        m10Var.l();
        ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).V2 = true;
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r45.fr1 fr1Var = this.f118506e;
        r0Var.Tj(m10Var.j(fr1Var != null ? fr1Var.getInteger(8) : 0, 18));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showJoinGameGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
