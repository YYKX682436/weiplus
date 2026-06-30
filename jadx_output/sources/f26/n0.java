package f26;

/* loaded from: classes16.dex */
public final class n0 implements f26.c2, i26.h {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f259197a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashSet f259198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f259199c;

    public n0(java.util.Collection typesToIntersect) {
        kotlin.jvm.internal.o.g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(typesToIntersect);
        this.f259198b = linkedHashSet;
        this.f259199c = linkedHashSet.hashCode();
    }

    @Override // f26.c2
    public java.util.Collection a() {
        return this.f259198b;
    }

    public final f26.z0 b() {
        f26.r1.f259214e.getClass();
        return f26.r0.g(f26.r1.f259215f, this, kz5.p0.f313996d, false, y16.h0.f458941c.a("member scope for intersection type", this.f259198b), new f26.j0(this));
    }

    public final java.lang.String c(yz5.l getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.o.g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return kz5.n0.g0(kz5.n0.F0(this.f259198b, new f26.k0(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new f26.m0(getProperTypeRelatedToStringify), 24, null);
    }

    public f26.n0 d(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        java.util.LinkedHashSet linkedHashSet = this.f259198b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedHashSet, 10));
        java.util.Iterator it = linkedHashSet.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            arrayList.add(((f26.o0) it.next()).y0(kotlinTypeRefiner));
            z17 = true;
        }
        f26.n0 n0Var = null;
        if (z17) {
            f26.o0 o0Var = this.f259197a;
            n0Var = new f26.n0(new f26.n0(arrayList).f259198b, o0Var != null ? o0Var.y0(kotlinTypeRefiner) : null);
        }
        return n0Var == null ? this : n0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f26.n0) {
            return kotlin.jvm.internal.o.b(this.f259198b, ((f26.n0) obj).f259198b);
        }
        return false;
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        return kz5.p0.f313996d;
    }

    @Override // f26.c2
    public l06.o h() {
        l06.o h17 = ((f26.o0) this.f259198b.iterator().next()).w0().h();
        kotlin.jvm.internal.o.f(h17, "getBuiltIns(...)");
        return h17;
    }

    public int hashCode() {
        return this.f259199c;
    }

    @Override // f26.c2
    public o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    public java.lang.String toString() {
        return c(f26.l0.f259189d);
    }

    public n0(java.util.Collection collection, f26.o0 o0Var) {
        this(collection);
        this.f259197a = o0Var;
    }
}
