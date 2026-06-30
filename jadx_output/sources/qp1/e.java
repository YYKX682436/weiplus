package qp1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365717d;

    public e(long j17) {
        this.f365717d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qp1.d dVar = qp1.i.f365725a;
        boolean z17 = false;
        if (dVar != null && dVar.f365714a == this.f365717d) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseHelper", "checkAutoCollapseInner autoCollapseTask done.");
            qp1.i.f365725a = null;
        }
    }
}
