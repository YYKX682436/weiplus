package f0;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f258162a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258163b;

    /* renamed from: c, reason: collision with root package name */
    public int f258164c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f258165d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f258166e;

    /* renamed from: f, reason: collision with root package name */
    public int f258167f;

    /* renamed from: g, reason: collision with root package name */
    public int f258168g;

    /* renamed from: h, reason: collision with root package name */
    public int f258169h;

    /* renamed from: i, reason: collision with root package name */
    public int f258170i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f258171j;

    public o(kotlinx.coroutines.y0 scope, boolean z17) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f258162a = scope;
        this.f258163b = z17;
        this.f258165d = new java.util.LinkedHashMap();
        this.f258166e = kz5.q0.f314001d;
        this.f258167f = -1;
        this.f258169h = -1;
        this.f258171j = new java.util.LinkedHashSet();
    }

    public final int a(int i17, int i18, int i19, long j17, boolean z17, int i27, int i28) {
        boolean z18 = false;
        if (!(this.f258164c != 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i29 = this.f258169h;
        boolean z19 = z17 ? i29 > i17 : i29 < i17;
        if (z17 ? this.f258167f < i17 : this.f258167f > i17) {
            z18 = true;
        }
        if (z19) {
            int abs = java.lang.Math.abs(i17 - this.f258169h);
            int i37 = this.f258164c;
            return i27 + this.f258170i + (i19 * ((((abs + i37) - 1) / i37) - 1)) + b(j17);
        }
        if (!z18) {
            return i28;
        }
        int abs2 = java.lang.Math.abs(this.f258167f - i17);
        int i38 = this.f258164c;
        return ((this.f258168g - i18) - (i19 * ((((abs2 + i38) - 1) / i38) - 1))) + b(j17);
    }

    public final int b(long j17) {
        if (this.f258163b) {
            return p2.m.b(j17);
        }
        int i17 = p2.m.f351389c;
        return (int) (j17 >> 32);
    }

    public final void c(f0.q0 q0Var, f0.f fVar) {
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.List list2;
        boolean z17;
        f0.q0 q0Var2 = q0Var;
        f0.f fVar2 = fVar;
        while (true) {
            int size = ((java.util.ArrayList) fVar2.f258069d).size();
            int size2 = q0Var2.f258198m.size();
            list = fVar2.f258069d;
            if (size <= size2) {
                break;
            } else {
                kz5.h0.D(list);
            }
        }
        while (true) {
            arrayList = (java.util.ArrayList) list;
            int size3 = arrayList.size();
            list2 = q0Var2.f258198m;
            int size4 = list2.size();
            z17 = q0Var2.f258197l;
            if (size3 >= size4) {
                break;
            }
            int size5 = arrayList.size();
            long j17 = fVar2.f258068c;
            long j18 = q0Var2.f258186a;
            long a17 = p2.n.a(((int) (j18 >> 32)) - ((int) (j17 >> 32)), p2.m.b(j18) - p2.m.b(j17));
            s1.o1 o1Var = ((f0.p0) list2.get(size5)).f258181a;
            arrayList.add(new f0.l2(a17, z17 ? o1Var.f402051e : o1Var.f402050d, null));
        }
        int size6 = arrayList.size();
        int i17 = 0;
        while (i17 < size6) {
            f0.l2 l2Var = (f0.l2) arrayList.get(i17);
            long j19 = l2Var.f258149c;
            long j27 = fVar2.f258068c;
            java.util.List list3 = list2;
            java.util.ArrayList arrayList2 = arrayList;
            int i18 = size6;
            long a18 = p2.n.a(((int) (j19 >> 32)) + ((int) (j27 >> 32)), p2.m.b(j19) + p2.m.b(j27));
            s1.o1 o1Var2 = ((f0.p0) list3.get(i17)).f258181a;
            l2Var.f258147a = z17 ? o1Var2.f402051e : o1Var2.f402050d;
            z.k0 a19 = q0Var2.a(i17);
            long j28 = q0Var2.f258187b;
            if (!(a18 == j28)) {
                long j29 = fVar2.f258068c;
                l2Var.f258149c = p2.n.a(((int) (j28 >> 32)) - ((int) (j29 >> 32)), p2.m.b(j28) - p2.m.b(j29));
                if (a19 != null) {
                    ((n0.q4) l2Var.f258150d).setValue(java.lang.Boolean.TRUE);
                    kotlinx.coroutines.l.d(this.f258162a, null, null, new f0.n(l2Var, a19, null), 3, null);
                    i17++;
                    q0Var2 = q0Var;
                    fVar2 = fVar;
                    arrayList = arrayList2;
                    size6 = i18;
                    list2 = list3;
                }
            }
            i17++;
            q0Var2 = q0Var;
            fVar2 = fVar;
            arrayList = arrayList2;
            size6 = i18;
            list2 = list3;
        }
    }
}
