package cw2;

/* loaded from: classes10.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f223903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f223904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(boolean z17, com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        super(0);
        this.f223903d = z17;
        this.f223904e = liveFeedPlayerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        float f17 = this.f223903d ? 1.0f : 0.0f;
        com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f223904e;
        if (!(liveFeedPlayerView.getAlpha() == f17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set alpha:");
            sb6.append(f17);
            sb6.append(" feedId: ");
            cw2.wa waVar = liveFeedPlayerView.f130756y;
            sb6.append((waVar == null || (feedData = waVar.f224099f) == null) ? null : java.lang.Long.valueOf(feedData.getFeedId()));
            liveFeedPlayerView.Z(sb6.toString());
            liveFeedPlayerView.setAlpha(f17);
        }
        return jz5.f0.f302826a;
    }
}
