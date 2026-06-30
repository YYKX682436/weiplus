package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class h6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.r6 f116351d;

    public h6(com.tencent.mm.plugin.finder.live.view.r6 r6Var) {
        this.f116351d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.s6 s6Var = this.f116351d.f116632b;
        if (s6Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onCollapseClick");
            fj2.s.f263183a.e(ml2.q4.f327852e, null);
            ((df2.t2) s6Var).Z6(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
