package kl3;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl3.q f308838d;

    public p(kl3.q qVar) {
        this.f308838d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kl3.q qVar = this.f308838d;
        boolean g17 = qVar.a().g();
        boolean i17 = qVar.a().i();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayRunnable, isStartPlayMusic:%b, isPlayingMusic:%b", java.lang.Boolean.valueOf(g17), java.lang.Boolean.valueOf(i17));
        if (!g17 || i17) {
            return;
        }
        qVar.a().stopPlay();
    }
}
