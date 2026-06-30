package q01;

/* loaded from: classes12.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f359355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f359356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f359357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f359358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f359359h;

    public z(boolean z17, long j17, java.lang.Throwable th6, int i17, int i18) {
        this.f359355d = z17;
        this.f359356e = j17;
        this.f359357f = th6;
        this.f359358g = i17;
        this.f359359h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect jam report task - run: jam=" + this.f359355d + ", durationMs=" + java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(this.f359356e) + "min");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("durationMs", java.lang.Long.valueOf(this.f359356e));
        ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).wi(linkedHashMap);
        java.lang.Throwable th6 = this.f359357f;
        java.lang.String[] strArr = new java.lang.String[4];
        boolean z17 = false;
        strArr[0] = "jam";
        strArr[1] = this.f359355d ? "1" : "0";
        strArr[2] = java.lang.String.valueOf(this.f359358g);
        strArr[3] = java.lang.String.valueOf(this.f359359h);
        ap.a.a(10001, "errNetScene", th6, linkedHashMap, strArr);
        jz5.l lVar = q01.e0.f359272c;
        if (lVar != null && ((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect jam restore checking task - post");
            ((ku5.t0) ku5.t0.f312615d).l(q01.y.f359353d, 600000L, "MicroMsg.NetSceneQueueTracker.JammingRestore");
        }
    }
}
