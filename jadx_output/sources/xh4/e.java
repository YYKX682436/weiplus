package xh4;

/* loaded from: classes14.dex */
public final class e extends x51.i0 {

    /* renamed from: e, reason: collision with root package name */
    public static long f454590e;

    /* renamed from: a, reason: collision with root package name */
    public static final xh4.e f454586a = new xh4.e();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f454587b = "MicroMsg.SysSupportTeenModeReporter";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f454588c = "sys_support_teenmode_daily_check";

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f454589d = com.tencent.mm.sdk.platformtools.o4.M("SysSupportTeenModeReporter");

    /* renamed from: f, reason: collision with root package name */
    public static int f454591f = 20917;

    static {
        long j17 = 60;
        f454590e = 12 * j17 * 1000 * j17;
    }

    @Override // x51.i0
    public java.lang.String getEventId() {
        return f454588c;
    }

    @Override // x51.i0
    public com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        return f454589d;
    }

    @Override // x51.i0
    public long getReportIntervalTimeMs() {
        return f454590e;
    }

    @Override // x51.i0
    public int getRouteRule() {
        return f454591f;
    }

    @Override // x51.i0
    public java.lang.String getTAG() {
        return f454587b;
    }

    @Override // x51.i0
    public void realReport() {
        uh4.c0.getService().T(37);
    }

    @Override // x51.i0
    public void setEventId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f454588c = str;
    }

    @Override // x51.i0
    public void setMmkv(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        f454589d = o4Var;
    }

    @Override // x51.i0
    public void setReportIntervalTimeMs(long j17) {
        f454590e = j17;
    }

    @Override // x51.i0
    public void setRouteRule(int i17) {
        f454591f = i17;
    }

    @Override // x51.i0
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f454587b = str;
    }
}
