package mf4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final mf4.b f326142a = new mf4.b();

    /* renamed from: b, reason: collision with root package name */
    public static long f326143b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f326144c;

    /* renamed from: d, reason: collision with root package name */
    public static long f326145d;

    /* renamed from: e, reason: collision with root package name */
    public static int f326146e;

    /* renamed from: f, reason: collision with root package name */
    public static int f326147f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f326148g;

    static {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.HashMap());
        kotlin.jvm.internal.o.f(synchronizedMap, "synchronizedMap(...)");
        f326144c = synchronizedMap;
    }

    public final boolean a() {
        return f326145d > 0;
    }

    public final void b(long j17, long j18, long j19) {
        if (j17 < 0) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, j18, j19);
    }
}
