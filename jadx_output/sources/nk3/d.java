package nk3;

/* loaded from: classes8.dex */
public final class d extends x51.i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final nk3.d f338030a = new nk3.d();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Map f338031b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f338032c = "MicroMsg.MultiTaskDailyReporter";

    /* renamed from: d, reason: collision with root package name */
    public static int f338033d = 34575;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f338034e = "MultiTaskEntranceExpose";

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f338035f;

    /* renamed from: g, reason: collision with root package name */
    public static long f338036g;

    static {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("multitask_report_storage");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        f338035f = M;
        long j17 = 60;
        f338036g = 6 * j17 * 1000 * j17;
    }

    @Override // x51.i0
    public java.lang.String getEventId() {
        return f338034e;
    }

    @Override // x51.i0
    public com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        return f338035f;
    }

    @Override // x51.i0
    public long getReportIntervalTimeMs() {
        return f338036g;
    }

    @Override // x51.i0
    public int getRouteRule() {
        return f338033d;
    }

    @Override // x51.i0
    public java.lang.String getTAG() {
        return f338032c;
    }

    @Override // x51.i0
    public void realReport() {
        com.tencent.mars.xlog.Log.i(f338032c, "realReport");
        pm0.v.O("MultiTask_Thread", new nk3.c(f338031b));
    }

    @Override // x51.i0
    public void setEventId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f338034e = str;
    }

    @Override // x51.i0
    public void setMmkv(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        kotlin.jvm.internal.o.g(o4Var, "<set-?>");
        f338035f = o4Var;
    }

    @Override // x51.i0
    public void setReportIntervalTimeMs(long j17) {
        f338036g = j17;
    }

    @Override // x51.i0
    public void setRouteRule(int i17) {
        f338033d = i17;
    }

    @Override // x51.i0
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f338032c = str;
    }
}
