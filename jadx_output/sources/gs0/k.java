package gs0;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.l f274993d;

    public k(gs0.l lVar) {
        this.f274993d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs0.l lVar = this.f274993d;
        synchronized (lVar.f274979i) {
            if (lVar.f274978h) {
                com.tencent.mars.xlog.Log.i(lVar.f274994j, "releaseEncoder(), already finished " + lVar.hashCode());
                return;
            }
            try {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i(this.f274993d.f274994j, "releaseEncoder() start " + this.f274993d.hashCode());
                yz5.a aVar = this.f274993d.f274974d;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f274993d.f274999o.removeCallbacksAndMessages(null);
                this.f274993d.f274998n.quitSafely();
                this.f274993d.f274995k.y();
                this.f274993d.f274995k.q();
                this.f274993d.c().release();
                this.f274993d.f274978h = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 164L, 1L, false);
                com.tencent.mars.xlog.Log.i(this.f274993d.f274994j, "releaseEncoder() finish: time:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", " + this.f274993d.hashCode());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f274993d.f274994j, "release encoder error " + this.f274993d.hashCode() + " \n " + e17.getMessage());
            }
        }
    }
}
