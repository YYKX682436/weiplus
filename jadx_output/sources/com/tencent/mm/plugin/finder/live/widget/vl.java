package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class vl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f120074d;

    public vl(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        this.f120074d = finderLiveInfiniteLoopView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f120074d.f117643f;
        if (finderLiveViewPager != null) {
            finderLiveViewPager.setCurrentItem(r0.f117649o.size() - 2, false);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }
}
