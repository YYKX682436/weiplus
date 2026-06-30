package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oc0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113742d;

    public oc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f113742d = nd0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$forceUpdateExpandToAdMode$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.nd0.t1(this.f113742d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$forceUpdateExpandToAdMode$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
