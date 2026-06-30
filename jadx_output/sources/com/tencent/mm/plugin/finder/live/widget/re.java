package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class re implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f119633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f119634e;

    public re(com.tencent.mm.plugin.finder.live.view.k0 k0Var, com.tencent.mm.plugin.finder.live.widget.se seVar) {
        this.f119633d = k0Var;
        this.f119634e = seVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$5$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f119633d;
        kotlinx.coroutines.l.d(k0Var.getBuContext().f272475i, null, null, new com.tencent.mm.plugin.finder.live.widget.qe(k0Var, this.f119634e, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$5$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
