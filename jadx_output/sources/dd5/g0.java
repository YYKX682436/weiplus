package dd5;

/* loaded from: classes9.dex */
public final class g0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.g0 f229146b = new dd5.g0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229147c = dd5.f0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229148d = dd5.e0.f229122p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229149e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229149e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229147c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229148d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 27;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 27);
    }
}
