package z;

/* loaded from: classes14.dex */
public final class q0 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f468788e;

    /* renamed from: f, reason: collision with root package name */
    public final z.w2 f468789f;

    /* renamed from: g, reason: collision with root package name */
    public z.p f468790g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f468791h;

    /* renamed from: i, reason: collision with root package name */
    public z.a2 f468792i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f468793m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f468794n;

    /* renamed from: o, reason: collision with root package name */
    public long f468795o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z.w0 f468796p;

    public q0(z.w0 w0Var, java.lang.Object obj, java.lang.Object obj2, z.w2 typeConverter, z.p animationSpec) {
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        this.f468796p = w0Var;
        this.f468787d = obj;
        this.f468788e = obj2;
        this.f468789f = typeConverter;
        this.f468790g = animationSpec;
        this.f468791h = n0.s4.c(obj, null, 2, null);
        this.f468792i = new z.a2(this.f468790g, typeConverter, this.f468787d, this.f468788e, null, 16, null);
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return this.f468791h.getValue();
    }
}
