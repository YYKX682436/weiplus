package dd5;

/* loaded from: classes9.dex */
public final class m0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.m0 f229216b = new dd5.m0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229217c = dd5.l0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229218d = dd5.k0.f229188p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229219e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229219e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229217c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229218d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 15;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 15);
    }
}
