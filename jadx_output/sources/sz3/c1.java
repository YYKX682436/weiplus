package sz3;

/* loaded from: classes15.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f413974a;

    /* renamed from: b, reason: collision with root package name */
    public long f413975b;

    /* renamed from: c, reason: collision with root package name */
    public int f413976c;

    /* renamed from: d, reason: collision with root package name */
    public int f413977d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f413978e;

    /* renamed from: f, reason: collision with root package name */
    public int f413979f;

    /* renamed from: g, reason: collision with root package name */
    public int f413980g;

    /* renamed from: i, reason: collision with root package name */
    public sz3.a1 f413982i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f413983j;

    /* renamed from: l, reason: collision with root package name */
    public int f413985l;

    /* renamed from: m, reason: collision with root package name */
    public sz3.x0 f413986m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f413987n;

    /* renamed from: o, reason: collision with root package name */
    public sz3.b1 f413988o;

    /* renamed from: p, reason: collision with root package name */
    public sz3.b1 f413989p;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f413981h = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public sz3.d1 f413984k = sz3.d1.f414006d;

    public final sz3.a1 a() {
        java.util.ArrayList arrayList = this.f413981h;
        if (!arrayList.isEmpty()) {
            return (sz3.a1) kz5.n0.a0(arrayList, 0);
        }
        return null;
    }

    public final void b(int i17, int i18, int i19) {
        if (i19 == 90 || i19 == 270) {
            this.f413979f = i18;
            this.f413980g = i17;
        } else {
            this.f413979f = i17;
            this.f413980g = i18;
        }
    }
}
