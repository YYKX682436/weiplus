package t13;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: i, reason: collision with root package name */
    public p13.y f414573i;

    /* renamed from: a, reason: collision with root package name */
    public int f414565a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public boolean f414566b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f414567c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public boolean f414568d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f414569e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f414570f = null;

    /* renamed from: g, reason: collision with root package name */
    public p13.r f414571g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414572h = true;

    /* renamed from: j, reason: collision with root package name */
    public int f414574j = 0;

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.f414565a);
        objArr[1] = java.lang.Boolean.valueOf(this.f414566b);
        objArr[2] = java.lang.Integer.valueOf(this.f414567c);
        objArr[3] = java.lang.Boolean.valueOf(this.f414568d);
        objArr[4] = java.lang.Integer.valueOf(this.f414569e);
        java.util.List list = this.f414570f;
        objArr[5] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        objArr[6] = java.lang.Integer.valueOf(this.f414574j);
        return java.lang.String.format("{%d, %b, %d, %b, %d, %d, %d}", objArr);
    }
}
