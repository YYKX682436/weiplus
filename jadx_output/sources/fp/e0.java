package fp;

/* loaded from: classes12.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f265177a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f265178b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f265179c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f265180d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f265181e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f265182f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f265183g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f265184h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f265185i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Boolean f265186j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f265187k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f265188l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Boolean f265189m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f265190n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.Boolean f265191o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f265192p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.Boolean f265193q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Boolean f265194r;

    static {
        java.lang.String str = android.os.Build.MANUFACTURER;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        f265177a = str.toLowerCase();
    }

    public static java.lang.String a() {
        java.lang.String str;
        if (h()) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.FtBuild");
                str = (java.lang.String) cls.getMethod("getProductVersion", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
            } catch (java.lang.Exception unused) {
                str = "";
            }
        } else {
            str = null;
        }
        return android.text.TextUtils.isEmpty(str) ? "empty" : str;
    }

    public static boolean b() {
        if (f265188l == null) {
            f265188l = f265177a.contains("honor") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265188l.booleanValue();
    }

    public static boolean c() {
        if (f265187k == null) {
            f265187k = f265177a.contains("huawei") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265187k.booleanValue();
    }

    public static boolean d() {
        if (f265192p == null) {
            f265192p = f265177a.contains("oneplus") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265192p.booleanValue();
    }

    public static boolean e() {
        if (f265181e == null) {
            f265181e = f265177a.contains("oppo") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265181e.booleanValue();
    }

    public static boolean f() {
        if (f265182f == null) {
            f265182f = f265177a.contains("realme") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265182f.booleanValue();
    }

    public static boolean g() {
        if (f265179c == null) {
            f265179c = f265177a.contains("samsung") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265179c.booleanValue();
    }

    public static boolean h() {
        if (f265185i == null) {
            f265185i = f265177a.contains("vivo") ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265185i.booleanValue();
    }

    public static boolean i() {
        if (f265186j == null) {
            java.lang.String str = f265177a;
            f265186j = (str.contains("xiaomi") || str.contains("redmi")) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265186j.booleanValue();
    }

    public static boolean j() {
        if (f265194r == null) {
            java.lang.String str = f265177a;
            f265194r = (str.contains("zte") || str.contains("nubia") || str.contains("vertu") || str.contains("leia inc")) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        return f265194r.booleanValue();
    }
}
