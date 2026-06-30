package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118339d;

    public fb(com.tencent.mm.plugin.finder.live.widget.nb nbVar) {
        this.f118339d = nbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveInvitorPreparePanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "learn more btn clicked");
        re2.g0.a(this.f118339d.f118183e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveInvitorPreparePanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
