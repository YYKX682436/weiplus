package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class c8 implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView f191547d;

    public c8(com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView) {
        this.f191547d = videoSurfaceView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSurfaceView", "on surface changed %d*%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView = this.f191547d;
        android.media.MediaPlayer mediaPlayer = videoSurfaceView.f191470g;
        if (mediaPlayer != null && videoSurfaceView.f191471h && videoSurfaceView.f191472i == i18 && videoSurfaceView.f191473m == i19) {
            mediaPlayer.start();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSurfaceView", "on surface created");
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView = this.f191547d;
        videoSurfaceView.f191469f = surfaceHolder;
        videoSurfaceView.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSurfaceView", "on surface destroyed");
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView = this.f191547d;
        videoSurfaceView.f191469f = null;
        android.media.MediaPlayer mediaPlayer = videoSurfaceView.f191470g;
        if (mediaPlayer != null) {
            videoSurfaceView.f191475o.q(mediaPlayer.getCurrentPosition(), videoSurfaceView.f191470g.getDuration());
            videoSurfaceView.f191470g.reset();
            videoSurfaceView.f191470g.release();
            videoSurfaceView.f191470g = null;
        }
    }
}
