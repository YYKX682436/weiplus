package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120705d;

    public g0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120705d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set interaction wish to recommend one type:");
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120705d;
        sb6.append(t0Var.f120782s.getLong(0));
        sb6.append(", target:");
        sb6.append(t0Var.f120782s.getLong(1));
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", sb6.toString());
        ((com.tencent.mm.plugin.finder.live.plugin.wn0) t0Var.f120777n).w1(t0Var.f120782s, new com.tencent.mm.plugin.finder.live.wish.widget.e0(t0Var), new com.tencent.mm.plugin.finder.live.wish.widget.f0(t0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
