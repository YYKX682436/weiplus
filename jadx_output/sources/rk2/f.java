package rk2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout f396452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.rtmp.ui.TXCloudVideoView f396453e;

    public f(com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f396452d = finderLiveMultiStreamViewLayout;
        this.f396453e = tXCloudVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f396452d.f111745d, "receive frame change, real remove origin view");
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f396453e;
        android.view.ViewParent parent = tXCloudVideoView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(tXCloudVideoView);
        }
    }
}
