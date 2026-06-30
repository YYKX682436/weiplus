package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f118716a;

    public j2(android.app.Activity activity, com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView bannerView) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(bannerView, "bannerView");
        this.f118716a = bannerView;
    }

    public final void a(r45.n73 gameInfo) {
        kotlin.jvm.internal.o.g(gameInfo, "gameInfo");
        r45.x53 x53Var = (r45.x53) gameInfo.getCustom(4);
        java.util.LinkedList list = x53Var != null ? x53Var.getList(0) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update ");
        java.lang.Object obj = (r45.x53) gameInfo.getCustom(4);
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderGameLivePostTaskWidget", sb6.toString());
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView = this.f118716a;
        if (list == null || list.isEmpty()) {
            finderLiveTaskBannerView.setVisibility(4);
            return;
        }
        finderLiveTaskBannerView.setVisibility(0);
        r45.z53 z53Var = (r45.z53) gameInfo.getCustom(1);
        finderLiveTaskBannerView.setGameAppId(z53Var != null ? z53Var.getString(0) : null);
        java.util.List V = kz5.n0.V(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(V, 10));
        java.util.Iterator it = ((java.util.ArrayList) V).iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.mm.plugin.finder.live.widget.ow((r45.y53) it.next(), ((r45.x53) gameInfo.getCustom(4)) != null ? r7.getInteger(1) : 0L));
        }
        finderLiveTaskBannerView.setTaskInfoList(arrayList);
        finderLiveTaskBannerView.f117682p = true;
        finderLiveTaskBannerView.c();
    }
}
