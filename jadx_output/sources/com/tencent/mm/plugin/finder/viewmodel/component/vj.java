package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136251e;

    public vj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, int i17) {
        this.f136250d = blVar;
        this.f136251e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136250d;
        androidx.appcompat.app.AppCompatActivity context = blVar.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        so2.j5 j5Var = blVar.f133890J;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        com.tencent.mm.plugin.finder.report.l0.h(l0Var, V6, baseFinderFeed != null ? baseFinderFeed.getFeedObject() : null, 112, hc2.k.a(kz5.b1.e(new jz5.l("feedActionType", 112))), 0, null, 48, null);
        androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.gg.O6((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17, false, false, false, null, false, this.f136251e == 2, 31, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
