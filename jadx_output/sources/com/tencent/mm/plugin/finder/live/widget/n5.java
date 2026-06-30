package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f119156d;

    public n5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        this.f119156d = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f119156d;
        d6Var.getClass();
        qo0.c.a(d6Var.f118060b, qo0.b.A2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
