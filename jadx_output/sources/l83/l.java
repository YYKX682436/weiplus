package l83;

/* loaded from: classes12.dex */
public class l implements com.tencent.mm.sdk.platformtools.q7 {

    /* renamed from: f, reason: collision with root package name */
    public long f317115f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317116g = false;

    /* renamed from: h, reason: collision with root package name */
    public l83.k f317117h = null;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.SensorController f317113d = new com.tencent.mm.sdk.platformtools.SensorController(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.s7 f317114e = new com.tencent.mm.sdk.platformtools.s7(com.tencent.mm.sdk.platformtools.x2.f193071a);

    @Override // com.tencent.mm.sdk.platformtools.q7
    public void f1(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSensorEvent, isON:");
        sb6.append(z17);
        sb6.append("  hasSkip:");
        sb6.append(this.f317116g);
        sb6.append(" tick:");
        long j17 = this.f317115f;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        sb6.append("  lt:");
        sb6.append(this.f317115f);
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSensorManager", sb6.toString());
        if (this.f317116g) {
            this.f317116g = !z17;
            return;
        }
        if (!z17) {
            long j18 = this.f317115f;
            if (j18 != -1 && android.os.SystemClock.elapsedRealtime() - j18 > 400) {
                this.f317116g = true;
                return;
            }
        }
        this.f317116g = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSensorManager", "onSensorEvent, isNeedOffScreen: %b", java.lang.Boolean.valueOf(z17));
        new com.tencent.mm.sdk.platformtools.b4(new l83.j(this, z17), false).c(50L, 50L);
    }
}
