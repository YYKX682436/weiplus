package df2;

/* loaded from: classes3.dex */
public final class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f230051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230052e;

    public ec(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView, int i17) {
        this.f230051d = finderLiveInfiniteLoopView;
        this.f230052e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = this.f230051d;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveInfiniteLoopView.getLayoutParams();
        layoutParams.height = this.f230052e;
        finderLiveInfiniteLoopView.setLayoutParams(layoutParams);
        finderLiveInfiniteLoopView.g();
        finderLiveInfiniteLoopView.setCanScroll(true);
    }
}
