package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ff implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112545d;

    public ff(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112545d = mgVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[liveBubbleShowStatusLiveData] " + ((java.lang.Boolean) obj));
        this.f112545d.D.notifyDataSetChanged();
    }
}
