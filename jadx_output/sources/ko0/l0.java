package ko0;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f309882e;

    /* renamed from: f, reason: collision with root package name */
    public static lo0.p0 f309883f;

    /* renamed from: g, reason: collision with root package name */
    public static lo0.p0 f309884g;

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.l0 f309878a = new ko0.l0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f309879b = lp0.b.h() + "live/makeup";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f309880c = lp0.b.h() + "live/makeup_v_001";

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.d f309881d = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f309885h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f309886i = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:23:0x00ad, B:26:0x00b2), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ko0.e0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v32, types: [lo0.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ko0.e0 r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko0.l0.a(ko0.e0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final lo0.p0 b() {
        lo0.p0 p0Var = f309884g;
        if (p0Var != null) {
            return p0Var;
        }
        lo0.p0 p0Var2 = lo0.p0.f320057e;
        return lo0.p0.f320057e;
    }

    public final void c(boolean z17) {
        lo0.p0 p0Var;
        if (z17) {
            p0Var = f309883f;
            if (p0Var == null) {
                lo0.p0 p0Var2 = lo0.p0.f320057e;
                p0Var = lo0.p0.f320057e;
            }
        } else {
            lo0.p0 p0Var3 = lo0.p0.f320057e;
            p0Var = lo0.p0.f320057e;
        }
        p0Var.getClass();
        f309884g = new lo0.p0(p0Var);
    }

    public final void d(java.lang.String resUrl, java.lang.String resMd5) {
        kotlin.jvm.internal.o.g(resUrl, "resUrl");
        kotlin.jvm.internal.o.g(resMd5, "resMd5");
        f309885h = resUrl;
        f309886i = resMd5;
        com.tencent.mars.xlog.Log.i("LiveMakeupUtil", "#updateResUrl resUrl=" + resUrl + " resMd5=" + resMd5);
    }
}
