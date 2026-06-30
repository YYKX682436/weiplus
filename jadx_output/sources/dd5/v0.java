package dd5;

/* loaded from: classes9.dex */
public final class v0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.v0 f229306b = new dd5.v0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229307c = dd5.u0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229308d = dd5.t0.f229289p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229309e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229309e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229307c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229308d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        return simpleMsgInfo.getInteger(i17 + 5) == 119 || simpleMsgInfo.getInteger(i17 + 5) == 120;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && (i18 == 119 || i18 == 120));
    }
}
