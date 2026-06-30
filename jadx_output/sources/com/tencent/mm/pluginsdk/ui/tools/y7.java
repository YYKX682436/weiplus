package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class y7 implements android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView f192012a;

    public y7(com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView) {
        this.f192012a = videoSurfaceView;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        int videoWidth = mediaPlayer.getVideoWidth();
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView = this.f192012a;
        videoSurfaceView.f191472i = videoWidth;
        videoSurfaceView.f191473m = mediaPlayer.getVideoHeight();
        int i19 = videoSurfaceView.f191472i;
        int i27 = videoSurfaceView.f191473m;
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView.d(videoSurfaceView);
    }
}
