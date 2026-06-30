package dd5;

/* loaded from: classes9.dex */
public final class z1 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.z1 f229357b = new dd5.z1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229358c = dd5.y1.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229359d = dd5.x1.f229334p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229360e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229360e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229358c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229359d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 68;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 68);
    }
}
