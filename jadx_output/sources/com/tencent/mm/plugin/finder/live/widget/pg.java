package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class pg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f119382d;

    public pg(com.tencent.mm.plugin.finder.live.widget.bh bhVar) {
        this.f119382d = bhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f119382d;
        bhVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(bhVar.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.wg(0, bhVar, 1);
        k0Var.e(false);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.xg(bhVar, 0, 1);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
