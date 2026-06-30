package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class bm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f117908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f117909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117910f;

    public bm(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f117908d = finderLiveInfiniteLoopView;
        this.f117909e = f0Var;
        this.f117910f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f117908d.f117643f;
        if (finderLiveViewPager != null) {
            finderLiveViewPager.setCurrentItem(this.f117909e.f310116d, this.f117910f.f310112d);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }
}
