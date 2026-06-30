package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f134201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f134202f;

    public e7(in5.s0 s0Var, so2.j0 j0Var, java.util.Map map) {
        this.f134200d = s0Var;
        this.f134201e = j0Var;
        this.f134202f = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = this.f134200d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.jl(context, this.f134201e);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("continue_watch_collection_card", "view_clk", this.f134202f, 25496);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
