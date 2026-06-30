package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class i7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f134706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o7 f134707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f134709g;

    public i7(java.util.Map map, com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var, in5.s0 s0Var, so2.j0 j0Var) {
        this.f134706d = map;
        this.f134707e = o7Var;
        this.f134708f = s0Var;
        this.f134709g = j0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_long_press", this.f134706d, 25496);
        com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var = this.f134707e;
        rl5.r rVar = o7Var.f135432h;
        if (rVar != null) {
            rVar.a();
        }
        rl5.r rVar2 = o7Var.f135432h;
        if (rVar2 != null) {
            in5.s0 s0Var = this.f134708f;
            android.view.View view2 = s0Var.itemView;
            com.tencent.mm.plugin.finder.viewmodel.component.f7 f7Var = new com.tencent.mm.plugin.finder.viewmodel.component.f7(s0Var);
            com.tencent.mm.plugin.finder.viewmodel.component.h7 h7Var = new com.tencent.mm.plugin.finder.viewmodel.component.h7(this.f134709g, o7Var);
            int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
            rVar2.h(view2, f7Var, h7Var, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
