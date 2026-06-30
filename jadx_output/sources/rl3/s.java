package rl3;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f397275d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.t f397276e;

    public s(rl3.t tVar, rl3.r rVar) {
        this.f397276e = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rl3.t tVar = this.f397276e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "start run play progress task");
        while (!this.f397275d) {
            try {
                if (tVar.f397278l != null && tVar.i() && !tVar.D() && tVar.A(tVar.f397277k) && tVar.f397278l != null && tVar.i()) {
                    int currentPosition = (int) tVar.f397278l.getCurrentPosition();
                    int duration = tVar.f397278l.getDuration();
                    if (currentPosition > 0 && duration > 0) {
                        java.util.Iterator it = tVar.f397235j.iterator();
                        while (it.hasNext()) {
                            ((com.tencent.mm.plugin.music.player.base.k) it.next()).a(currentPosition, duration);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "PlayProgressTask run exception:" + e17.getMessage());
            }
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
