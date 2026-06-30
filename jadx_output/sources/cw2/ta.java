package cw2;

/* loaded from: classes10.dex */
public final class ta extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f224033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        super(0);
        this.f224033d = liveFeedPlayerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f224033d;
        cw2.wa waVar = liveFeedPlayerView.f130756y;
        ne2.k kVar = new ne2.k(1, (waVar == null || (feedData = waVar.f224099f) == null) ? 0L : feedData.getLiveId(), 0, 0, 12, null);
        liveFeedPlayerView.N = true;
        kVar.f336537d = new cw2.ja(new java.lang.ref.WeakReference(liveFeedPlayerView));
        return kVar;
    }
}
