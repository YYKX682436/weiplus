package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t f121732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.c f121734f;

    public j(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t tVar, in5.s0 s0Var, vp2.c cVar) {
        this.f121732d = tVar;
        this.f121733e = s0Var;
        this.f121734f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t.n(this.f121732d, this.f121733e, this.f121734f, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
