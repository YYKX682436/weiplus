package ln0;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319667d;

    public n(ln0.p pVar) {
        this.f319667d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f319667d;
        ln0.p.a(pVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper cancel delayed stop due to new stream");
        pVar.f319681j.d();
        pVar.f319679h.set(false);
    }
}
