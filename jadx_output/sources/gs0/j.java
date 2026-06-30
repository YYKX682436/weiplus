package gs0;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.l f274992d;

    public j(gs0.l lVar) {
        this.f274992d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.l lVar = this.f274992d;
        synchronized (lVar.f274979i) {
            if (lVar.f274977g || lVar.f274978h || 0 == lVar.f275000p) {
                com.tencent.mars.xlog.Log.i(lVar.f274994j, "finishEncode() already finish " + lVar.hashCode() + ", isFinishEncode:" + lVar.f274977g + ", isRelease:" + lVar.f274978h + ", startTime:" + lVar.f275000p);
                return;
            }
            try {
                com.tencent.mars.xlog.Log.i(this.f274992d.f274994j, "finishEncode() hash:" + this.f274992d.hashCode() + "  isFinishEncode:" + this.f274992d.f274977g + "  startTime:" + this.f274992d.f275000p);
                this.f274992d.f274995k.w();
                this.f274992d.f274977g = true;
                gs0.l.g(this.f274992d);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f274992d.f274994j, e17, "finishEncode " + this.f274992d.hashCode() + " \n signalEndOfInputStream error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        }
    }
}
