package dd5;

/* loaded from: classes9.dex */
public final class s0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.s0 f229279b = new dd5.s0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229280c = dd5.q0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229281d = dd5.p0.f229242p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229282e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229282e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229280c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229281d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return ez.v0.f257777a.i(java.lang.Integer.valueOf(simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5)));
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && ez.v0.f257777a.i(java.lang.Integer.valueOf(i18)));
    }
}
