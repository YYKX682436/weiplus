package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120707d;

    public h0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120707d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("giftRecommendDesc clicked with data:");
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120707d;
        sb6.append(t0Var.f120787x);
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", sb6.toString());
        t0Var.E();
        for (com.tencent.mm.plugin.finder.live.wish.widget.z zVar : t0Var.f120787x) {
            r45.kv1 kv1Var = (r45.kv1) zVar.f120824a.getCustom(0);
            if (kv1Var != null) {
                r45.z94 z94Var = zVar.f120824a;
                t0Var.A(new ln2.f(kv1Var, z94Var.getLong(1), z94Var.getLong(2)));
                t0Var.I();
            }
        }
        t0Var.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
