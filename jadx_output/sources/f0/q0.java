package f0;

/* loaded from: classes14.dex */
public final class q0 implements f0.k {

    /* renamed from: a, reason: collision with root package name */
    public final long f258186a;

    /* renamed from: b, reason: collision with root package name */
    public final long f258187b;

    /* renamed from: c, reason: collision with root package name */
    public final int f258188c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f258189d;

    /* renamed from: e, reason: collision with root package name */
    public final int f258190e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258191f;

    /* renamed from: g, reason: collision with root package name */
    public final long f258192g;

    /* renamed from: h, reason: collision with root package name */
    public final int f258193h;

    /* renamed from: i, reason: collision with root package name */
    public final int f258194i;

    /* renamed from: j, reason: collision with root package name */
    public final int f258195j;

    /* renamed from: k, reason: collision with root package name */
    public final int f258196k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f258197l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f258198m;

    /* renamed from: n, reason: collision with root package name */
    public final f0.o f258199n;

    /* renamed from: o, reason: collision with root package name */
    public final long f258200o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f258201p;

    public q0(long j17, long j18, int i17, java.lang.Object obj, int i18, int i19, long j19, int i27, int i28, int i29, int i37, boolean z17, java.util.List list, f0.o oVar, long j27, kotlin.jvm.internal.i iVar) {
        this.f258186a = j17;
        this.f258187b = j18;
        this.f258188c = i17;
        this.f258189d = obj;
        this.f258190e = i18;
        this.f258191f = i19;
        this.f258192g = j19;
        this.f258193h = i27;
        this.f258194i = i28;
        this.f258195j = i29;
        this.f258196k = i37;
        this.f258197l = z17;
        this.f258198m = list;
        this.f258199n = oVar;
        this.f258200o = j27;
        int size = list.size();
        boolean z18 = false;
        int i38 = 0;
        while (true) {
            if (i38 >= size) {
                break;
            }
            if (a(i38) != null) {
                z18 = true;
                break;
            }
            i38++;
        }
        this.f258201p = z18;
    }

    public final z.k0 a(int i17) {
        java.lang.Object obj = ((f0.p0) this.f258198m.get(i17)).f258182b;
        if (obj instanceof z.k0) {
            return (z.k0) obj;
        }
        return null;
    }

    public final int b() {
        boolean z17 = this.f258197l;
        long j17 = this.f258192g;
        return this.f258194i + (z17 ? p2.q.b(j17) : (int) (j17 >> 32));
    }
}
