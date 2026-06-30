package ym5;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.h f463458d;

    public p(ym5.h hVar) {
        this.f463458d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        l45.n nVar = (l45.n) this.f463458d.getPresenter();
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow]");
        if (nVar.f316482w) {
            return;
        }
        nVar.f316482w = true;
        java.util.Iterator it = nVar.f316463d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            if (com.tencent.mm.cache.ArtistCacheManager.a().d(bVar.m())) {
                bVar.t();
                bVar.E(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", bVar.m());
            }
        }
        if (nVar.f316460a.getBaseBoardView().f()) {
            nVar.f316460a.getBaseBoardView().a();
            nVar.f316460a.getBaseBoardView().invalidate();
        }
    }
}
