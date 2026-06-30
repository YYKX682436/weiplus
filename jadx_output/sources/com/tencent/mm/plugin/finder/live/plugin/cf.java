package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cf implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112143d;

    public cf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112143d = mgVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112143d;
        if (!mgVar.x0()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[commentHeightChange] reInitHeight change");
            ((mm2.x4) mgVar.S0().a(mm2.x4.class)).B.postValue(null);
        } else {
            int i17 = com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout.f116120n;
            mgVar.f113510w.b((int) (com.tencent.mm.ui.bl.b(mgVar.f365323d.getContext()).y * 0.3d), true);
        }
    }
}
