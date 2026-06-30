package q35;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f359970a = new boolean[21];

    public static boolean a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return ((java.lang.Boolean) xo.a.a(path, false).f302841d).booleanValue();
    }

    public static boolean b() {
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            return true;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new q35.b$$a());
        java.lang.String path = lp0.b.D();
        kotlin.jvm.internal.o.g(path, "path");
        jz5.o a17 = xo.a.a(path, false);
        if (((java.lang.Boolean) a17.f302841d).booleanValue()) {
            return true;
        }
        java.util.Map b17 = xo.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "File_WriteSdTest", new java.io.File(lp0.b.D()), (java.lang.Throwable) a17.f302843f);
        ap.a.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "SdcardCompat", (java.lang.Throwable) a17.f302843f, b17, "WriteSdTest", (java.lang.String) a17.f302842e);
        if (!xo.a.f455739b) {
            jz5.o a18 = xo.a.a(lp0.b.D(), true);
            if (((java.lang.Boolean) a18.f302841d).booleanValue()) {
                return true;
            }
            ap.a.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "SdcardCompat", (java.lang.Throwable) a18.f302843f, b17, "WriteSdTestSimpleMode", (java.lang.String) a18.f302842e);
        }
        return !xo.a.f455741d;
    }
}
