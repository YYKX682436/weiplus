package wq4;

/* loaded from: classes14.dex */
public class e0 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f448628a;

    public e0(wq4.k0 k0Var) {
        this.f448628a = k0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        this.f448628a.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.RingPlayer", "RingPlayer startPlayCustomRing MediaPlayer onError, what: " + i17 + ":extra:" + i18);
        return false;
    }
}
