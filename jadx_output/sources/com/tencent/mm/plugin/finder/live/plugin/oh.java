package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.qh f113753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f113754f;

    public oh(java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.qh qhVar, r45.m70 m70Var) {
        this.f113752d = str;
        this.f113753e = qhVar;
        this.f113754f = m70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$tryToShowTicket$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).jk(2, this.f113752d);
        com.tencent.mm.plugin.finder.live.plugin.qh qhVar = this.f113753e;
        ((mm2.d1) qhVar.P0(mm2.d1.class)).f328951f = this.f113754f;
        if (qhVar.x0()) {
            com.tencent.mm.plugin.finder.live.plugin.l.s1(this.f113753e, "PORTRAIT_ACTION_GOTO_TICKET", null, 0, 6, null);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.qh.t1(qhVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$tryToShowTicket$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
