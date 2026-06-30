package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class zi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f136686e;

    public zi(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.content.Intent intent) {
        this.f136685d = blVar;
        this.f136686e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.tencent.mm.plugin.finder.viewmodel.component.yi yiVar = com.tencent.mm.plugin.finder.viewmodel.component.yi.f136581d;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136685d;
        nk6.X("AuthorProfileMemberNotify", yiVar, false, xy2.c.e(blVar.getActivity()));
        com.tencent.mm.plugin.finder.viewmodel.component.bl.p7(this.f136685d, false, null, false, 2, null);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, blVar.getActivity(), this.f136686e, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Rj(blVar.getActivity(), this.f136686e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
