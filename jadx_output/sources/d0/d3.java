package d0;

/* loaded from: classes14.dex */
public final class d3 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f225102d;

    /* renamed from: e, reason: collision with root package name */
    public final float f225103e;

    /* renamed from: f, reason: collision with root package name */
    public final float f225104f;

    /* renamed from: g, reason: collision with root package name */
    public final float f225105g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f225106h;

    public /* synthetic */ d3(float f17, float f18, float f19, float f27, boolean z17, yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? Float.NaN : f17, (i17 & 2) != 0 ? Float.NaN : f18, (i17 & 4) != 0 ? Float.NaN : f19, (i17 & 8) != 0 ? Float.NaN : f27, z17, lVar, null);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        long a17 = a(uVar);
        return p2.c.f(a17) ? p2.c.h(a17) : p2.d.e(a17, measurable.k(i17));
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        long a17 = a(uVar);
        return p2.c.e(a17) ? p2.c.g(a17) : p2.d.d(a17, measurable.i(i17));
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        long a17 = a(uVar);
        return p2.c.e(a17) ? p2.c.g(a17) : p2.d.d(a17, measurable.j(i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(p2.f r8) {
        /*
            r7 = this;
            float r0 = r7.f225104f
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r2 = p2.h.a(r0, r1)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            if (r2 != 0) goto L27
            p2.h r2 = new p2.h
            r2.<init>(r0)
            float r0 = (float) r4
            p2.h r5 = new p2.h
            r5.<init>(r0)
            int r0 = r2.compareTo(r5)
            if (r0 >= 0) goto L20
            r2 = r5
        L20:
            float r0 = r2.f351380d
            int r0 = r8.G(r0)
            goto L28
        L27:
            r0 = r3
        L28:
            float r2 = r7.f225105g
            boolean r5 = p2.h.a(r2, r1)
            if (r5 != 0) goto L49
            p2.h r5 = new p2.h
            r5.<init>(r2)
            float r2 = (float) r4
            p2.h r6 = new p2.h
            r6.<init>(r2)
            int r2 = r5.compareTo(r6)
            if (r2 >= 0) goto L42
            r5 = r6
        L42:
            float r2 = r5.f351380d
            int r2 = r8.G(r2)
            goto L4a
        L49:
            r2 = r3
        L4a:
            float r5 = r7.f225102d
            boolean r6 = p2.h.a(r5, r1)
            if (r6 != 0) goto L5f
            int r5 = r8.G(r5)
            if (r5 <= r0) goto L59
            r5 = r0
        L59:
            if (r5 >= 0) goto L5c
            r5 = r4
        L5c:
            if (r5 == r3) goto L5f
            goto L60
        L5f:
            r5 = r4
        L60:
            float r6 = r7.f225103e
            boolean r1 = p2.h.a(r6, r1)
            if (r1 != 0) goto L75
            int r8 = r8.G(r6)
            if (r8 <= r2) goto L6f
            r8 = r2
        L6f:
            if (r8 >= 0) goto L72
            r8 = r4
        L72:
            if (r8 == r3) goto L75
            r4 = r8
        L75:
            long r0 = p2.d.a(r5, r0, r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d3.a(p2.f):long");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof d0.d3)) {
            return false;
        }
        d0.d3 d3Var = (d0.d3) obj;
        return p2.h.a(this.f225102d, d3Var.f225102d) && p2.h.a(this.f225103e, d3Var.f225103e) && p2.h.a(this.f225104f, d3Var.f225104f) && p2.h.a(this.f225105g, d3Var.f225105g) && this.f225106h == d3Var.f225106h;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        int j18;
        int h17;
        int i17;
        int g17;
        long a17;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        long a18 = a(measure);
        if (this.f225106h) {
            a17 = p2.d.a(e06.p.f(p2.c.j(a18), p2.c.j(j17), p2.c.h(j17)), e06.p.f(p2.c.h(a18), p2.c.j(j17), p2.c.h(j17)), e06.p.f(p2.c.i(a18), p2.c.i(j17), p2.c.g(j17)), e06.p.f(p2.c.g(a18), p2.c.i(j17), p2.c.g(j17)));
        } else {
            if (p2.h.a(this.f225102d, Float.NaN)) {
                j18 = p2.c.j(j17);
                int h18 = p2.c.h(a18);
                if (j18 > h18) {
                    j18 = h18;
                }
            } else {
                j18 = p2.c.j(a18);
            }
            if (p2.h.a(this.f225104f, Float.NaN)) {
                h17 = p2.c.h(j17);
                int j19 = p2.c.j(a18);
                if (h17 < j19) {
                    h17 = j19;
                }
            } else {
                h17 = p2.c.h(a18);
            }
            if (p2.h.a(this.f225103e, Float.NaN)) {
                i17 = p2.c.i(j17);
                int g18 = p2.c.g(a18);
                if (i17 > g18) {
                    i17 = g18;
                }
            } else {
                i17 = p2.c.i(a18);
            }
            if (p2.h.a(this.f225105g, Float.NaN)) {
                g17 = p2.c.g(j17);
                int i18 = p2.c.i(a18);
                if (g17 < i18) {
                    g17 = i18;
                }
            } else {
                g17 = p2.c.g(a18);
            }
            a17 = p2.d.a(j18, h17, i17, g17);
        }
        s1.o1 m17 = measurable.m(a17);
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new d0.c3(m17), 4, null);
    }

    public int hashCode() {
        return ((((((java.lang.Float.hashCode(this.f225102d) * 31) + java.lang.Float.hashCode(this.f225103e)) * 31) + java.lang.Float.hashCode(this.f225104f)) * 31) + java.lang.Float.hashCode(this.f225105g)) * 31;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        long a17 = a(uVar);
        return p2.c.f(a17) ? p2.c.h(a17) : p2.d.e(a17, measurable.l(i17));
    }

    public d3(float f17, float f18, float f19, float f27, boolean z17, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        super(lVar);
        this.f225102d = f17;
        this.f225103e = f18;
        this.f225104f = f19;
        this.f225105g = f27;
        this.f225106h = z17;
    }
}
