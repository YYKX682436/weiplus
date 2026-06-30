package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class tl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f119893d;

    public tl(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        this.f119893d = finderLiveInfiniteLoopView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = this.f119893d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.a(finderLiveInfiniteLoopView);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.b(finderLiveInfiniteLoopView);
        finderLiveInfiniteLoopView.g();
    }
}
