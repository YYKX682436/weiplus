package vz3;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f441676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f441677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz3.q f441678f;

    public e(int i17, long j17, vz3.q qVar) {
        this.f441676d = i17;
        this.f441677e = j17;
        this.f441678f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInitFFE callback2 ret: ");
        sb6.append(this.f441676d);
        sb6.append(", init cost: ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f441677e);
        sb6.append(", tryStartSessionWhenInited: ");
        vz3.q qVar = this.f441678f;
        sb6.append(qVar.f441701f);
        sb6.append(", sessionId: ");
        sb6.append(qVar.f441703h);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", sb6.toString());
        qVar.f441699d = vz3.b.f441671f;
        if (qVar.f441701f) {
            long j17 = qVar.f441703h;
            if (j17 > 0) {
                qVar.g(j17);
            }
        }
    }
}
