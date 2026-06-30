package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class xc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter f133325d;

    public xc(com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter) {
        this.f133325d = finderLiveBubbleLayoutCompatSlideEnter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "cancelTask");
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter.d(this.f133325d);
    }
}
