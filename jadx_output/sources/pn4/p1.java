package pn4;

/* loaded from: classes4.dex */
public class p1 {

    /* renamed from: n, reason: collision with root package name */
    public static int f357170n;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f357171a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f357172b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f357173c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f357174d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f357175e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f357176f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f357177g;

    /* renamed from: h, reason: collision with root package name */
    public int f357178h;

    /* renamed from: i, reason: collision with root package name */
    public final int f357179i;

    /* renamed from: j, reason: collision with root package name */
    public final int f357180j;

    /* renamed from: k, reason: collision with root package name */
    public int f357181k;

    /* renamed from: l, reason: collision with root package name */
    public final int f357182l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f357183m;

    public p1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, byte[] bArr) {
        int t17;
        java.lang.String trim;
        this.f357171a = str;
        this.f357172b = str2;
        this.f357174d = str3;
        this.f357179i = i17;
        this.f357182l = i18;
        this.f357175e = str4;
        this.f357177g = bArr;
        if (f357170n == Integer.MAX_VALUE) {
            f357170n = 0;
        }
        int i19 = f357170n + 1;
        f357170n = i19;
        this.f357180j = i19;
        if (i17 != 1 || (t17 = c01.w9.t(str)) == -1 || (trim = str.substring(0, t17).trim()) == null || trim.length() <= 0) {
            return;
        }
        this.f357183m = trim;
        this.f357171a = str.substring(t17 + 1).trim();
    }
}
