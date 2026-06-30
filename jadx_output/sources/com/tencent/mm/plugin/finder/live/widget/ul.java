package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class ul implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f119978d;

    public ul(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        this.f119978d = finderLiveInfiniteLoopView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f119978d.f117643f;
        if (finderLiveViewPager != null) {
            finderLiveViewPager.setCurrentItem(1, false);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }
}
