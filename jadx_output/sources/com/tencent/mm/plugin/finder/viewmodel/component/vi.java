package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f136249e;

    public vi(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.content.Intent intent) {
        this.f136248d = blVar;
        this.f136249e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.tencent.mm.plugin.finder.viewmodel.component.ui uiVar = com.tencent.mm.plugin.finder.viewmodel.component.ui.f136140d;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136248d;
        nk6.X("AuthorProfileNotify", uiVar, false, xy2.c.e(blVar.getActivity()));
        com.tencent.mm.plugin.finder.viewmodel.component.bl.p7(this.f136248d, false, null, false, 2, null);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, blVar.getActivity(), this.f136249e, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).ck(blVar.getActivity(), this.f136249e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
