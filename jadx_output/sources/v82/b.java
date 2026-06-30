package v82;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f434067a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f434068b;

    /* renamed from: c, reason: collision with root package name */
    public int f434069c;

    /* renamed from: d, reason: collision with root package name */
    public int f434070d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f434071e;

    /* renamed from: f, reason: collision with root package name */
    public int f434072f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f434073g;

    /* renamed from: h, reason: collision with root package name */
    public int f434074h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f434075i;

    /* renamed from: j, reason: collision with root package name */
    public int f434076j;

    /* renamed from: k, reason: collision with root package name */
    public long f434077k;

    /* renamed from: l, reason: collision with root package name */
    public long f434078l;

    public static java.lang.String a() {
        return java.lang.String.format("%s_%s", c01.z1.r(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static int c(int i17) {
        if (i17 == 3) {
            return 6;
        }
        if (i17 == 5) {
            return 2;
        }
        if (i17 == 6) {
            return 8;
        }
        if (i17 == 7) {
            return 4;
        }
        if (i17 == 8) {
            return 3;
        }
        if (i17 == 17) {
            return 5;
        }
        if (i17 == 18) {
            return 7;
        }
        switch (i17) {
            case 20:
                return 10;
            case 21:
                return 1;
            case 22:
                return 9;
            default:
                return 0;
        }
    }

    public void b() {
        java.lang.String.format("zst, 15488 on report, actionType %s, subScene %s, scene %s, actionTime %s, query %s, tabId %s, searchId:%s, searchCost:%s, localPosition %s, localResultCount %s", java.lang.Integer.valueOf(this.f434067a), java.lang.Integer.valueOf(this.f434068b), java.lang.Integer.valueOf(this.f434069c), java.lang.Integer.valueOf(this.f434070d), this.f434071e, java.lang.Integer.valueOf(this.f434072f), this.f434073g, java.lang.Integer.valueOf(this.f434074h), this.f434075i, java.lang.Integer.valueOf(this.f434076j));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15488, java.lang.Integer.valueOf(this.f434067a), java.lang.Integer.valueOf(this.f434068b), java.lang.Integer.valueOf(this.f434069c), 0, java.lang.Integer.valueOf(this.f434070d), this.f434071e, 0L, java.lang.Integer.valueOf(this.f434072f), this.f434073g, java.lang.Integer.valueOf(this.f434074h), "0", this.f434075i, 0, java.lang.Integer.valueOf(this.f434076j), "0");
    }

    public boolean d(r45.fq0 fq0Var) {
        if (fq0Var == null) {
            return false;
        }
        this.f434072f = fq0Var.f374541f;
        this.f434069c = fq0Var.f374539d;
        this.f434068b = fq0Var.f374540e;
        this.f434075i = fq0Var.f374542g;
        this.f434076j = fq0Var.f374543h;
        this.f434071e = fq0Var.f374544i;
        return true;
    }

    public boolean e(r45.fq0 fq0Var) {
        if (fq0Var == null) {
            return false;
        }
        fq0Var.f374541f = this.f434072f;
        fq0Var.f374539d = this.f434069c;
        fq0Var.f374540e = this.f434068b;
        fq0Var.f374542g = this.f434075i;
        fq0Var.f374543h = this.f434076j;
        fq0Var.f374544i = this.f434071e;
        return true;
    }
}
