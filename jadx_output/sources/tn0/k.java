package tn0;

/* loaded from: classes3.dex */
public final class k implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver f420713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420714b;

    public k(com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver, tn0.w0 w0Var) {
        this.f420713a = tXMusicPlayObserver;
        this.f420714b = w0Var;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio onComplete " + i17 + ", " + i18);
        com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f420713a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.onComplete(i17, i18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
        com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f420713a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.onPlayProgress(i17, j17, j18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio onStart " + i17 + ", " + i18);
        this.f420714b.N = i18 == 0;
        com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver = this.f420713a;
        if (tXMusicPlayObserver != null) {
            tXMusicPlayObserver.onStart(i17, i18);
        }
    }
}
