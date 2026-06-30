package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f115191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f115192e;

    public yf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar) {
        this.f115191d = mgVar;
        this.f115192e = zfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#showStickTopTitleMsg itemView click");
        com.tencent.mm.plugin.finder.live.plugin.mg.v1(this.f115191d, this.f115192e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
