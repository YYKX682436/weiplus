package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135335d;

    public nk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135335d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$setSearchEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135335d;
        androidx.appcompat.app.AppCompatActivity context = blVar.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        so2.j5 j5Var = blVar.f133890J;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        com.tencent.mm.plugin.finder.report.l0.h(l0Var, V6, baseFinderFeed != null ? baseFinderFeed.getFeedObject() : null, 113, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 113))), 0, null, 48, null);
        android.app.Activity context2 = blVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar2 != null) {
            com.tencent.mm.plugin.finder.report.r0 r0Var = nyVar2.T;
            com.tencent.mm.plugin.finder.report.k4 k4Var = r0Var instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) r0Var : null;
            if (k4Var != null) {
                k4Var.U0();
            }
            com.tencent.mm.plugin.finder.report.k4 k4Var2 = nyVar2.f135393x0;
            if (k4Var2 != null) {
                k4Var2.U0();
            }
            com.tencent.mm.plugin.finder.report.l1 l1Var = nyVar2.f135394x1;
            if (!(l1Var instanceof com.tencent.mm.plugin.finder.report.k4)) {
                l1Var = null;
            }
            if (l1Var != null) {
                l1Var.U0();
            }
            com.tencent.mm.plugin.finder.report.l1 l1Var2 = nyVar2.B1;
            com.tencent.mm.plugin.finder.report.l1 l1Var3 = l1Var2 instanceof com.tencent.mm.plugin.finder.report.k4 ? l1Var2 : null;
            if (l1Var3 != null) {
                l1Var3.U0();
            }
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        v1Var.q(((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6(), 23);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).pk(blVar.getActivity());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$setSearchEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
