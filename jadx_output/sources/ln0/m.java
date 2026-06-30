package ln0;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319666d;

    public m(ln0.p pVar) {
        this.f319666d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f319666d;
        if (pVar.f319679h.compareAndSet(false, true)) {
            pVar.f319681j.c(30000L, 30000L);
            ln0.p.a(pVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper scheduled delayed P2P SDK destroy");
        }
    }
}
