package gs0;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.p f275004d;

    public o(gs0.p pVar) {
        this.f275004d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.p pVar = this.f275004d;
        synchronized (pVar.f274979i) {
            if (pVar.f274978h) {
                com.tencent.mars.xlog.Log.i(pVar.f275005j, "releaseEncoder(), already finished " + pVar.hashCode());
                return;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mars.xlog.Log.i(this.f275004d.f275005j, "releaseEncoder() start " + this.f275004d.hashCode());
            yz5.a aVar = this.f275004d.f274974d;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f275004d.f275008m.quitSafely();
            this.f275004d.f275006k.y();
            this.f275004d.f275006k.q();
            this.f275004d.c().release();
            this.f275004d.f274978h = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 166L, 1L, false);
            com.tencent.mars.xlog.Log.i(this.f275004d.f275005j, "releaseEncoder() finish: time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", " + this.f275004d.hashCode());
        }
    }
}
