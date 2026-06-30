package dd5;

/* loaded from: classes9.dex */
public final class h2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.h2 f229161b = new dd5.h2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229162c = dd5.f2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229163d = dd5.e2.f229124p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229164e = kz5.z.D0(new java.lang.Integer[]{76, 92, 3});

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f229165f = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229165f;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229162c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229163d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return kz5.c0.i(76, 92, 3).contains(java.lang.Integer.valueOf(simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5)));
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && f229164e.contains(java.lang.Integer.valueOf(i18)));
    }
}
