package cw2;

/* loaded from: classes2.dex */
public final class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223572d;

    public a9(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223572d = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView thumbView;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223572d;
        cw2.da videoView = finderVideoLayout.getVideoView();
        if ((videoView != null ? videoView.getAlpha() : 0.0f) == 0.0f) {
            return;
        }
        yz5.p thumbShowCallback = finderVideoLayout.getThumbShowCallback();
        if (thumbShowCallback != null) {
            thumbShowCallback.invoke(java.lang.Boolean.TRUE, finderVideoLayout.getPlayInfo());
        }
        cw2.da videoView2 = finderVideoLayout.getVideoView();
        if (videoView2 != null) {
            videoView2.setAlpha(0.0f);
        }
        thumbView = finderVideoLayout.getThumbView();
        thumbView.setVisibility(0);
        com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "[showThumb] " + finderVideoLayout.d0());
    }
}
