package vo4;

/* loaded from: classes10.dex */
public final class w implements ph3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vo4.x f438695a;

    public w(vo4.x xVar) {
        this.f438695a = xVar;
    }

    @Override // ph3.d
    public void a(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", this.f438695a.hashCode() + " video size changed size[%d, %d] degrees[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // ph3.d
    public void onCompletion() {
    }

    @Override // ph3.d
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", this.f438695a.hashCode() + " onError what:" + i17 + " error :" + i18);
    }

    @Override // ph3.d
    public void onPrepared() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", this.f438695a.hashCode() + " onPrepared, canPlaying:" + this.f438695a.f438702v + ", notify all");
        this.f438695a.f438703w = true;
        vo4.x xVar = this.f438695a;
        synchronized (xVar.f438700t) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " onPrepared notifyAll");
                xVar.f438700t.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, "prepare lock notify error", new java.lang.Object[0]);
            }
        }
    }

    @Override // ph3.d
    public void onSeekComplete() {
        this.f438695a.hashCode();
        ph3.k kVar = this.f438695a.f438698r;
        if (kVar != null) {
            kVar.m();
        }
        vo4.x xVar = this.f438695a;
        synchronized (xVar.f438701u) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " player seek notifyAll");
                xVar.f438701u.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, xVar.hashCode() + " notify seekLock error", new java.lang.Object[0]);
            }
        }
    }
}
