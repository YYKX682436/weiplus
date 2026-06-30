package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class m8 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191778d;

    public m8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191778d = videoTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        int i19 = com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.R;
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191778d;
        videoTextureView.getClass();
        videoTextureView.C();
        android.view.Surface surface = videoTextureView.f191485m;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.d8(videoTextureView, surface));
        videoTextureView.f191485m = new android.view.Surface(surfaceTexture);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", java.lang.Integer.valueOf(videoTextureView.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(videoTextureView.f191487o), java.lang.Integer.valueOf(videoTextureView.f191485m.hashCode()));
        android.media.MediaPlayer mediaPlayer = videoTextureView.f191486n;
        if (mediaPlayer == null || !videoTextureView.f191487o) {
            videoTextureView.G();
        } else {
            mediaPlayer.setSurface(videoTextureView.f191485m);
            if (videoTextureView.f191482J) {
                videoTextureView.f191486n.start();
            } else {
                videoTextureView.K = true;
                videoTextureView.f191486n.setVolume(0.0f, 0.0f);
                videoTextureView.f191486n.start();
            }
            videoTextureView.f191482J = false;
        }
        com.tencent.mm.pluginsdk.ui.tools.d4 d4Var = videoTextureView.f191495w;
        if (d4Var != null) {
            d4Var.onSurfaceAvailable();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191778d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d on texture destroyed mIsPrepared[%b]", java.lang.Integer.valueOf(videoTextureView.hashCode()), java.lang.Boolean.valueOf(videoTextureView.f191487o));
        android.view.Surface surface = videoTextureView.f191485m;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.tools.d8(videoTextureView, surface));
        videoTextureView.f191485m = null;
        if (videoTextureView.f191486n == null || !videoTextureView.f191487o) {
            videoTextureView.H();
            videoTextureView.f191482J = false;
        } else if (videoTextureView.isPlaying()) {
            videoTextureView.f191482J = true;
            videoTextureView.f191486n.pause();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "on texture size changed width : " + i17 + " height : " + i18);
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191778d;
        android.media.MediaPlayer mediaPlayer = videoTextureView.f191486n;
        if (mediaPlayer != null && videoTextureView.f191487o && videoTextureView.f191488p == i17 && videoTextureView.f191489q == i18) {
            mediaPlayer.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.pluginsdk.ui.tools.e4 e4Var;
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191778d;
        if (videoTextureView.K) {
            android.media.MediaPlayer mediaPlayer = videoTextureView.f191486n;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
                if (videoTextureView.N) {
                    videoTextureView.f191486n.setVolume(0.0f, 0.0f);
                } else {
                    videoTextureView.f191486n.setVolume(1.0f, 1.0f);
                }
            }
            videoTextureView.K = false;
        }
        if (videoTextureView.I > 0 && (e4Var = videoTextureView.f191492t) != null) {
            e4Var.v();
            videoTextureView.f191492t = null;
        }
        videoTextureView.I = java.lang.System.currentTimeMillis();
        if (videoTextureView.L) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d flush surface pause now time[%d]", java.lang.Integer.valueOf(videoTextureView.hashCode()), java.lang.Integer.valueOf(videoTextureView.getCurrentPosition()));
            android.media.MediaPlayer mediaPlayer2 = videoTextureView.f191486n;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
                videoTextureView.setMute(videoTextureView.N);
            }
            videoTextureView.L = false;
        }
    }
}
