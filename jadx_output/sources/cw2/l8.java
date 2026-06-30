package cw2;

/* loaded from: classes2.dex */
public final class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223847e;

    public l8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, java.lang.String str) {
        this.f223846d = finderVideoLayout;
        this.f223847e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView thumbView;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223846d;
        cw2.da videoView = finderVideoLayout.getVideoView();
        if (kotlin.jvm.internal.o.a(videoView != null ? java.lang.Float.valueOf(videoView.getAlpha()) : null, 1.0f)) {
            com.tencent.mars.xlog.Log.w(finderVideoLayout.getFTPPTag(), "dismissThumb return for alpha == 1.");
            return;
        }
        yz5.p thumbShowCallback = finderVideoLayout.getThumbShowCallback();
        if (thumbShowCallback != null) {
            thumbShowCallback.invoke(java.lang.Boolean.FALSE, finderVideoLayout.getPlayInfo());
        }
        cw2.da videoView2 = finderVideoLayout.getVideoView();
        if (videoView2 != null) {
            videoView2.setAlpha(1.0f);
        }
        thumbView = finderVideoLayout.getThumbView();
        thumbView.setVisibility(8);
        com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "[dismissThumb] " + this.f223847e + ' ' + finderVideoLayout.d0());
    }
}
