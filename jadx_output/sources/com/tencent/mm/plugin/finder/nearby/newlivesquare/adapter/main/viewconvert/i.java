package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t f121717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.c f121719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.le1 f121720g;

    public i(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t tVar, in5.s0 s0Var, vp2.c cVar, r45.le1 le1Var) {
        this.f121717d = tVar;
        this.f121718e = s0Var;
        this.f121719f = cVar;
        this.f121720g = le1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList anchor_group = this.f121720g.f379362v;
        kotlin.jvm.internal.o.f(anchor_group, "anchor_group");
        r45.ne1 ne1Var = (r45.ne1) kz5.n0.a0(anchor_group, 0);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t.n(this.f121717d, this.f121718e, this.f121719f, ne1Var != null ? ne1Var.f381307e : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardContent$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
