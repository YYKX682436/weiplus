package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class cm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f118011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f118012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f118013f;

    public cm(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f118011d = finderLiveInfiniteLoopView;
        this.f118012e = f0Var;
        this.f118013f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f118011d.f117643f;
        if (finderLiveViewPager != null) {
            finderLiveViewPager.setCurrentItem(this.f118012e.f310116d, this.f118013f.f310112d);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }
}
