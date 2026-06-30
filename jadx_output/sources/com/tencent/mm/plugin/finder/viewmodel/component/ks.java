package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ks implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f134988d;

    public ks(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        this.f134988d = ptVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f134988d;
        in5.s0 s0Var = ptVar.f135616q;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = s0Var != null ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i : null;
        if (s0Var != null && baseFinderFeed != null) {
            ml2.t1 t1Var = ml2.t1.f327966m3;
            jz5.l[] lVarArr = new jz5.l[2];
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
            ml2.a3[] a3VarArr = ml2.a3.f327203d;
            lVarArr[1] = new jz5.l("button_status", java.lang.String.valueOf(1));
            ptVar.d7(s0Var, baseFinderFeed, t1Var, kz5.c1.l(lVarArr));
        }
        ptVar.f135624y = com.tencent.mm.plugin.finder.viewmodel.component.js.f134887e;
        ptVar.U6(1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
