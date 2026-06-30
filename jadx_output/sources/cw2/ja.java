package cw2;

/* loaded from: classes10.dex */
public final class ja implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f223794a;

    public ja(java.lang.ref.WeakReference playerView) {
        kotlin.jvm.internal.o.g(playerView, "playerView");
        this.f223794a = playerView;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (info.getInteger(1) <= 0) {
            com.tencent.mm.plugin.finder.video.LiveFeedPlayerView liveFeedPlayerView = (com.tencent.mm.plugin.finder.video.LiveFeedPlayerView) this.f223794a.get();
            if (liveFeedPlayerView == null) {
                com.tencent.mars.xlog.Log.i("LiveFeedPlayerView", "timer finish bug reference is null!");
            } else {
                int i17 = com.tencent.mm.plugin.finder.video.LiveFeedPlayerView.f130736p0;
                liveFeedPlayerView.R(true);
            }
        }
    }
}
