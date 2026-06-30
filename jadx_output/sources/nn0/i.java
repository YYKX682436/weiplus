package nn0;

/* loaded from: classes10.dex */
public abstract class i extends com.tencent.rtmp.TXLivePlayer {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f338583a;

    /* renamed from: b, reason: collision with root package name */
    public final nn0.o f338584b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f338585c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f338586d;

    public i(android.content.Context context, boolean z17, int i17) {
        super(context);
        this.f338583a = false;
        this.f338584b = null;
        this.f338585c = false;
        this.f338586d = false;
        this.f338583a = z17;
        if (z17) {
            nn0.o a17 = a(context);
            this.f338584b = a17;
            a17.n7(i17);
            a17.d1(true);
        }
    }

    public abstract nn0.o a(android.content.Context context);

    public void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseRender: mUseTXLivePlayerCustomRender=");
        boolean z17 = this.f338583a;
        sb6.append(z17);
        sb6.append(", mCustomRender=");
        nn0.o oVar = this.f338584b;
        sb6.append(oVar);
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", sb6.toString());
        this.f338586d = true;
        if (!z17 || oVar == null) {
            return;
        }
        super.setVideoRenderListener(null, null);
    }

    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeRender: mUseTXLivePlayerCustomRender=");
        boolean z17 = this.f338583a;
        sb6.append(z17);
        sb6.append(", mCustomRender=");
        nn0.o oVar = this.f338584b;
        sb6.append(oVar);
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", sb6.toString());
        this.f338586d = false;
        if (!z17 || oVar == null || this.f338585c) {
            return;
        }
        super.setVideoRenderListener((com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener) oVar, null);
    }

    public void d(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, nn0.c0 c0Var) {
        nn0.o oVar;
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", "setPlayerView with function");
        if (!this.f338583a || (oVar = this.f338584b) == null) {
            super.setPlayerView(tXCloudVideoView);
        } else {
            oVar.j4(tXCloudVideoView, c0Var);
        }
    }

    public int e(boolean z17, boolean z18) {
        nn0.o oVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlay: clearLastFrame=");
        sb6.append(z17 ? "true" : "false");
        sb6.append(", onlyPause=");
        sb6.append(z18 ? "true" : "false");
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", sb6.toString());
        if (this.f338583a && (oVar = this.f338584b) != null) {
            if (z18) {
                oVar.f(z17);
            } else {
                oVar.stopPlay(z17);
            }
        }
        return super.stopPlay(z17);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public void pause() {
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", "pause");
        this.f338585c = true;
        super.pause();
        if (!this.f338583a || this.f338584b == null) {
            return;
        }
        super.setVideoRenderListener(null, null);
        super.setAudioRawDataListener(null);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public void resume() {
        nn0.o oVar;
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", "resume");
        this.f338585c = false;
        super.resume();
        if (!this.f338583a || (oVar = this.f338584b) == null) {
            return;
        }
        if (!this.f338586d) {
            super.setVideoRenderListener((com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener) oVar, null);
        }
        super.setAudioRawDataListener((com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener) oVar);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        nn0.o oVar;
        if (this.f338583a && (oVar = this.f338584b) != null) {
            oVar.setPlayListener(iTXLivePlayListener);
        }
        super.setPlayListener(iTXLivePlayListener);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public void setPlayerView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        nn0.o oVar;
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", "setPlayerView");
        if (!this.f338583a || (oVar = this.f338584b) == null) {
            super.setPlayerView(tXCloudVideoView);
        } else {
            oVar.j4(tXCloudVideoView, null);
        }
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public void setRenderMode(int i17) {
        nn0.o oVar;
        if (this.f338583a && (oVar = this.f338584b) != null) {
            oVar.setRenderMode(i17);
        }
        super.setRenderMode(i17);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public void setRenderRotation(int i17) {
        nn0.o oVar;
        if (this.f338583a && (oVar = this.f338584b) != null) {
            oVar.setRenderRotation(i17);
        }
        super.setRenderRotation(i17);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public int startLivePlay(java.lang.String str, int i17) {
        nn0.o oVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = this.f338585c ? "true" : "false";
        objArr[3] = this.f338586d ? "true" : "false";
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", "startLivePlay: url=%s, playType=%d, isPaused=%s, isPauseRender=%s", objArr);
        if (this.f338585c || this.f338586d) {
            this.f338585c = false;
            this.f338586d = false;
            if (this.f338583a && (oVar = this.f338584b) != null) {
                super.setVideoRenderListener((com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener) oVar, null);
                super.setAudioRawDataListener((com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener) oVar);
            }
        }
        return super.startLivePlay(str, i17);
    }

    @Override // com.tencent.rtmp.TXLivePlayer
    public int stopPlay(boolean z17) {
        com.tencent.mars.xlog.Log.i("CustomRender.CustomTXLivePlayer", "stopPlay");
        return e(z17, false);
    }
}
