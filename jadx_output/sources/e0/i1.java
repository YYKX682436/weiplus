package e0;

/* loaded from: classes14.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f245598a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.o1[] f245599b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f245600c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.b f245601d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.c f245602e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.s f245603f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f245604g;

    /* renamed from: h, reason: collision with root package name */
    public final int f245605h;

    /* renamed from: i, reason: collision with root package name */
    public final int f245606i;

    /* renamed from: j, reason: collision with root package name */
    public final e0.q f245607j;

    /* renamed from: k, reason: collision with root package name */
    public final int f245608k;

    /* renamed from: l, reason: collision with root package name */
    public final long f245609l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f245610m;

    /* renamed from: n, reason: collision with root package name */
    public final int f245611n;

    /* renamed from: o, reason: collision with root package name */
    public final int f245612o;

    /* renamed from: p, reason: collision with root package name */
    public final int f245613p;

    public i1(int i17, s1.o1[] o1VarArr, boolean z17, z0.b bVar, z0.c cVar, p2.s sVar, boolean z18, int i18, int i19, e0.q qVar, int i27, long j17, java.lang.Object obj, kotlin.jvm.internal.i iVar) {
        this.f245598a = i17;
        this.f245599b = o1VarArr;
        this.f245600c = z17;
        this.f245601d = bVar;
        this.f245602e = cVar;
        this.f245603f = sVar;
        this.f245604g = z18;
        this.f245605h = i18;
        this.f245606i = i19;
        this.f245607j = qVar;
        this.f245608k = i27;
        this.f245609l = j17;
        this.f245610m = obj;
        int i28 = 0;
        int i29 = 0;
        for (s1.o1 o1Var : o1VarArr) {
            boolean z19 = this.f245600c;
            i28 += z19 ? o1Var.f402051e : o1Var.f402050d;
            i29 = java.lang.Math.max(i29, !z19 ? o1Var.f402051e : o1Var.f402050d);
        }
        this.f245611n = i28;
        this.f245612o = i28 + this.f245608k;
        this.f245613p = i29;
    }

    public final e0.q0 a(int i17, int i18, int i19) {
        long a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = this.f245600c;
        int i27 = z17 ? i19 : i18;
        boolean z18 = this.f245604g;
        int i28 = z18 ? (i27 - i17) - this.f245611n : i17;
        s1.o1[] o1VarArr = this.f245599b;
        int P = z18 ? kz5.z.P(o1VarArr) : 0;
        while (true) {
            boolean z19 = true;
            if (!z18 ? P >= o1VarArr.length : P < 0) {
                z19 = false;
            }
            if (!z19) {
                int i29 = this.f245598a;
                java.lang.Object obj = this.f245610m;
                int i37 = this.f245611n;
                int i38 = this.f245612o;
                int i39 = this.f245605h;
                int i47 = this.f245606i;
                int i48 = -(!z18 ? i39 : i47);
                if (!z18) {
                    i39 = i47;
                }
                return new e0.q0(i17, i29, obj, i37, i38, i48, i27 + i39, this.f245600c, arrayList, this.f245607j, this.f245609l, null);
            }
            s1.o1 o1Var = o1VarArr[P];
            int size = z18 ? 0 : arrayList.size();
            if (z17) {
                z0.b bVar = this.f245601d;
                if (bVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                a17 = p2.n.a(((z0.e) bVar).a(o1Var.f402050d, i18, this.f245603f), i28);
            } else {
                z0.c cVar = this.f245602e;
                if (cVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                a17 = p2.n.a(i28, ((z0.f) cVar).a(o1Var.f402051e, i19));
            }
            i28 += z17 ? o1Var.f402051e : o1Var.f402050d;
            arrayList.add(size, new e0.p0(a17, o1Var, o1VarArr[P].g(), null));
            P = z18 ? P - 1 : P + 1;
        }
    }
}
