package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class gi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f112703d;

    public gi(yz5.a aVar) {
        this.f112703d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112703d.invoke();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327948g, null, null, null, null, null, false, 126, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
