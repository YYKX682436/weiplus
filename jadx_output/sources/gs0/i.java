package gs0;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.l f274991d;

    public i(gs0.l lVar) {
        this.f274991d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        gs0.l lVar = this.f274991d;
        synchronized (lVar.f274979i) {
            if (!lVar.f274978h && !lVar.f274977g) {
                gs0.l.g(this.f274991d);
                java.lang.String str = this.f274991d.f274994j;
                android.os.SystemClock.elapsedRealtime();
                this.f274991d.hashCode();
                return;
            }
            com.tencent.mars.xlog.Log.i(lVar.f274994j, "encodeFrame() stop encodeFrame " + lVar.hashCode() + ", isRelease:" + lVar.f274978h + ", isFinishEncode:" + lVar.f274977g);
        }
    }
}
