package sf2;

/* loaded from: classes10.dex */
public final class i0 implements com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf2.j0 f407165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f407167c;

    public i0(sf2.j0 j0Var, java.lang.String str, boolean z17) {
        this.f407165a = j0Var;
        this.f407166b = str;
        this.f407167c = z17;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLiveBaseSongAuditionHelper", "[" + this.f407165a.f407174a + "] audition onComplete");
        sf2.j0.l(this.f407165a, this.f407166b, this.f407167c, false, 4, null);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i17, long j17, long j18) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sf2.j0 j0Var = this.f407165a;
        sb6.append(j0Var.f407174a);
        sb6.append("] audition onStart: errCode=");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("FinderLiveBaseSongAuditionHelper", sb6.toString());
        if (i18 == 0) {
            j0Var.b();
            return;
        }
        android.content.Context e17 = j0Var.e();
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(e17);
        e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.or8);
        e4Var.c();
    }
}
