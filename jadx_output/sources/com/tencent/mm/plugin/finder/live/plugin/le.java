package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class le implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113386d;

    public le(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113386d = mgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113386d;
        ((mm2.c1) mgVar.P0(mm2.c1.class)).N1 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) mgVar.P0(mm2.c1.class)).N1);
        mgVar.M0(qo0.b.Z2, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
