package d0;

/* loaded from: classes14.dex */
public final class i3 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f225150d;

    /* renamed from: e, reason: collision with root package name */
    public final float f225151e;

    public i3(float f17, float f18, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        super(lVar);
        this.f225150d = f17;
        this.f225151e = f18;
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
        int k17 = measurable.k(i17);
        float f17 = this.f225150d;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return k17 < G ? G : k17;
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        int i18 = measurable.i(i17);
        float f17 = this.f225151e;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return i18 < G ? G : i18;
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t measurable, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        int j17 = measurable.j(i17);
        float f17 = this.f225151e;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return j17 < G ? G : j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof d0.i3)) {
            return false;
        }
        d0.i3 i3Var = (d0.i3) obj;
        return p2.h.a(this.f225150d, i3Var.f225150d) && p2.h.a(this.f225151e, i3Var.f225151e);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        int j18;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        float f17 = this.f225150d;
        int i17 = 0;
        if (p2.h.a(f17, Float.NaN) || p2.c.j(j17) != 0) {
            j18 = p2.c.j(j17);
        } else {
            j18 = measure.G(f17);
            int h17 = p2.c.h(j17);
            if (j18 > h17) {
                j18 = h17;
            }
            if (j18 < 0) {
                j18 = 0;
            }
        }
        int h18 = p2.c.h(j17);
        float f18 = this.f225151e;
        if (p2.h.a(f18, Float.NaN) || p2.c.i(j17) != 0) {
            i17 = p2.c.i(j17);
        } else {
            int G = measure.G(f18);
            int g17 = p2.c.g(j17);
            if (G > g17) {
                G = g17;
            }
            if (G >= 0) {
                i17 = G;
            }
        }
        s1.o1 m17 = measurable.m(p2.d.a(j18, h18, i17, p2.c.g(j17)));
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new d0.h3(m17), 4, null);
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f225150d) * 31) + java.lang.Float.hashCode(this.f225151e);
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
        int l17 = measurable.l(i17);
        float f17 = this.f225150d;
        int G = !p2.h.a(f17, Float.NaN) ? uVar.G(f17) : 0;
        return l17 < G ? G : l17;
    }
}
