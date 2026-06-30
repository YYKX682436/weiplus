package dl3;

/* loaded from: classes13.dex */
public class a0 implements com.tencent.qqmusic.mediaplayer.PlayerListenerCallback {

    /* renamed from: d, reason: collision with root package name */
    public n01.b f235272d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.d0 f235273e;

    public a0(dl3.d0 d0Var) {
        this.f235273e = d0Var;
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onBufferingUpdate(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onCompletion(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onCompletion");
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onError(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17, int i18, int i19) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        dl3.d0 d0Var = this.f235273e;
        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "onError what:%d, extra:%d, errCode:%d, audioId:%s", valueOf, valueOf2, valueOf3, d0Var.f235280c);
        if (this.f235272d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "onError, currentParam is null");
            return;
        }
        boolean isNetworkConnected = com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (i18 == 80 && isNetworkConnected) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "connect success, but download is fail!");
        }
        int i27 = d0Var.f235290m;
        if (i27 >= 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "errorCount %d", java.lang.Integer.valueOf(i27));
            return;
        }
        d0Var.f235284g = false;
        d0Var.f235290m = i27 + 1;
        d0Var.f235291n = i18;
        d0Var.f235299v = java.lang.System.currentTimeMillis();
        d0Var.t(i18);
        if (d0Var.f235280c.equalsIgnoreCase(this.f235272d.f333836a)) {
            d0Var.stopPlay();
            com.tencent.mm.sdk.platformtools.u3.h(new dl3.y(this));
        }
        d0Var.l(i18);
        dl3.c0 c0Var = d0Var.f235287j;
        if (c0Var != null) {
            c0Var.f235278d = true;
            d0Var.f235287j = null;
        }
        if (i17 == 91 && i18 == 55) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "unknow format ,delete file");
            java.lang.String str = d0Var.f235289l;
            com.tencent.mm.sdk.platformtools.r2 r2Var = gl3.h.f272831a;
            com.tencent.qqmusic.mediaplayer.util.Logger.i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
            gl3.i.a(xl3.c.d(str));
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onPrepared(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onPrepared");
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onSeekComplete(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        this.f235273e.f235297t.post(new dl3.x(this, i17));
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStarted(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStarted");
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStateChanged(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        this.f235273e.f235297t.post(new dl3.z(this, i17));
    }
}
