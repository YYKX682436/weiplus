package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.r6 f116413d;

    public j6(com.tencent.mm.plugin.finder.live.view.r6 r6Var) {
        this.f116413d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.s6 s6Var = this.f116413d.f116632b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onVideoClick");
            boolean z17 = pm0.v.z(t2Var.d7(), 2);
            fj2.s sVar = fj2.s.f263183a;
            sVar.e(ml2.q4.f327854g, z17 ? ml2.r4.f327910e : ml2.r4.f327911f);
            if (z17) {
                sVar.b(ml2.n4.E);
                if2.b.Y6(t2Var, qo0.b.f365431x0, null, 2, null);
            } else {
                sVar.b(ml2.n4.D);
                if2.b.Y6(t2Var, qo0.b.f365397p0, null, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
