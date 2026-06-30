package e0;

/* loaded from: classes14.dex */
public final class q0 implements e0.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f245678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f245679b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f245680c;

    /* renamed from: d, reason: collision with root package name */
    public final int f245681d;

    /* renamed from: e, reason: collision with root package name */
    public final int f245682e;

    /* renamed from: f, reason: collision with root package name */
    public final int f245683f;

    /* renamed from: g, reason: collision with root package name */
    public final int f245684g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f245685h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f245686i;

    /* renamed from: j, reason: collision with root package name */
    public final e0.q f245687j;

    /* renamed from: k, reason: collision with root package name */
    public final long f245688k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f245689l;

    public q0(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, boolean z17, java.util.List list, e0.q qVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f245678a = i17;
        this.f245679b = i18;
        this.f245680c = obj;
        this.f245681d = i19;
        this.f245682e = i27;
        this.f245683f = i28;
        this.f245684g = i29;
        this.f245685h = z17;
        this.f245686i = list;
        this.f245687j = qVar;
        this.f245688k = j17;
        int size = list.size();
        boolean z18 = false;
        int i37 = 0;
        while (true) {
            if (i37 >= size) {
                break;
            }
            if (a(i37) != null) {
                z18 = true;
                break;
            }
            i37++;
        }
        this.f245689l = z18;
    }

    public final z.k0 a(int i17) {
        java.lang.Object obj = ((e0.p0) this.f245686i.get(i17)).f245665c;
        if (obj instanceof z.k0) {
            return (z.k0) obj;
        }
        return null;
    }

    public final int b(int i17) {
        s1.o1 o1Var = ((e0.p0) this.f245686i.get(i17)).f245664b;
        return this.f245685h ? o1Var.f402051e : o1Var.f402050d;
    }

    public final long c(int i17) {
        return ((e0.p0) this.f245686i.get(i17)).f245663a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r4.b(r7) > r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(s1.n1 r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q0.d(s1.n1):void");
    }
}
