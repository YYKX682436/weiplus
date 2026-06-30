package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class wy implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f136373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f136375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f136376g;

    public wy(com.tencent.mm.plugin.finder.viewmodel.component.iz izVar, in5.s0 s0Var, so2.j0 j0Var, java.util.Map map) {
        this.f136373d = izVar;
        this.f136374e = s0Var;
        this.f136375f = j0Var;
        this.f136376g = map;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = this.f136374e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = this.f136373d;
        izVar.getClass();
        so2.j0 item = this.f136375f;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = com.tencent.mm.plugin.finder.viewmodel.component.dz.f134174d;
        k0Var.f211892z = new com.tencent.mm.plugin.finder.viewmodel.component.ez(izVar, item);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.viewmodel.component.hz(item, izVar, context);
        k0Var.v();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_long_press", this.f136376g, 25496);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
