package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.qh f113515d;

    public mh(com.tencent.mm.plugin.finder.live.plugin.qh qhVar) {
        this.f113515d = qhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.qh qhVar = this.f113515d;
        ((mm2.d1) qhVar.P0(mm2.d1.class)).f328952g = false;
        qhVar.K0(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
