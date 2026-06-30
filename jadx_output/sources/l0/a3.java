package l0;

/* loaded from: classes14.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.p f314028a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f314029b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f314030c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f314031d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f314032e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f314033f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f314034g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f314035h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f314036i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f314037j;

    /* renamed from: k, reason: collision with root package name */
    public float f314038k;

    /* renamed from: l, reason: collision with root package name */
    public float f314039l;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f314040m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f314041n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.v2 f314042o;

    /* renamed from: p, reason: collision with root package name */
    public final b0.n1 f314043p;

    public a3(java.lang.Object obj, z.p animationSpec, yz5.l confirmStateChange) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(confirmStateChange, "confirmStateChange");
        this.f314028a = animationSpec;
        this.f314029b = confirmStateChange;
        this.f314030c = n0.s4.c(obj, null, 2, null);
        this.f314031d = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.f314032e = n0.s4.c(valueOf, null, 2, null);
        this.f314033f = n0.s4.c(valueOf, null, 2, null);
        this.f314034g = n0.s4.c(valueOf, null, 2, null);
        this.f314035h = n0.s4.c(null, null, 2, null);
        this.f314036i = n0.s4.c(kz5.q0.f314001d, null, 2, null);
        this.f314037j = kotlinx.coroutines.flow.l.r(new l0.y2(n0.s4.f(new l0.s2(this))), 1);
        this.f314038k = Float.NEGATIVE_INFINITY;
        this.f314039l = Float.POSITIVE_INFINITY;
        this.f314040m = n0.s4.c(l0.z2.f314714d, null, 2, null);
        this.f314041n = n0.s4.c(valueOf, null, 2, null);
        this.f314042o = n0.s4.c(null, null, 2, null);
        this.f314043p = new b0.k(new l0.r2(this));
    }

    public final java.lang.Object a(float f17, z.p pVar, kotlin.coroutines.Continuation continuation) {
        b0.n1 n1Var = this.f314043p;
        l0.o2 o2Var = new l0.o2(this, f17, pVar, null);
        a0.k2 k2Var = a0.k2.Default;
        b0.k kVar = (b0.k) n1Var;
        kVar.getClass();
        java.lang.Object f18 = kotlinx.coroutines.z0.f(new b0.i(kVar, k2Var, o2Var, null), continuation);
        pz5.a aVar = pz5.a.f359186d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (f18 != aVar) {
            f18 = f0Var;
        }
        return f18 == aVar ? f18 : f0Var;
    }

    public final java.lang.Object b() {
        return this.f314030c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r13v17, types: [float] */
    /* JADX WARN: Type inference failed for: r13v64, types: [float] */
    /* JADX WARN: Type inference failed for: r13v66, types: [float] */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Map r13, java.util.Map r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a3.c(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(java.lang.Object obj) {
        ((n0.q4) this.f314030c).setValue(obj);
    }
}
