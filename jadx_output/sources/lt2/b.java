package lt2;

/* loaded from: classes10.dex */
public final class b implements c50.a1 {
    public void a(android.widget.FrameLayout videoContainer, boolean z17) {
        kotlin.jvm.internal.o.g(videoContainer, "videoContainer");
        android.view.View childAt = videoContainer.getChildAt(0);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = childAt instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) childAt : null;
        if (finderThumbPlayerProxy == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoPlayHelper", "playOrPause mediaId:" + finderThumbPlayerProxy.getVideoMediaId() + ", play:" + z17);
        if (z17) {
            finderThumbPlayerProxy.setVideoViewFocused(true);
            zy2.g5.u(finderThumbPlayerProxy, null, 1, null);
        } else {
            finderThumbPlayerProxy.setVideoViewFocused(false);
            finderThumbPlayerProxy.pause();
        }
    }
}
