package xh4;

/* loaded from: classes14.dex */
public final class g extends x51.i0 {

    /* renamed from: e, reason: collision with root package name */
    public static long f454602e;

    /* renamed from: a, reason: collision with root package name */
    public static final xh4.g f454598a = new xh4.g();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f454599b = "MicroMsg.TeenModeReporter";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f454600c = "teenmode_enable_daily_check";

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f454601d = com.tencent.mm.sdk.platformtools.o4.M("TeenModeEnableReporter");

    /* renamed from: f, reason: collision with root package name */
    public static int f454603f = 20917;

    static {
        long j17 = 60;
        f454602e = 12 * j17 * 1000 * j17;
    }

    @Override // x51.i0
    public java.lang.String getEventId() {
        return f454600c;
    }

    @Override // x51.i0
    public com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        return f454601d;
    }

    @Override // x51.i0
    public long getReportIntervalTimeMs() {
        return f454602e;
    }

    @Override // x51.i0
    public int getRouteRule() {
        return f454603f;
    }

    @Override // x51.i0
    public java.lang.String getTAG() {
        return f454599b;
    }

    @Override // x51.i0
    public void realReport() {
        uh4.c0.getService().T(33);
    }

    @Override // x51.i0
    public void setEventId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f454600c = str;
    }

    @Override // x51.i0
    public void setMmkv(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        f454601d = o4Var;
    }

    @Override // x51.i0
    public void setReportIntervalTimeMs(long j17) {
        f454602e = j17;
    }

    @Override // x51.i0
    public void setRouteRule(int i17) {
        f454603f = i17;
    }

    @Override // x51.i0
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f454599b = str;
    }
}
