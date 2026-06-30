package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class am implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f117787d;

    public am(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        this.f117787d = finderLiveInfiniteLoopView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = this.f117787d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.a(finderLiveInfiniteLoopView);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.b(finderLiveInfiniteLoopView);
        finderLiveInfiniteLoopView.g();
    }
}
