package m0;

/* loaded from: classes14.dex */
public final class d extends m0.w implements n0.e4 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f322450e;

    /* renamed from: f, reason: collision with root package name */
    public final float f322451f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.e5 f322452g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e5 f322453h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.l0 f322454i;

    public d(boolean z17, float f17, n0.e5 e5Var, n0.e5 e5Var2, kotlin.jvm.internal.i iVar) {
        super(z17, e5Var2);
        this.f322450e = z17;
        this.f322451f = f17;
        this.f322452g = e5Var;
        this.f322453h = e5Var2;
        this.f322454i = new x0.l0();
    }

    @Override // a0.s1
    public void a(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        long j17 = ((e1.y) this.f322452g.getValue()).f246322a;
        ((u1.o0) fVar).b();
        f(fVar, this.f322451f, j17);
        java.util.Iterator it = ((x0.a0) this.f322454i.entrySet()).iterator();
        while (it.hasNext()) {
            m0.r rVar = (m0.r) ((java.util.Map.Entry) it.next()).getValue();
            float f17 = ((m0.j) this.f322453h.getValue()).f322478d;
            if (!(f17 == 0.0f)) {
                long b17 = e1.y.b(j17, f17, 0.0f, 0.0f, 0.0f, 14, null);
                rVar.getClass();
                if (rVar.f322498d == null) {
                    long a17 = fVar.a();
                    float f18 = m0.s.f322507a;
                    rVar.f322498d = java.lang.Float.valueOf(java.lang.Math.max(d1.k.d(a17), d1.k.b(a17)) * 0.3f);
                }
                java.lang.Float f19 = rVar.f322499e;
                boolean z17 = rVar.f322497c;
                if (f19 == null) {
                    float f27 = rVar.f322496b;
                    rVar.f322499e = java.lang.Float.isNaN(f27) ? java.lang.Float.valueOf(m0.s.a(fVar, z17, fVar.a())) : java.lang.Float.valueOf(fVar.R(f27));
                }
                if (rVar.f322495a == null) {
                    rVar.f322495a = new d1.e(fVar.r());
                }
                if (rVar.f322500f == null) {
                    rVar.f322500f = new d1.e(d1.f.a(d1.k.d(fVar.a()) / 2.0f, d1.k.b(fVar.a()) / 2.0f));
                }
                float floatValue = (!((java.lang.Boolean) ((n0.q4) rVar.f322506l).getValue()).booleanValue() || ((java.lang.Boolean) ((n0.q4) rVar.f322505k).getValue()).booleanValue()) ? ((java.lang.Number) rVar.f322501g.d()).floatValue() : 1.0f;
                java.lang.Float f28 = rVar.f322498d;
                kotlin.jvm.internal.o.d(f28);
                float floatValue2 = f28.floatValue();
                java.lang.Float f29 = rVar.f322499e;
                kotlin.jvm.internal.o.d(f29);
                float a18 = q2.a.a(floatValue2, f29.floatValue(), ((java.lang.Number) rVar.f322502h.d()).floatValue());
                d1.e eVar = rVar.f322495a;
                kotlin.jvm.internal.o.d(eVar);
                float c17 = d1.e.c(eVar.f225627a);
                d1.e eVar2 = rVar.f322500f;
                kotlin.jvm.internal.o.d(eVar2);
                float c18 = d1.e.c(eVar2.f225627a);
                z.e eVar3 = rVar.f322503i;
                float a19 = q2.a.a(c17, c18, ((java.lang.Number) eVar3.d()).floatValue());
                d1.e eVar4 = rVar.f322495a;
                kotlin.jvm.internal.o.d(eVar4);
                float d17 = d1.e.d(eVar4.f225627a);
                d1.e eVar5 = rVar.f322500f;
                kotlin.jvm.internal.o.d(eVar5);
                long a27 = d1.f.a(a19, q2.a.a(d17, d1.e.d(eVar5.f225627a), ((java.lang.Number) eVar3.d()).floatValue()));
                long b18 = e1.y.b(b17, e1.y.d(b17) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
                if (z17) {
                    float d18 = d1.k.d(fVar.a());
                    float b19 = d1.k.b(fVar.a());
                    g1.b bVar = (g1.b) fVar.p();
                    long b27 = bVar.b();
                    bVar.a().c();
                    ((g1.d) bVar.f267504a).a(0.0f, 0.0f, d18, b19, 1);
                    g1.h.b(fVar, b18, a18, a27, 0.0f, null, null, 0, 120, null);
                    bVar.a().b();
                    bVar.c(b27);
                } else {
                    g1.h.b(fVar, b18, a18, a27, 0.0f, null, null, 0, 120, null);
                }
            }
        }
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
        this.f322454i.clear();
    }

    @Override // n0.e4
    public void d() {
        this.f322454i.clear();
    }

    @Override // m0.w
    public void e(c0.r interaction, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(interaction, "interaction");
        kotlin.jvm.internal.o.g(scope, "scope");
        x0.l0 l0Var = this.f322454i;
        java.util.Iterator it = ((x0.a0) l0Var.f450904e).iterator();
        while (it.hasNext()) {
            m0.r rVar = (m0.r) ((java.util.Map.Entry) it.next()).getValue();
            ((n0.q4) rVar.f322506l).setValue(java.lang.Boolean.TRUE);
            ((kotlinx.coroutines.a0) rVar.f322504j).U(jz5.f0.f302826a);
        }
        boolean z17 = this.f322450e;
        m0.r rVar2 = new m0.r(z17 ? new d1.e(interaction.f36943a) : null, this.f322451f, z17, null);
        l0Var.put(interaction, rVar2);
        kotlinx.coroutines.l.d(scope, null, null, new m0.c(rVar2, this, interaction, null), 3, null);
    }

    @Override // m0.w
    public void g(c0.r interaction) {
        kotlin.jvm.internal.o.g(interaction, "interaction");
        m0.r rVar = (m0.r) this.f322454i.get(interaction);
        if (rVar != null) {
            ((n0.q4) rVar.f322506l).setValue(java.lang.Boolean.TRUE);
            ((kotlinx.coroutines.a0) rVar.f322504j).U(jz5.f0.f302826a);
        }
    }
}
