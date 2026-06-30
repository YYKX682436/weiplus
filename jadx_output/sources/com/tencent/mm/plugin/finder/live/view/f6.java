package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView f116292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f116295g;

    public f6(com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView, int i17, int i18, int i19) {
        this.f116292d = finderLiveMarqueeTextView;
        this.f116293e = i17;
        this.f116294f = i18;
        this.f116295g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = this.f116292d;
        android.widget.Scroller scroller = finderLiveMarqueeTextView.f116023d;
        kotlin.jvm.internal.o.d(scroller);
        scroller.startScroll(this.f116293e, 0, this.f116294f, 0, this.f116295g);
        finderLiveMarqueeTextView.invalidate();
        finderLiveMarqueeTextView.f116026g = false;
    }
}
