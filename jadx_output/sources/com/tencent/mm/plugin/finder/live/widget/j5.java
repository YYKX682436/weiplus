package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.l5 f118725d;

    public j5(com.tencent.mm.plugin.finder.live.widget.l5 l5Var) {
        this.f118725d = l5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.l5 l5Var = this.f118725d;
        qo0.c.a(l5Var.f118899e, qo0.b.f365444z2, null, 2, null);
        ll2.e.b(ll2.e.f319133a, l5Var.f118904m, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
