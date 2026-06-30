package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class eq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f118274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nq f118275e;

    public eq(r45.z53 z53Var, com.tencent.mm.plugin.finder.live.widget.nq nqVar) {
        this.f118274d = z53Var;
        this.f118275e = nqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yg2.b viewScope;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        r45.z53 z53Var = this.f118274d;
        if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
            kotlinx.coroutines.l.d(viewScope, null, null, new com.tencent.mm.plugin.finder.live.widget.dq(this.f118275e, z53Var, null), 3, null);
        }
        int integer = z53Var.getInteger(13);
        com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
        if (integer == 1) {
            x2Var.f(2, z53Var.getString(0));
        } else if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
            x2Var.b(3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$CustomFragmentPagerAdapter$RecyclerAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
