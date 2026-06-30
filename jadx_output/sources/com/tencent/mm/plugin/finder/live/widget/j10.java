package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f118715e;

    public j10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var) {
        this.f118714d = m10Var;
        this.f118715e = fr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_TEAM_JOIN_GUIDE_SHOW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118714d;
        ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).V2 = true;
        m10Var.l();
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r45.fr1 fr1Var = this.f118715e;
        r0Var.Tj(m10Var.j(fr1Var != null ? fr1Var.getInteger(8) : 0, 18));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showNewGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
