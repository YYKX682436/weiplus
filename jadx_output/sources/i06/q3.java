package i06;

/* loaded from: classes16.dex */
public abstract class q3 extends i06.k0 implements f06.v {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.Object f286730s = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public final i06.u1 f286731m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f286732n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f286733o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f286734p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f286735q;

    /* renamed from: r, reason: collision with root package name */
    public final i06.c4 f286736r;

    public q3(i06.u1 u1Var, java.lang.String str, java.lang.String str2, o06.o1 o1Var, java.lang.Object obj) {
        this.f286731m = u1Var;
        this.f286732n = str;
        this.f286733o = str2;
        this.f286734p = obj;
        this.f286735q = jz5.h.a(jz5.i.f302830e, new i06.p3(this));
        this.f286736r = new i06.c4(o1Var, new i06.o3(this));
    }

    public boolean equals(java.lang.Object obj) {
        i06.q3 c17 = i06.o4.c(obj);
        return c17 != null && kotlin.jvm.internal.o.b(this.f286731m, c17.f286731m) && kotlin.jvm.internal.o.b(this.f286732n, c17.f286732n) && kotlin.jvm.internal.o.b(this.f286733o, c17.f286733o) && kotlin.jvm.internal.o.b(this.f286734p, c17.f286734p);
    }

    @Override // f06.c
    public java.lang.String getName() {
        return this.f286732n;
    }

    public int hashCode() {
        return (((this.f286731m.hashCode() * 31) + this.f286732n.hashCode()) * 31) + this.f286733o.hashCode();
    }

    @Override // i06.k0
    public j06.k i() {
        return r().i();
    }

    @Override // f06.c
    public boolean isSuspend() {
        return false;
    }

    @Override // i06.k0
    public i06.u1 j() {
        return this.f286731m;
    }

    @Override // i06.k0
    public j06.k k() {
        r().getClass();
        return null;
    }

    @Override // i06.k0
    public boolean o() {
        return !kotlin.jvm.internal.o.b(this.f286734p, kotlin.jvm.internal.e.NO_RECEIVER);
    }

    public final java.lang.reflect.Member p() {
        if (!l().U()) {
            return null;
        }
        i06.y b17 = i06.k4.f286686a.b(l());
        if (b17 instanceof i06.w) {
            i06.w wVar = (i06.w) b17;
            l16.j jVar = wVar.f286772c;
            if ((jVar.f315047e & 16) == 16) {
                l16.g gVar = jVar.f315052m;
                int i17 = gVar.f315033e;
                if ((i17 & 1) == 1) {
                    if ((i17 & 2) == 2) {
                        int i18 = gVar.f315034f;
                        k16.g gVar2 = wVar.f286773d;
                        return this.f286731m.j(gVar2.getString(i18), gVar2.getString(gVar.f315035g));
                    }
                }
                return null;
            }
        }
        return (java.lang.reflect.Field) this.f286735q.getValue();
    }

    @Override // i06.k0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public o06.o1 l() {
        java.lang.Object invoke = this.f286736r.invoke();
        kotlin.jvm.internal.o.f(invoke, "invoke(...)");
        return (o06.o1) invoke;
    }

    public abstract i06.k3 r();

    public java.lang.String toString() {
        return i06.j4.f286670a.c(l());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q3(i06.u1 container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q3(i06.u1 r8, o06.o1 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.o.g(r9, r0)
            n16.g r0 = r9.getName()
            java.lang.String r3 = r0.h()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.o.f(r3, r0)
            i06.k4 r0 = i06.k4.f286686a
            i06.y r0 = r0.b(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i06.q3.<init>(i06.u1, o06.o1):void");
    }
}
