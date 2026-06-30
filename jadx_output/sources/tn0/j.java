package tn0;

/* loaded from: classes3.dex */
public final class j implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver f420684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420685b;

    public j(com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver, tn0.w0 w0Var) {
        this.f420684a = tXMusicPlayObserver;
        this.f420685b = w0Var;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playBgMusic onComplete " + i17 + ", " + i18);
        com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f420684a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.onComplete(i17, i18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
        com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f420684a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.onPlayProgress(i17, j17, j18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playBgMusic onStart " + i17 + ", " + i18);
        this.f420685b.N = i18 == 0;
        com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f420684a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.onStart(i17, i18);
        }
    }
}
