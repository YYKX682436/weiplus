package cw2;

/* loaded from: classes10.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f224061d = finderLivePlayView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f224061d;
        cw2.wa waVar = finderLivePlayView.f130607n;
        ne2.k kVar = new ne2.k(1, (waVar == null || (feedData = waVar.f224099f) == null) ? 0L : feedData.getLiveId(), 0, 0, 12, null);
        finderLivePlayView.setLiveFreeTimerInit(true);
        kVar.f336537d = new cw2.k3(new java.lang.ref.WeakReference(finderLivePlayView));
        return kVar;
    }
}
