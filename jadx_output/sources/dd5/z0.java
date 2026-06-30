package dd5;

/* loaded from: classes9.dex */
public final class z0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.z0 f229353b = new dd5.z0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229354c = dd5.x0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229355d = dd5.w0.f229323p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229356e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229356e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229354c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229355d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 50;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 50);
    }
}
