package d85;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static long f227156e;

    /* renamed from: a, reason: collision with root package name */
    public static final d85.f f227152a = new d85.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f227153b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f227154c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f227155d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f227157f = jz5.h.b(d85.e.f227148d);

    public static final void a(d85.f fVar, int i17, int i18, java.lang.String str) {
        fVar.getClass();
        com.tencent.mm.autogen.events.CameraKitOperateEvent cameraKitOperateEvent = new com.tencent.mm.autogen.events.CameraKitOperateEvent();
        am.o1 o1Var = cameraKitOperateEvent.f54024g;
        o1Var.f7502a = i17;
        o1Var.f7503b = i18;
        o1Var.f7504c = str;
        com.tencent.mars.xlog.Log.i("CameraHooker", "publish event type:" + i17 + " event:" + cameraKitOperateEvent + " scene:" + str);
        cameraKitOperateEvent.e();
    }

    public static final void b(d85.f fVar, java.lang.String str, java.lang.Throwable th6, java.lang.String... strArr) {
        fVar.getClass();
        fVar.c(str, th6, new java.util.LinkedHashMap(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(java.lang.String str, java.lang.Throwable th6, java.util.Map map, java.lang.String... strArr) {
        if (((java.lang.Boolean) ((jz5.n) f227157f).getValue()).booleanValue()) {
            if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192975c) {
                th6 = null;
            }
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            java.lang.String a17 = ap.d.a();
            java.lang.String replace = th6 == null ? "" : android.util.Log.getStackTraceString(th6).replace('\n', ';').replace("\t", "");
            java.lang.String str2 = strArr2.length >= 1 ? strArr2[0] : "";
            java.lang.String str3 = strArr2.length >= 2 ? strArr2[1] : "";
            java.lang.String str4 = strArr2.length >= 3 ? strArr2[2] : "";
            java.lang.String str5 = strArr2.length >= 4 ? strArr2[3] : "";
            map.put("key5", strArr2.length >= 5 ? strArr2[4] : "");
            map.put("dev-fingerprint", android.os.Build.FINGERPRINT);
            map.put("dev-romInfo", fp.e0.a());
            java.lang.String b17 = ap.c.b(map);
            com.tencent.mars.xlog.Log.i("MicroMsg.CompatReporter", "#reportCommon: " + str);
            ap.c.a(1, 0, str, a17, replace, str2, str3, str4, str5, b17);
        }
    }
}
