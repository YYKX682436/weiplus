package v24;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.g f432918a = new v24.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f432919b = jz5.h.b(v24.f.f432916d);

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f432920c;

    public final java.lang.String a() {
        java.lang.String str = f432920c;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = f432920c;
            return str2 == null ? "" : str2;
        }
        if (gm0.j1.a()) {
            f432920c = gm0.j1.b().j();
        }
        java.lang.String str3 = f432920c;
        return str3 == null ? "" : str3;
    }

    public final void b(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4.M("LocalGenFinishSuccess").putBoolean("LocalGenFinishSuccess".concat(a()), z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulQRConfig", "saveLocalGenFlag: " + z17);
    }
}
