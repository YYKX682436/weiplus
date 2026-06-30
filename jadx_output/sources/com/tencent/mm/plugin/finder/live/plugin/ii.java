package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ii implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oi f112978d;

    public ii(com.tencent.mm.plugin.finder.live.plugin.oi oiVar) {
        this.f112978d = oiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112978d.K0(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
