package h26;

/* loaded from: classes16.dex */
public final class a extends r06.t {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(n16.g r19) {
        /*
            r18 = this;
            java.lang.String r0 = "name"
            r3 = r19
            kotlin.jvm.internal.o.g(r3, r0)
            h26.m r0 = h26.m.f278374a
            r0.getClass()
            o06.v0 r2 = h26.m.f278375b
            o06.t0 r4 = o06.t0.f341987g
            o06.h r5 = o06.h.f341960d
            kz5.p0 r10 = kz5.p0.f313996d
            o06.x1 r17 = o06.x1.f342004a
            r8 = 0
            e26.c0 r9 = e26.u.f247037e
            r1 = r18
            r3 = r19
            r6 = r10
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            int r1 = p06.k.Z0
            p06.k r14 = p06.i.f350765a
            r15 = 1
            r06.r r1 = new r06.r
            r13 = 0
            o06.c r16 = o06.c.DECLARATION
            r11 = r1
            r12 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            o06.g0 r2 = o06.f0.f341944d
            r1.G0(r10, r2)
            h26.i r2 = h26.i.f278340i
            n16.g r3 = r1.getName()
            java.lang.String r3 = r3.f334169d
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            java.lang.String r4 = ""
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            h26.h r2 = h26.m.b(r2, r3)
            h26.j r3 = new h26.j
            h26.l r9 = h26.l.B
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            h26.k r7 = r0.d(r9, r5)
            java.lang.String[] r12 = new java.lang.String[r4]
            r11 = 0
            r6 = r3
            r8 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.C0(r3)
            java.util.Set r0 = kz5.o1.c(r1)
            r3 = r18
            r3.u0(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h26.a.<init>(n16.g):void");
    }

    @Override // r06.e, r06.s0
    public y16.s G(f26.q2 typeSubstitution, g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(typeSubstitution, "typeSubstitution");
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        h26.i iVar = h26.i.f278340i;
        java.lang.String str = getName().f334169d;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        return h26.m.b(iVar, str, typeSubstitution.toString());
    }

    @Override // r06.e, o06.a2
    public o06.n d(f26.v2 substitutor) {
        kotlin.jvm.internal.o.g(substitutor, "substitutor");
        return this;
    }

    @Override // r06.e
    /* renamed from: s0 */
    public o06.g d(f26.v2 substitutor) {
        kotlin.jvm.internal.o.g(substitutor, "substitutor");
        return this;
    }

    @Override // r06.t
    public java.lang.String toString() {
        java.lang.String h17 = getName().h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        return h17;
    }
}
