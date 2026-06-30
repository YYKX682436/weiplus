package u75;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f425186a;

    public static boolean a() {
        if (f425186a == null) {
            java.lang.String str = android.os.Build.BRAND;
            com.tencent.mars.xlog.Log.i("MicroMsg.Vendor.OnePlus", "Build.BRAND = %s", str);
            if (str.toLowerCase().contains("oneplus")) {
                f425186a = java.lang.Boolean.TRUE;
            } else {
                f425186a = java.lang.Boolean.FALSE;
            }
        }
        return f425186a.booleanValue();
    }
}
