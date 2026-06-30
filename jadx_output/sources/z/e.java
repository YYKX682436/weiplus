package z;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z.w2 f468630a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f468631b;

    /* renamed from: c, reason: collision with root package name */
    public final z.r f468632c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f468633d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f468634e;

    /* renamed from: f, reason: collision with root package name */
    public final z.i1 f468635f;

    /* renamed from: g, reason: collision with root package name */
    public final z.p1 f468636g;

    /* renamed from: h, reason: collision with root package name */
    public final z.w f468637h;

    /* renamed from: i, reason: collision with root package name */
    public final z.w f468638i;

    /* renamed from: j, reason: collision with root package name */
    public final z.w f468639j;

    /* renamed from: k, reason: collision with root package name */
    public final z.w f468640k;

    public e(java.lang.Object obj, z.w2 typeConverter, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        this.f468630a = typeConverter;
        this.f468631b = obj2;
        this.f468632c = new z.r(typeConverter, obj, null, 0L, 0L, false, 60, null);
        this.f468633d = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f468634e = n0.s4.c(obj, null, 2, null);
        this.f468635f = new z.i1();
        this.f468636g = new z.p1(0.0f, 0.0f, obj2, 3, null);
        z.w wVar = (z.w) ((z.x2) typeConverter).f468873a.invoke(obj);
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            wVar.e(i17, Float.NEGATIVE_INFINITY);
        }
        this.f468637h = wVar;
        z.w wVar2 = (z.w) ((z.x2) this.f468630a).f468873a.invoke(obj);
        int b18 = wVar2.b();
        for (int i18 = 0; i18 < b18; i18++) {
            wVar2.e(i18, Float.POSITIVE_INFINITY);
        }
        this.f468638i = wVar2;
        this.f468639j = wVar;
        this.f468640k = wVar2;
    }

    public static final java.lang.Object a(z.e eVar, java.lang.Object obj) {
        z.w wVar = eVar.f468637h;
        z.w wVar2 = eVar.f468639j;
        boolean b17 = kotlin.jvm.internal.o.b(wVar2, wVar);
        z.w wVar3 = eVar.f468640k;
        if (b17 && kotlin.jvm.internal.o.b(wVar3, eVar.f468638i)) {
            return obj;
        }
        z.x2 x2Var = (z.x2) eVar.f468630a;
        z.w wVar4 = (z.w) x2Var.f468873a.invoke(obj);
        int b18 = wVar4.b();
        boolean z17 = false;
        for (int i17 = 0; i17 < b18; i17++) {
            if (wVar4.a(i17) < wVar2.a(i17) || wVar4.a(i17) > wVar3.a(i17)) {
                wVar4.e(i17, e06.p.e(wVar4.a(i17), wVar2.a(i17), wVar3.a(i17)));
                z17 = true;
            }
        }
        return z17 ? x2Var.f468874b.invoke(wVar4) : obj;
    }

    public static final void b(z.e eVar) {
        z.r rVar = eVar.f468632c;
        rVar.f468812f.d();
        rVar.f468813g = Long.MIN_VALUE;
        ((n0.q4) eVar.f468633d).setValue(java.lang.Boolean.FALSE);
    }

    public static java.lang.Object c(z.e eVar, java.lang.Object obj, z.p pVar, java.lang.Object obj2, yz5.l lVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj3) {
        z.p animationSpec = (i17 & 2) != 0 ? eVar.f468636g : pVar;
        java.lang.Object invoke = (i17 & 4) != 0 ? ((z.x2) eVar.f468630a).f468874b.invoke(eVar.f468632c.f468812f) : obj2;
        yz5.l lVar2 = (i17 & 8) != 0 ? null : lVar;
        java.lang.Object d17 = eVar.d();
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        z.w2 typeConverter = eVar.f468630a;
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        return z.i1.a(eVar.f468635f, null, new z.b(eVar, invoke, new z.a2(animationSpec, typeConverter, d17, obj, (z.w) ((z.x2) typeConverter).f468873a.invoke(invoke)), eVar.f468632c.f468813g, lVar2, null), continuation, 1, null);
    }

    public final java.lang.Object d() {
        return this.f468632c.getValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.f468633d.getValue()).booleanValue();
    }

    public final java.lang.Object f(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = z.i1.a(this.f468635f, null, new z.c(this, obj, null), continuation, 1, null);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    public /* synthetic */ e(java.lang.Object obj, z.w2 w2Var, java.lang.Object obj2, int i17, kotlin.jvm.internal.i iVar) {
        this(obj, w2Var, (i17 & 4) != 0 ? null : obj2);
    }
}
