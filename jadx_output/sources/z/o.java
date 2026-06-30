package z;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final z.w2 f468756a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f468757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f468758c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f468759d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f468760e;

    /* renamed from: f, reason: collision with root package name */
    public z.w f468761f;

    /* renamed from: g, reason: collision with root package name */
    public long f468762g;

    /* renamed from: h, reason: collision with root package name */
    public long f468763h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f468764i;

    public o(java.lang.Object obj, z.w2 typeConverter, z.w initialVelocityVector, long j17, java.lang.Object obj2, long j18, boolean z17, yz5.a onCancel) {
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.o.g(initialVelocityVector, "initialVelocityVector");
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        this.f468756a = typeConverter;
        this.f468757b = obj2;
        this.f468758c = j18;
        this.f468759d = onCancel;
        this.f468760e = n0.s4.c(obj, null, 2, null);
        this.f468761f = z.x.a(initialVelocityVector);
        this.f468762g = j17;
        this.f468763h = Long.MIN_VALUE;
        this.f468764i = n0.s4.c(java.lang.Boolean.valueOf(z17), null, 2, null);
    }

    public final void a() {
        ((n0.q4) this.f468764i).setValue(java.lang.Boolean.FALSE);
        this.f468759d.invoke();
    }

    public final java.lang.Object b() {
        return this.f468760e.getValue();
    }

    public final java.lang.Object c() {
        return ((z.x2) this.f468756a).f468874b.invoke(this.f468761f);
    }

    public final boolean d() {
        return ((java.lang.Boolean) this.f468764i.getValue()).booleanValue();
    }
}
