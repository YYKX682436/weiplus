package ml2;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f328151a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f328152b;

    /* renamed from: c, reason: collision with root package name */
    public long f328153c;

    /* renamed from: d, reason: collision with root package name */
    public long f328154d;

    /* renamed from: e, reason: collision with root package name */
    public long f328155e;

    public static /* synthetic */ void c(ml2.w wVar, ml2.v vVar, long j17, long j18, int i17, java.lang.Object obj) {
        wVar.b(vVar, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? 0L : j18);
    }

    public final void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onScreenStateChanged - isLiveScreenOff: " + z17 + ", isLivePlaying: " + z18);
        if (z17) {
            if (this.f328151a) {
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onEnterLockScreen - is screen off, skip");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f328151a = true;
            this.f328152b = z18;
            this.f328153c = currentTimeMillis;
            this.f328155e = 0L;
            this.f328154d = z18 ? currentTimeMillis : 0L;
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onEnterLockScreen - screenOffStartTime: " + this.f328153c + ", isPlaying: " + this.f328152b);
            c(this, ml2.v.f328116e, 0L, 0L, 6, null);
            return;
        }
        if (!this.f328151a) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onExitLockScreen - is not screen off, skip");
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        long j17 = this.f328153c;
        long j18 = j17 > 0 ? currentTimeMillis2 - j17 : 0L;
        if (this.f328152b) {
            long j19 = this.f328154d;
            if (j19 > 0) {
                this.f328155e += currentTimeMillis2 - j19;
            }
        }
        long j27 = this.f328155e;
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onExitLockScreen - stayTime: " + j18 + "ms, watchTime: " + j27 + "ms");
        b(ml2.v.f328117f, j18, j27);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "resetState");
        this.f328151a = false;
        this.f328153c = 0L;
        this.f328154d = 0L;
        this.f328155e = 0L;
    }

    public final void b(ml2.v vVar, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report - type: ");
        sb6.append(vVar.name());
        sb6.append('(');
        int i17 = vVar.f328121d;
        sb6.append(i17);
        sb6.append("), stayTime: ");
        sb6.append(j17);
        sb6.append("ms, watchTime: ");
        sb6.append(j18);
        sb6.append("ms");
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", sb6.toString());
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.Z2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("stay_time", j17);
        jSONObject.put("watch_time", j18);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
