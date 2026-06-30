package wo;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f447780a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f447781b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f447782c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f447783d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f447784e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f447785f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f447786g;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("android-");
        int i17 = android.os.Build.VERSION.SDK_INT;
        sb6.append(i17);
        f447780a = sb6.toString();
        f447781b = android.os.Build.BRAND;
        f447782c = wo.w0.m() + android.os.Build.CPU_ABI;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str = android.os.Build.MANUFACTURER;
        sb7.append(str);
        sb7.append("-");
        sb7.append(wo.w0.m());
        f447783d = sb7.toString();
        f447784e = "android-" + i17;
        f447785f = "" + i17;
        f447786g = "android-" + str;
    }
}
