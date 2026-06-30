package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class z7 implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView f192024a;

    public z7(com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView) {
        this.f192024a = videoSurfaceView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView = this.f192024a;
        videoSurfaceView.f191471h = true;
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoSurfaceView.f191475o;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
        videoSurfaceView.f191472i = mediaPlayer.getVideoWidth();
        videoSurfaceView.f191473m = mediaPlayer.getVideoHeight();
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView.d(videoSurfaceView);
        if (videoSurfaceView.f191472i == 0 || videoSurfaceView.f191473m == 0) {
            if (videoSurfaceView.f191474n) {
                videoSurfaceView.f191470g.start();
                videoSurfaceView.f191474n = false;
                return;
            }
            return;
        }
        if (videoSurfaceView.f191474n) {
            videoSurfaceView.f191470g.start();
            videoSurfaceView.f191474n = false;
        }
    }
}
