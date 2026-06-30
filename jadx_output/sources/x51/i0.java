package x51;

/* loaded from: classes8.dex */
public abstract class i0 {
    private long ReportIntervalTimeMs;
    private long lastTryTime;
    private long TryIntervalTimeMs = 5 * 1000;
    private final java.lang.String MMKVKey_LastReportTimeMs = "MMKVKey_LastReportTimeMs";

    public i0() {
        long j17 = 60;
        this.ReportIntervalTimeMs = 23 * j17 * 1000 * j17;
    }

    public abstract java.lang.String getEventId();

    public abstract com.tencent.mm.sdk.platformtools.o4 getMmkv();

    public long getReportIntervalTimeMs() {
        return this.ReportIntervalTimeMs;
    }

    public abstract int getRouteRule();

    public abstract java.lang.String getTAG();

    public long getTryIntervalTimeMs() {
        return this.TryIntervalTimeMs;
    }

    public final boolean isFreezeNow() {
        long c17 = c01.id.c();
        if (c17 - this.lastTryTime < getTryIntervalTimeMs()) {
            return true;
        }
        return c17 - getMmkv().getLong(this.MMKVKey_LastReportTimeMs, 0L) <= getReportIntervalTimeMs() && !com.tencent.mm.sdk.platformtools.s9.f192975c;
    }

    public java.util.Map<java.lang.String, ?> onReportParams() {
        return kz5.q0.f314001d;
    }

    public abstract void realReport();

    public abstract void setEventId(java.lang.String str);

    public abstract void setMmkv(com.tencent.mm.sdk.platformtools.o4 o4Var);

    public void setReportIntervalTimeMs(long j17) {
        this.ReportIntervalTimeMs = j17;
    }

    public abstract void setRouteRule(int i17);

    public abstract void setTAG(java.lang.String str);

    public void setTryIntervalTimeMs(long j17) {
        this.TryIntervalTimeMs = j17;
    }

    public final void tryReport() {
        long c17 = c01.id.c();
        if (c17 - this.lastTryTime < getTryIntervalTimeMs()) {
            return;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "tryReportFakeInfo");
        this.lastTryTime = c17;
        if (c17 - getMmkv().getLong(this.MMKVKey_LastReportTimeMs, 0L) > getReportIntervalTimeMs() || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            realReport();
            getMmkv().putLong(this.MMKVKey_LastReportTimeMs, c17);
        }
    }
}
