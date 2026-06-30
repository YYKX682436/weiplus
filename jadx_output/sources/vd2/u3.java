package vd2;

/* loaded from: classes3.dex */
public final class u3 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final int f435931n;

    public u3(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, int i17) {
        super(finderLiveViewCallback.f111492q.getContext());
        this.f435931n = i17;
    }

    @Override // androidx.recyclerview.widget.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        int g17 = super.g(i17, i18, i19, i27, i28);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "scroll calculateDtToFit : " + g17);
        if (g17 > 0) {
            int i29 = com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.E;
            return g17 - com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.E;
        }
        int i37 = com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.E;
        return g17 + com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager.E;
    }

    @Override // androidx.recyclerview.widget.o1
    public int k(int i17) {
        int i18 = this.f435931n;
        return i18 > 0 ? i18 : super.k(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        int i18 = this.f435931n;
        return i18 > 0 ? i18 : super.l(i17);
    }
}
