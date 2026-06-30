package gz0;

/* loaded from: classes13.dex */
public final class d implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener, com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {
    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "onCompletion");
        ((ku5.t0) ku5.t0.f312615d).g(new gz0.b(iTPPlayer));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "onError errType:" + i17 + " errorCode:" + i18 + ", arg:" + j17 + ' ' + j18);
        ((ku5.t0) ku5.t0.f312615d).g(new gz0.c(iTPPlayer));
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "onInfo, what:" + i17 + ' ' + j17 + ' ' + j18 + ' ' + obj);
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "onPrepared");
        if (iTPPlayer != null) {
            iTPPlayer.start();
        }
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayer", "onStateChange " + i17 + ' ' + i18);
    }
}
