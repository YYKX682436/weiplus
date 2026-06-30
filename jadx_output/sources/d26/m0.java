package d26;

/* loaded from: classes16.dex */
public class m0 extends d26.l0 {

    /* renamed from: g, reason: collision with root package name */
    public final o06.d1 f226026g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f226027h;

    /* renamed from: i, reason: collision with root package name */
    public final n16.c f226028i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(o06.d1 r17, i16.o0 r18, k16.g r19, k16.a r20, d26.z r21, b26.q r22, java.lang.String r23, yz5.a r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r0 = r18
            r15 = r23
            java.lang.String r1 = "packageDescriptor"
            kotlin.jvm.internal.o.g(r14, r1)
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.o.g(r0, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.o.g(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.o.g(r3, r1)
            java.lang.String r1 = "components"
            r4 = r22
            kotlin.jvm.internal.o.g(r4, r1)
            java.lang.String r1 = "debugName"
            kotlin.jvm.internal.o.g(r15, r1)
            java.lang.String r1 = "classNames"
            r5 = r24
            kotlin.jvm.internal.o.g(r5, r1)
            k16.k r10 = new k16.k
            i16.v1 r1 = r0.f287666m
            java.lang.String r7 = "getTypeTable(...)"
            kotlin.jvm.internal.o.f(r1, r7)
            r10.<init>(r1)
            k16.l r1 = k16.m.f303462a
            i16.g2 r7 = r0.f287667n
            java.lang.String r8 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            k16.m r11 = r1.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            b26.t r1 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r2 = r0.f287663g
            java.lang.String r3 = "getFunctionList(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            java.util.List r3 = r0.f287664h
            java.lang.String r4 = "getPropertyList(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            java.util.List r4 = r0.f287665i
            java.lang.String r0 = "getTypeAliasList(...)"
            kotlin.jvm.internal.o.f(r4, r0)
            r0 = r16
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f226026g = r14
            r6.f226027h = r15
            r0 = r14
            r06.z0 r0 = (r06.z0) r0
            n16.c r0 = r0.f368566h
            r6.f226028i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.m0.<init>(o06.d1, i16.o0, k16.g, k16.a, d26.z, b26.q, java.lang.String, yz5.a):void");
    }

    @Override // d26.l0, y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        v06.a.a(this.f226021b.f17515a.f17491i, location, this.f226026g, name);
        return super.e(name, location);
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        java.util.Collection i17 = i(kindFilter, nameFilter, w06.d.f441949g);
        java.lang.Iterable iterable = this.f226021b.f17515a.f17493k;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((q06.c) it.next()).b(this.f226028i));
        }
        return kz5.n0.t0(i17, arrayList);
    }

    @Override // d26.l0
    public void h(java.util.Collection result, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
    }

    @Override // d26.l0
    public n16.b l(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return new n16.b(this.f226028i, name);
    }

    @Override // d26.l0
    public java.util.Set n() {
        return kz5.r0.f314002d;
    }

    @Override // d26.l0
    public java.util.Set o() {
        return kz5.r0.f314002d;
    }

    @Override // d26.l0
    public java.util.Set p() {
        return kz5.r0.f314002d;
    }

    @Override // d26.l0
    public boolean q(n16.g name) {
        boolean z17;
        kotlin.jvm.internal.o.g(name, "name");
        if (super.q(name)) {
            return true;
        }
        java.lang.Iterable iterable = this.f226021b.f17515a.f17493k;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((q06.c) it.next()).a(this.f226028i, name)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }

    public java.lang.String toString() {
        return this.f226027h;
    }
}
