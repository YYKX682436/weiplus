package te2;

/* loaded from: classes3.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC f418507d;

    public w1(com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC) {
        this.f418507d = finderLiveAnchorUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC finderLiveAnchorUIC = this.f418507d;
        if (finderLiveAnchorUIC.f111562q) {
            return;
        }
        finderLiveAnchorUIC.T6();
        finderLiveAnchorUIC.f111562q = true;
    }
}
