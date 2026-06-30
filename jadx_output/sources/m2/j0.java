package m2;

/* loaded from: classes14.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f322925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f322926b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.o f322927c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.k f322928d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f322929e;

    public j0(java.lang.String fileName, int i17, p2.o bounds, o2.k kVar, java.util.List children) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(bounds, "bounds");
        kotlin.jvm.internal.o.g(children, "children");
        this.f322925a = fileName;
        this.f322926b = i17;
        this.f322927c = bounds;
        this.f322928d = kVar;
        this.f322929e = children;
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f322929e;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((m2.j0) it.next()).a());
        }
        return kz5.n0.t0(list, arrayList);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2.j0)) {
            return false;
        }
        m2.j0 j0Var = (m2.j0) obj;
        return kotlin.jvm.internal.o.b(this.f322925a, j0Var.f322925a) && this.f322926b == j0Var.f322926b && kotlin.jvm.internal.o.b(this.f322927c, j0Var.f322927c) && kotlin.jvm.internal.o.b(this.f322928d, j0Var.f322928d) && kotlin.jvm.internal.o.b(this.f322929e, j0Var.f322929e);
    }

    public int hashCode() {
        int hashCode = ((((this.f322925a.hashCode() * 31) + java.lang.Integer.hashCode(this.f322926b)) * 31) + this.f322927c.hashCode()) * 31;
        o2.k kVar = this.f322928d;
        return ((hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31) + this.f322929e.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004d, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String r2 = r5.f322925a
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r5.f322926b
            r0.append(r2)
            java.lang.String r2 = ",\n            |bounds=(top="
            r0.append(r2)
            p2.o r2 = r5.f322927c
            int r3 = r2.f351392b
            r0.append(r3)
            java.lang.String r3 = ", left="
            r0.append(r3)
            int r3 = r2.f351391a
            r0.append(r3)
            java.lang.String r3 = ",\n            |location="
            r0.append(r3)
            o2.k r3 = r5.f322928d
            if (r3 == 0) goto L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            int r1 = r3.f342359b
            r4.append(r1)
            r1 = 76
            r4.append(r1)
            int r1 = r3.f342360c
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            if (r1 != 0) goto L51
        L4f:
            java.lang.String r1 = "<none>"
        L51:
            r0.append(r1)
            java.lang.String r1 = "\n            |bottom="
            r0.append(r1)
            int r1 = r2.f351394d
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.f351393c
            r0.append(r1)
            java.lang.String r1 = "),\n            |childrenCount="
            r0.append(r1)
            java.util.List r1 = r5.f322929e
            int r1 = r1.size()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            r2 = 0
            java.lang.String r0 = r26.b0.c(r0, r2, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.j0.toString():java.lang.String");
    }
}
