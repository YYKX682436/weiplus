package z;

/* loaded from: classes14.dex */
public final class c0 implements z.l {

    /* renamed from: a, reason: collision with root package name */
    public final z.v3 f468606a;

    /* renamed from: b, reason: collision with root package name */
    public final z.w2 f468607b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f468608c;

    /* renamed from: d, reason: collision with root package name */
    public final z.w f468609d;

    /* renamed from: e, reason: collision with root package name */
    public final z.w f468610e;

    /* renamed from: f, reason: collision with root package name */
    public final z.w f468611f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f468612g;

    /* renamed from: h, reason: collision with root package name */
    public final long f468613h;

    public c0(z.d0 animationSpec, z.w2 typeConverter, java.lang.Object obj, z.w initialVelocityVector) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.o.g(initialVelocityVector, "initialVelocityVector");
        z.a4 a4Var = new z.a4(((z.e0) animationSpec).f468641a);
        this.f468606a = a4Var;
        this.f468607b = typeConverter;
        this.f468608c = obj;
        z.x2 x2Var = (z.x2) typeConverter;
        z.w wVar = (z.w) x2Var.f468873a.invoke(obj);
        this.f468609d = wVar;
        this.f468610e = z.x.a(initialVelocityVector);
        this.f468612g = x2Var.f468874b.invoke(a4Var.a(wVar, initialVelocityVector));
        if (a4Var.f468582c == null) {
            a4Var.f468582c = wVar.c();
        }
        z.w wVar2 = a4Var.f468582c;
        if (wVar2 == null) {
            kotlin.jvm.internal.o.o("velocityVector");
            throw null;
        }
        int b17 = wVar2.b();
        long j17 = 0;
        for (int i17 = 0; i17 < b17; i17++) {
            wVar.a(i17);
            j17 = java.lang.Math.max(j17, ((long) (java.lang.Math.exp(((y.y1) a4Var.f468580a).f458484a.b(initialVelocityVector.a(i17)) / (y.l1.f458394a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f468613h = j17;
        z.w a17 = z.x.a(((z.a4) this.f468606a).b(j17, this.f468609d, initialVelocityVector));
        this.f468611f = a17;
        int b18 = a17.b();
        for (int i18 = 0; i18 < b18; i18++) {
            z.w wVar3 = this.f468611f;
            float a18 = wVar3.a(i18);
            this.f468606a.getClass();
            this.f468606a.getClass();
            wVar3.e(i18, e06.p.e(a18, -0.0f, 0.0f));
        }
    }

    @Override // z.l
    public boolean a() {
        return false;
    }

    @Override // z.l
    public boolean b(long j17) {
        return z.k.a(this, j17);
    }

    @Override // z.l
    public long c() {
        return this.f468613h;
    }

    @Override // z.l
    public z.w2 d() {
        return this.f468607b;
    }

    @Override // z.l
    public java.lang.Object e(long j17) {
        if (z.k.a(this, j17)) {
            return this.f468612g;
        }
        yz5.l lVar = ((z.x2) this.f468607b).f468874b;
        z.a4 a4Var = (z.a4) this.f468606a;
        a4Var.getClass();
        z.w initialValue = this.f468609d;
        kotlin.jvm.internal.o.g(initialValue, "initialValue");
        z.w initialVelocity = this.f468610e;
        kotlin.jvm.internal.o.g(initialVelocity, "initialVelocity");
        if (a4Var.f468581b == null) {
            a4Var.f468581b = initialValue.c();
        }
        z.w wVar = a4Var.f468581b;
        java.lang.String str = "valueVector";
        if (wVar == null) {
            kotlin.jvm.internal.o.o("valueVector");
            throw null;
        }
        int b17 = wVar.b();
        int i17 = 0;
        while (i17 < b17) {
            z.w wVar2 = a4Var.f468581b;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o(str);
                throw null;
            }
            float a17 = initialValue.a(i17);
            float a18 = initialVelocity.a(i17);
            y.y1 y1Var = (y.y1) a4Var.f468580a;
            y1Var.getClass();
            long j18 = j17 / 1000000;
            y.j1 a19 = y1Var.f458484a.a(a18);
            java.lang.String str2 = str;
            long j19 = a19.f458376c;
            wVar2.e(i17, a17 + (a19.f458375b * java.lang.Math.signum(a19.f458374a) * y.b.f458309a.a(j19 > 0 ? ((float) j18) / ((float) j19) : 1.0f).f458303a));
            i17++;
            str = str2;
        }
        java.lang.String str3 = str;
        z.w wVar3 = a4Var.f468581b;
        if (wVar3 != null) {
            return lVar.invoke(wVar3);
        }
        kotlin.jvm.internal.o.o(str3);
        throw null;
    }

    @Override // z.l
    public java.lang.Object f() {
        return this.f468612g;
    }

    @Override // z.l
    public z.w g(long j17) {
        if (z.k.a(this, j17)) {
            return this.f468611f;
        }
        return ((z.a4) this.f468606a).b(j17, this.f468609d, this.f468610e);
    }
}
