package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dd0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112273d;

    public dd0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f112273d = nd0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112273d.f113625z.performClick();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTitlePlugin$setFollowBtnState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
