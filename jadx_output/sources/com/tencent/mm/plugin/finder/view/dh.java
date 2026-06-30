package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class dh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostOriginView f131895d;

    public dh(com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView) {
        this.f131895d = finderPostOriginView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$initEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView = this.f131895d;
        com.tencent.mm.ui.widget.MMSwitchBtn view2 = finderPostOriginView.f131377e;
        java.util.Map c17 = finderPostOriginView.c(java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        kotlin.jvm.internal.o.g(view2, "view");
        hc2.v0.b(view2, "original_statement", "view_clk", 0, c17, null, 20, null);
        finderPostOriginView.i(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$initEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
