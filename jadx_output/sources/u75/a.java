package u75;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final u75.a f425176a = new u75.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f425177b;

    public final boolean a() {
        if (f425177b == null) {
            java.lang.String str = android.os.Build.BRAND;
            java.lang.String str2 = android.os.Build.MANUFACTURER;
            com.tencent.mars.xlog.Log.i("MicroMsg.Vendor.Honor", "Build.BRAND:" + str + ", manufacture:" + str2);
            f425177b = java.lang.Boolean.valueOf(r26.i0.p("HONOR", str, true) && r26.i0.p("HONOR", str2, true));
        }
        java.lang.Boolean bool = f425177b;
        kotlin.jvm.internal.o.e(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }
}
