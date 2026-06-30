package i81;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final i81.z f289516c = new i81.z(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f289517d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f289518e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final i81.e f289519a = new i81.e();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct f289520b;

    public a0(kotlin.jvm.internal.i iVar) {
    }

    public static final i81.e a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        i81.z zVar = f289516c;
        if (appBrandRuntime == null) {
            return null;
        }
        return zVar.a(appBrandRuntime).f289519a;
    }

    public static final i81.e b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        i81.z zVar = f289516c;
        if ((str == null || str.length() == 0) || (appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) f289518e.get(str)) == null) {
            return null;
        }
        return zVar.a(appBrandRuntime).f289519a;
    }

    public static final com.tencent.mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        i81.a0 a0Var = (i81.a0) f289517d.get(runtime);
        if (a0Var != null) {
            return a0Var.f289520b;
        }
        return null;
    }
}
