package dd5;

/* loaded from: classes9.dex */
public final class f extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.f f229130b = new dd5.f();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229131c = dd5.e.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229132d = dd5.d.f229109p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229133e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229133e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229131c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229132d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 7;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 7);
    }
}
