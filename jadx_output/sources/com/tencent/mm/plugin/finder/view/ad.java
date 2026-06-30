package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter f131632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f131633e;

    public ad(com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter, int i17) {
        this.f131632d = finderLiveBubbleLayoutCompatSlideEnter;
        this.f131633e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter = this.f131632d;
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter.d(finderLiveBubbleLayoutCompatSlideEnter);
        if (this.f131633e == 1) {
            finderLiveBubbleLayoutCompatSlideEnter.postDelayed(new com.tencent.mm.plugin.finder.view.zc(finderLiveBubbleLayoutCompatSlideEnter), 0L);
        }
    }
}
