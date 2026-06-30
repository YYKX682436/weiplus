package rk2;

/* loaded from: classes3.dex */
public final class g extends mn0.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout f396454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f396455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.rtmp.ui.TXCloudVideoView f396456f;

    public g(com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout, com.tencent.mm.live.core.view.LiveVideoView liveVideoView, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f396454d = finderLiveMultiStreamViewLayout;
        this.f396455e = liveVideoView;
        this.f396456f = tXCloudVideoView;
    }

    @Override // mn0.a0
    public void b() {
        com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = this.f396454d;
        com.tencent.mars.xlog.Log.i(finderLiveMultiStreamViewLayout.f111745d, "receive frame change, remove origin view(" + this.f396455e.hashCode() + ')');
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f396456f;
        tXCloudVideoView.postDelayed(new rk2.f(finderLiveMultiStreamViewLayout, tXCloudVideoView), 60L);
    }
}
