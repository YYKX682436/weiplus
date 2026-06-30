package r06;

/* loaded from: classes15.dex */
public class k1 extends y16.t {

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f368477b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.c f368478c;

    public k1(o06.v0 moduleDescriptor, n16.c fqName) {
        kotlin.jvm.internal.o.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        this.f368477b = moduleDescriptor;
        this.f368478c = fqName;
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        return kz5.r0.f314002d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (((java.lang.Boolean) e26.b0.a(r3.f368498i, r3, r06.o0.f368494n[1])).booleanValue() != false) goto L20;
     */
    @Override // y16.t, y16.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection f(y16.i r8, yz5.l r9) {
        /*
            r7 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.o.g(r9, r0)
            int r0 = y16.i.f458948h
            boolean r0 = r8.a(r0)
            kz5.p0 r1 = kz5.p0.f313996d
            if (r0 != 0) goto L15
            return r1
        L15:
            n16.c r0 = r7.f368478c
            boolean r2 = r0.d()
            if (r2 == 0) goto L28
            y16.e r2 = y16.e.f458935a
            java.util.List r8 = r8.f458960a
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L28
            return r1
        L28:
            o06.v0 r8 = r7.f368477b
            java.util.Collection r1 = r8.l(r0, r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r1.next()
            n16.c r3 = (n16.c) r3
            n16.g r3 = r3.f()
            java.lang.String r4 = "shortName(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            java.lang.Object r4 = r9.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3b
            boolean r4 = r3.f334170e
            if (r4 == 0) goto L61
            goto L7e
        L61:
            n16.c r3 = r0.c(r3)
            o06.k1 r3 = r8.Q(r3)
            r06.o0 r3 = (r06.o0) r3
            e26.x r4 = r3.f368498i
            f06.v[] r5 = r06.o0.f368494n
            r6 = 1
            r5 = r5[r6]
            java.lang.Object r4 = e26.b0.a(r4, r3, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7f
        L7e:
            r3 = 0
        L7f:
            o26.a.a(r2, r3)
            goto L3b
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r06.k1.f(y16.i, yz5.l):java.util.Collection");
    }

    public java.lang.String toString() {
        return "subpackages of " + this.f368478c + " from " + this.f368477b;
    }
}
