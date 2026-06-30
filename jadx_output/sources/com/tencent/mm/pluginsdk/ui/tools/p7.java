package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class p7 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView f191838d;

    public p7(com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView) {
        this.f191838d = videoPlayerTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f191838d.F(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f191838d;
        com.tencent.mars.xlog.Log.i(videoPlayerTextureView.f191448h, "onSurfaceTextureDestroyed %d surface[%d] destroyed ", java.lang.Integer.valueOf(videoPlayerTextureView.hashCode()), java.lang.Integer.valueOf(surfaceTexture.hashCode()));
        videoPlayerTextureView.I(videoPlayerTextureView.f191457t);
        videoPlayerTextureView.f191457t = null;
        videoPlayerTextureView.D = false;
        videoPlayerTextureView.E = false;
        if (videoPlayerTextureView.f191450m == null) {
            videoPlayerTextureView.D = false;
        } else if (videoPlayerTextureView.isPlaying()) {
            videoPlayerTextureView.D = true;
            videoPlayerTextureView.f191450m.pause();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f191838d;
        java.lang.String str = videoPlayerTextureView.f191448h;
        surfaceTexture.hashCode();
        videoPlayerTextureView.J();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f191838d.G(surfaceTexture);
    }
}
