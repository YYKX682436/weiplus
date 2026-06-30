package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class ob implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator f116567d;

    public ob(com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator) {
        this.f116567d = finderLiveTextIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator.f116111o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post tab1Tv.measuredWidth:");
        com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator = this.f116567d;
        sb6.append(finderLiveTextIndicator.f116112d.getMeasuredWidth());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTextIndicator", sb6.toString());
        finderLiveTextIndicator.f116118m.getLayoutParams().width = finderLiveTextIndicator.f116112d.getMeasuredWidth();
    }
}
