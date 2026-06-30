package ln0;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319642d;

    public a(ln0.p pVar) {
        this.f319642d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f319642d;
        pVar.f319680i.d();
        com.qcloud.qvb.XNet.destroy();
        gm0.j1.n().d(pVar.f319682k);
        pVar.f319675d.set(true);
        pVar.getClass();
        ln0.p.a(pVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper stopP2pService (real destroy)");
    }
}
