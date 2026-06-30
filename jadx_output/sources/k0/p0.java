package k0;

/* loaded from: classes14.dex */
public final class p0 extends k0.j {

    /* renamed from: h, reason: collision with root package name */
    public final g2.e0 f302955h;

    /* renamed from: i, reason: collision with root package name */
    public final j0.d5 f302956i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(g2.e0 currentValue, g2.v offsetMapping, j0.d5 d5Var, k0.i1 state) {
        super(currentValue.f267693a, currentValue.f267694b, d5Var != null ? d5Var.f296265a : null, offsetMapping, state, null);
        kotlin.jvm.internal.o.g(currentValue, "currentValue");
        kotlin.jvm.internal.o.g(offsetMapping, "offsetMapping");
        kotlin.jvm.internal.o.g(state, "state");
        this.f302955h = currentValue;
        this.f302956i = d5Var;
    }

    public final java.util.List x(yz5.l or6) {
        kotlin.jvm.internal.o.g(or6, "or");
        if (!a2.m1.b(this.f302931f)) {
            return kz5.c0.i(new g2.a("", 0), new g2.b0(a2.m1.f(this.f302931f), a2.m1.f(this.f302931f)));
        }
        g2.d dVar = (g2.d) or6.invoke(this);
        if (dVar != null) {
            return kz5.b0.c(dVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(j0.d5 r6, int r7) {
        /*
            r5 = this;
            s1.z r0 = r6.f296266b
            if (r0 == 0) goto L11
            s1.z r1 = r6.f296267c
            r2 = 0
            if (r1 == 0) goto Lf
            r3 = 0
            r4 = 2
            d1.g r2 = s1.y.a(r1, r0, r3, r4, r2)
        Lf:
            if (r2 != 0) goto L13
        L11:
            d1.g r2 = d1.g.f225628e
        L13:
            g2.e0 r0 = r5.f302955h
            long r0 = r0.f267694b
            int r0 = a2.m1.c(r0)
            g2.v r1 = r5.f302929d
            g2.t r1 = (g2.t) r1
            r1.getClass()
            a2.k1 r6 = r6.f296265a
            d1.g r0 = r6.c(r0)
            float r3 = r2.f225631c
            float r4 = r2.f225629a
            float r3 = r3 - r4
            float r4 = r2.f225632d
            float r2 = r2.f225630b
            float r4 = r4 - r2
            long r2 = d1.l.a(r3, r4)
            float r2 = d1.k.b(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r7 = r0.f225630b
            float r7 = r7 + r2
            float r0 = r0.f225629a
            long r2 = d1.f.a(r0, r7)
            int r6 = r6.l(r2)
            r1.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.p0.y(j0.d5, int):int");
    }
}
