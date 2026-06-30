package ko0;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f309872c;

    /* renamed from: d, reason: collision with root package name */
    public static lo0.t f309873d;

    /* renamed from: e, reason: collision with root package name */
    public static lo0.t f309874e;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f309876g;

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.l f309870a = new ko0.l();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f309871b = jz5.h.b(ko0.j.f309865d);

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.d f309875f = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f309877h = jz5.h.b(ko0.k.f309868d);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #0 {all -> 0x00fe, blocks: (B:12:0x002c, B:23:0x00d4, B:26:0x00d9), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ko0.d] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ko0.d r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko0.l.a(ko0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final lo0.t b() {
        lo0.t tVar = f309874e;
        if (tVar != null) {
            return tVar;
        }
        lo0.t tVar2 = lo0.t.f320074i;
        return lo0.t.f320074i;
    }

    public final boolean c() {
        return b().f320078c;
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("LiveBeautyUtil", "#lockDataBucketInstance");
        if (f309874e != null) {
            return;
        }
        java.lang.String str = f309872c;
        if (f309873d == null) {
            if (str != null) {
                try {
                    f309873d = new lo0.t(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("LiveBeautyUtil", "Beauty package parsing failed. " + e17);
                }
            }
        }
        lo0.t tVar = f309873d;
        if (tVar == null) {
            lo0.t tVar2 = lo0.t.f320074i;
            tVar = lo0.t.f320074i;
        }
        tVar.getClass();
        f309874e = new lo0.t(tVar);
    }

    public final void e(java.lang.String resUrl, java.lang.String resMd5) {
        kotlin.jvm.internal.o.g(resUrl, "resUrl");
        kotlin.jvm.internal.o.g(resMd5, "resMd5");
        jz5.g gVar = f309877h;
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putString("res_url", resUrl);
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putString("res_md5", resMd5);
        com.tencent.mars.xlog.Log.i("LiveBeautyUtil", "#updateResUrl resUrl=" + resUrl + " resMd5=" + resMd5);
    }
}
