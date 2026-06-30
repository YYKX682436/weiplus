package yf5;

/* loaded from: classes11.dex */
public class x extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.l4 f461995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f461996e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461997f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f461998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f461999h;

    /* renamed from: i, reason: collision with root package name */
    public int f462000i;

    /* renamed from: m, reason: collision with root package name */
    public int f462001m;

    /* renamed from: n, reason: collision with root package name */
    public int f462002n;

    /* renamed from: o, reason: collision with root package name */
    public int f462003o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f462004p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f462005q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f462006r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f462007s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f462008t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f462009u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f462010v;

    /* renamed from: w, reason: collision with root package name */
    public r45.fh7 f462011w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f462012x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f462013y;

    /* renamed from: z, reason: collision with root package name */
    public int f462014z = -1;

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yf5.x xVar = (yf5.x) obj;
        return java.util.Objects.equals(this.f461995d.h1(), xVar.f461995d.h1()) && java.util.Objects.equals(this.f461996e, xVar.f461996e) && java.util.Objects.equals(this.f461997f, xVar.f461997f) && java.util.Objects.equals(this.f461998g, xVar.f461998g) && java.util.Objects.equals(this.f461999h, xVar.f461999h) && this.f462005q == xVar.f462005q && this.f462012x == xVar.f462012x && java.util.Objects.equals(this.f462013y, xVar.f462013y) && this.f462014z == xVar.f462014z && this.f461995d.d1() == xVar.f461995d.d1();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yf5.x xVar = (yf5.x) obj;
        int compare = java.lang.Long.compare(xVar.f461995d.G0(), this.f461995d.G0());
        if (compare != 0) {
            return compare;
        }
        java.lang.String h17 = this.f461995d.h1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (h17 == null) {
            h17 = "";
        }
        java.lang.String h18 = xVar.f461995d.h1();
        return h17.compareTo(h18 != null ? h18 : "");
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String h17 = this.f461995d.h1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return h17 == null ? "" : h17;
    }
}
