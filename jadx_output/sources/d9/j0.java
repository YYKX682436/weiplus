package d9;

/* loaded from: classes15.dex */
public final class j0 extends m8.m0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f227357h = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f227358b;

    /* renamed from: c, reason: collision with root package name */
    public final long f227359c;

    /* renamed from: d, reason: collision with root package name */
    public final long f227360d;

    /* renamed from: e, reason: collision with root package name */
    public final long f227361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f227362f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f227363g;

    public j0(long j17, long j18, long j19, long j27, long j28, long j29, boolean z17, boolean z18) {
        this.f227358b = j19;
        this.f227359c = j27;
        this.f227360d = j28;
        this.f227361e = j29;
        this.f227362f = z17;
        this.f227363g = z18;
    }

    @Override // m8.m0
    public int a(java.lang.Object obj) {
        return f227357h.equals(obj) ? 0 : -1;
    }

    @Override // m8.m0
    public m8.k0 d(int i17, m8.k0 k0Var, boolean z17) {
        t9.a.c(i17, 0, 1);
        java.lang.Object obj = z17 ? f227357h : null;
        long j17 = -this.f227360d;
        k0Var.f324595a = obj;
        k0Var.f324596b = obj;
        k0Var.f324597c = 0;
        k0Var.f324598d = this.f227358b;
        k0Var.f324599e = j17;
        k0Var.f324600f = null;
        k0Var.f324601g = null;
        k0Var.f324602h = null;
        k0Var.f324603i = null;
        k0Var.f324604j = null;
        k0Var.f324605k = -9223372036854775807L;
        return k0Var;
    }

    @Override // m8.m0
    public int e() {
        return 1;
    }

    @Override // m8.m0
    public m8.l0 h(int i17, m8.l0 l0Var, boolean z17, long j17) {
        t9.a.c(i17, 0, 1);
        java.lang.Object obj = z17 ? f227357h : null;
        long j18 = this.f227359c;
        long j19 = this.f227361e;
        boolean z18 = this.f227363g;
        if (z18) {
            j19 += j17;
            if (j19 > j18) {
                j19 = -9223372036854775807L;
            }
        }
        l0Var.f324623a = obj;
        l0Var.getClass();
        l0Var.f324624b = z18;
        l0Var.f324627e = j19;
        l0Var.f324628f = j18;
        l0Var.f324625c = 0;
        l0Var.f324626d = 0;
        l0Var.f324629g = this.f227360d;
        return l0Var;
    }

    @Override // m8.m0
    public int i() {
        return 1;
    }
}
