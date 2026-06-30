package xh4;

/* loaded from: classes14.dex */
public final class f extends x51.i0 {

    /* renamed from: e, reason: collision with root package name */
    public static long f454596e;

    /* renamed from: a, reason: collision with root package name */
    public static final xh4.f f454592a = new xh4.f();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f454593b = "MicroMsg.SysTeenModeEnableReporter";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f454594c = "sys_teenmode_enable_daily_check";

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f454595d = com.tencent.mm.sdk.platformtools.o4.M("SysTeenModeEnableReporter");

    /* renamed from: f, reason: collision with root package name */
    public static int f454597f = 20917;

    static {
        long j17 = 60;
        f454596e = 12 * j17 * 1000 * j17;
    }

    @Override // x51.i0
    public java.lang.String getEventId() {
        return f454594c;
    }

    @Override // x51.i0
    public com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        return f454595d;
    }

    @Override // x51.i0
    public long getReportIntervalTimeMs() {
        return f454596e;
    }

    @Override // x51.i0
    public int getRouteRule() {
        return f454597f;
    }

    @Override // x51.i0
    public java.lang.String getTAG() {
        return f454593b;
    }

    @Override // x51.i0
    public void realReport() {
        uh4.c0.getService().T(34);
    }

    @Override // x51.i0
    public void setEventId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f454594c = str;
    }

    @Override // x51.i0
    public void setMmkv(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        f454595d = o4Var;
    }

    @Override // x51.i0
    public void setReportIntervalTimeMs(long j17) {
        f454596e = j17;
    }

    @Override // x51.i0
    public void setRouteRule(int i17) {
        f454597f = i17;
    }

    @Override // x51.i0
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f454593b = str;
    }
}
