package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112888d;

    public i1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f112888d = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112888d;
        v3Var.f114643p.statusChange(qo0.b.f365396p, null);
        if (v3Var.f114643p.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Lj(ml2.i1.f327549g, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
