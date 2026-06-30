package g23;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final g23.j f267930a = new g23.j();

    /* renamed from: b, reason: collision with root package name */
    public static long f267931b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f267932c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f267933d = "";

    /* renamed from: e, reason: collision with root package name */
    public static long f267934e;

    public final void a(long j17) {
        f267931b = j17;
        f267932c = kk.v.a(gm0.j1.b().h()) + '_' + java.lang.System.currentTimeMillis();
        f267933d = "";
        f267934e = 0L;
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(f267932c);
        kFContactSessionSearchLogStruct.f58543d = 1L;
        kFContactSessionSearchLogStruct.f58544e = j17;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
    }
}
