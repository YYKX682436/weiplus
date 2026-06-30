package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f136277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f136278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f136279f;

    public vy(com.tencent.mm.plugin.finder.viewmodel.component.iz izVar, so2.j0 j0Var, java.util.Map map) {
        this.f136277d = izVar;
        this.f136278e = j0Var;
        this.f136279f = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).jl(this.f136277d.getContext(), this.f136278e);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_clk", this.f136279f, 25496);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
