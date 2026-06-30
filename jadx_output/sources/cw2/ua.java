package cw2;

/* loaded from: classes10.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.LiveFeedPlayerView f224053d;

    public ua(com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView) {
        this.f224053d = liveFeedPlayerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ig2.m mVar = ig2.m.f291393a;
        com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = this.f224053d;
        ig2.r f17 = mVar.f(liveFeedPlayerView.C);
        if (f17 instanceof ig2.i) {
            ((ig2.i) f17).a();
        }
        liveFeedPlayerView.f130755x = true;
        yz5.a aVar = liveFeedPlayerView.f130746o;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
