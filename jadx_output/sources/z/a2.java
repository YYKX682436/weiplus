package z;

/* loaded from: classes13.dex */
public final class a2 implements z.l {

    /* renamed from: a, reason: collision with root package name */
    public final z.r3 f468570a;

    /* renamed from: b, reason: collision with root package name */
    public final z.w2 f468571b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f468572c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f468573d;

    /* renamed from: e, reason: collision with root package name */
    public final z.w f468574e;

    /* renamed from: f, reason: collision with root package name */
    public final z.w f468575f;

    /* renamed from: g, reason: collision with root package name */
    public final z.w f468576g;

    /* renamed from: h, reason: collision with root package name */
    public final long f468577h;

    /* renamed from: i, reason: collision with root package name */
    public final z.w f468578i;

    public /* synthetic */ a2(z.p pVar, z.w2 w2Var, java.lang.Object obj, java.lang.Object obj2, z.w wVar, int i17, kotlin.jvm.internal.i iVar) {
        this(pVar, w2Var, obj, obj2, (i17 & 16) != 0 ? null : wVar);
    }

    @Override // z.l
    public boolean a() {
        return this.f468570a.a();
    }

    @Override // z.l
    public boolean b(long j17) {
        return z.k.a(this, j17);
    }

    @Override // z.l
    public long c() {
        return this.f468577h;
    }

    @Override // z.l
    public z.w2 d() {
        return this.f468571b;
    }

    @Override // z.l
    public java.lang.Object e(long j17) {
        return !z.k.a(this, j17) ? ((z.x2) this.f468571b).f468874b.invoke(this.f468570a.c(j17, this.f468574e, this.f468575f, this.f468576g)) : this.f468573d;
    }

    @Override // z.l
    public java.lang.Object f() {
        return this.f468573d;
    }

    @Override // z.l
    public z.w g(long j17) {
        return !z.k.a(this, j17) ? this.f468570a.f(j17, this.f468574e, this.f468575f, this.f468576g) : this.f468578i;
    }

    public java.lang.String toString() {
        return "TargetBasedAnimation: " + this.f468572c + " -> " + this.f468573d + ",initial velocity: " + this.f468576g + ", duration: " + (c() / 1000000) + " ms";
    }

    public a2(z.p animationSpec, z.w2 typeConverter, java.lang.Object obj, java.lang.Object obj2, z.w wVar) {
        z.w c17;
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        z.r3 animationSpec2 = animationSpec.a(typeConverter);
        kotlin.jvm.internal.o.g(animationSpec2, "animationSpec");
        this.f468570a = animationSpec2;
        this.f468571b = typeConverter;
        this.f468572c = obj;
        this.f468573d = obj2;
        yz5.l lVar = ((z.x2) typeConverter).f468873a;
        z.w wVar2 = (z.w) lVar.invoke(obj);
        this.f468574e = wVar2;
        z.w wVar3 = (z.w) lVar.invoke(obj2);
        this.f468575f = wVar3;
        if (wVar != null) {
            c17 = z.x.a(wVar);
        } else {
            z.w wVar4 = (z.w) lVar.invoke(obj);
            kotlin.jvm.internal.o.g(wVar4, "<this>");
            c17 = wVar4.c();
        }
        this.f468576g = c17;
        this.f468577h = animationSpec2.d(wVar2, wVar3, c17);
        this.f468578i = animationSpec2.b(wVar2, wVar3, c17);
    }
}
