package dd5;

/* loaded from: classes9.dex */
public final class z extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.z f229347b = new dd5.z();

    /* renamed from: c, reason: collision with root package name */
    public static final ad5.l0[] f229348c = {ad5.f.f3249a, ad5.d.f3242a};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f229349d = dd5.x.class;

    /* renamed from: e, reason: collision with root package name */
    public static final uc5.n f229350e = dd5.w.f229322p;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f229351f = kz5.z.D0(new java.lang.Integer[]{115, 124});

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f229352g = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229352g;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229349d;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229350e;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return kz5.c0.i(115, 124).contains(java.lang.Integer.valueOf(simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5)));
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && f229351f.contains(java.lang.Integer.valueOf(i18)));
    }
}
