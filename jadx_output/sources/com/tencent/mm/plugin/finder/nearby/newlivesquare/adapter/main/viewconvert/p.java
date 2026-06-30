package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t f121867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121868e;

    public p(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t tVar, in5.s0 s0Var) {
        this.f121867d = tVar;
        this.f121868e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindPlayTogetherBulletCard$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f121868e;
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t.n(this.f121867d, s0Var, (vp2.c) obj, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindPlayTogetherBulletCard$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
