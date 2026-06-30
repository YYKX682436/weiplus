package gz0;

/* loaded from: classes13.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayer f277654d;

    public c(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f277654d = iTPPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f277654d;
        if (iTPPlayer != null) {
            try {
                iTPPlayer.stopAsync();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MusicPlayer", e17, "onError release player error", new java.lang.Object[0]);
                return;
            }
        }
        if (iTPPlayer != null) {
            iTPPlayer.release();
        }
    }
}
