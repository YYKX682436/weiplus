package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class oe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f119285d;

    public oe(com.tencent.mm.plugin.finder.live.widget.se seVar) {
        this.f119285d = seVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f119285d;
        com.tencent.mm.plugin.finder.live.plugin.po0 po0Var = seVar.f119756d;
        if (po0Var != null && (v3Var = (com.tencent.mm.plugin.finder.live.plugin.v3) ((com.tencent.mm.plugin.finder.live.plugin.l) po0Var).X0(com.tencent.mm.plugin.finder.live.plugin.v3.class)) != null) {
            v3Var.I1(com.tencent.mm.plugin.finder.live.widget.ne.f119177d);
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.ke(seVar));
        com.tencent.mm.plugin.finder.live.widget.se.f(3);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
