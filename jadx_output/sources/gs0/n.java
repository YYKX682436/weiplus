package gs0;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.p f275003d;

    public n(gs0.p pVar) {
        this.f275003d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.p pVar = this.f275003d;
        synchronized (pVar.f274979i) {
            if (pVar.f274977g || pVar.f274978h || 0 == pVar.f275007l) {
                com.tencent.mars.xlog.Log.i(pVar.f275005j, "finishEncode() already finish " + pVar.hashCode() + ", isFinishEncode:" + pVar.f274977g + ", isRelease:" + pVar.f274978h + ", startTime:" + pVar.f275007l);
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f275003d.f275005j, "finishEncode() hash:" + this.f275003d.hashCode() + "  isFinishEncode:" + this.f275003d.f274977g + "  startTime:" + this.f275003d.f275007l);
            this.f275003d.f275006k.w();
            this.f275003d.f274977g = true;
        }
    }
}
