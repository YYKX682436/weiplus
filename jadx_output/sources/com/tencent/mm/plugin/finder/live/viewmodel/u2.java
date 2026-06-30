package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m2 f117444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z2 f117445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.x2 f117446f;

    public u2(com.tencent.mm.plugin.finder.live.viewmodel.m2 m2Var, com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var, com.tencent.mm.plugin.finder.live.viewmodel.x2 x2Var) {
        this.f117444d = m2Var;
        this.f117445e = z2Var;
        this.f117446f = x2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.m2 m2Var = this.f117444d;
        if (!m2Var.f117238d) {
            com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = this.f117445e;
            z2Var.f117566p = true;
            java.util.Iterator it = z2Var.f117560g.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.viewmodel.m2) it.next()).f117238d = false;
            }
            m2Var.f117238d = true;
            if (z2Var.f117561h) {
                kotlinx.coroutines.l.d(z2Var.f117565o, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.t2(z2Var, null), 3, null);
            }
            this.f117446f.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
