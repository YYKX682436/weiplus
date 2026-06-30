package l52;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public r45.p86 f316607a;

    /* renamed from: b, reason: collision with root package name */
    public int f316608b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f316609c;

    /* renamed from: d, reason: collision with root package name */
    public int f316610d;

    /* renamed from: e, reason: collision with root package name */
    public int f316611e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f316612f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f316613g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f316614h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f316615i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f316616j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f316617k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f316618l = "";

    public boolean a(int i17) {
        r45.p86 p86Var = this.f316607a;
        int i18 = p86Var.f382843i + p86Var.f382844m;
        if (i17 != 0 && p86Var.f382839e == 0 && this.f316608b == 0) {
            i18 = 0;
        }
        int i19 = p86Var.f382841g - p86Var.f382842h;
        java.lang.Math.max(p86Var.f382839e, i18);
        r45.p86 p86Var2 = this.f316607a;
        int i27 = p86Var2.f382839e + p86Var2.f382840f;
        java.lang.Math.min(i27, i19);
        return this.f316607a.f382839e < i19 && i27 > i18;
    }

    public java.lang.String toString() {
        java.lang.String str;
        r45.p86 p86Var = this.f316607a;
        return (p86Var == null || (str = p86Var.f382838d) == null) ? "NULL" : str;
    }
}
