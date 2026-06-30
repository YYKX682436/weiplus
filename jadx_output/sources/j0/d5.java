package j0;

/* loaded from: classes14.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.k1 f296265a;

    /* renamed from: b, reason: collision with root package name */
    public s1.z f296266b;

    /* renamed from: c, reason: collision with root package name */
    public s1.z f296267c;

    public d5(a2.k1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f296265a = value;
    }

    public final long a(long j17) {
        d1.g gVar;
        s1.z zVar = this.f296266b;
        d1.g gVar2 = d1.g.f225628e;
        if (zVar != null) {
            if (((u1.c1) zVar).p0()) {
                s1.z zVar2 = this.f296267c;
                gVar = null;
                if (zVar2 != null) {
                    gVar = s1.y.a(zVar2, zVar, false, 2, null);
                }
            } else {
                gVar = gVar2;
            }
            if (gVar != null) {
                gVar2 = gVar;
            }
        }
        float c17 = d1.e.c(j17);
        float f17 = gVar2.f225629a;
        if (c17 >= f17) {
            float c18 = d1.e.c(j17);
            f17 = gVar2.f225631c;
            if (c18 <= f17) {
                f17 = d1.e.c(j17);
            }
        }
        float d17 = d1.e.d(j17);
        float f18 = gVar2.f225630b;
        if (d17 >= f18) {
            float d18 = d1.e.d(j17);
            f18 = gVar2.f225632d;
            if (d18 <= f18) {
                f18 = d1.e.d(j17);
            }
        }
        return d1.f.a(f17, f18);
    }

    public final int b(long j17, boolean z17) {
        if (z17) {
            j17 = a(j17);
        }
        return this.f296265a.l(c(j17));
    }

    public final long c(long j17) {
        d1.e eVar;
        s1.z zVar = this.f296266b;
        if (zVar == null) {
            return j17;
        }
        s1.z zVar2 = this.f296267c;
        if (zVar2 != null) {
            u1.c1 c1Var = (u1.c1) zVar;
            eVar = new d1.e((c1Var.p0() && ((u1.c1) zVar2).p0()) ? c1Var.s0(zVar2, j17) : j17);
        } else {
            eVar = null;
        }
        return eVar != null ? eVar.f225627a : j17;
    }
}
