package u75;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f425178a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f425179b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f425180c;

    public static java.lang.String a() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f425180c)) {
            return f425180c;
        }
        java.lang.String str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            str = (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, "ro.build.version.emui", com.eclipsesource.mmv8.Platform.UNKNOWN);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Vendor.Huawei", "getProperty() Exception:%s", e17.getMessage());
        }
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        f425180c = lowerCase;
        return lowerCase;
    }

    public static boolean b(android.content.Context context) {
        if (context == null) {
            return false;
        }
        try {
            java.lang.Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((java.lang.Boolean) loadClass.getMethod("hasNotchInScreen", new java.lang.Class[0]).invoke(loadClass, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Vendor.Huawei", th6, "hasCutOut call failed.", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean c() {
        if (f425178a == null) {
            java.lang.String str = android.os.Build.BRAND;
            com.tencent.mars.xlog.Log.i("MicroMsg.Vendor.Huawei", "Build.BRAND = %s", str);
            if ("HONOR".equalsIgnoreCase(str)) {
                f425178a = java.lang.Boolean.TRUE;
            } else if ("HUAWEI".equalsIgnoreCase(str)) {
                f425178a = java.lang.Boolean.TRUE;
            } else {
                f425178a = java.lang.Boolean.FALSE;
            }
        }
        return f425178a.booleanValue();
    }

    public static boolean d() {
        if (f425179b == null) {
            java.lang.String str = android.os.Build.BRAND;
            com.tencent.mars.xlog.Log.i("MicroMsg.Vendor.Huawei", "Build.BRAND = %s", str);
            if ("HUAWEI".equalsIgnoreCase(str)) {
                f425179b = java.lang.Boolean.TRUE;
            } else if ("HONOR".equalsIgnoreCase(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Vendor.Huawei", "Build.MANUFACTURER = %s", android.os.Build.MANUFACTURER);
                f425179b = java.lang.Boolean.valueOf(!"HONOR".equalsIgnoreCase(r0));
            } else {
                f425179b = java.lang.Boolean.FALSE;
            }
        }
        return f425179b.booleanValue();
    }
}
