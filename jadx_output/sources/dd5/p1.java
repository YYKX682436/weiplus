package dd5;

/* loaded from: classes9.dex */
public final class p1 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.p1 f229243b = new dd5.p1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229244c = dd5.n1.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229245d = dd5.m1.f229220q;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229246e = kz5.z.D0(new java.lang.Integer[]{3, 13, 23, 33, 39});

    @Override // uc5.p
    public java.util.Set b() {
        return f229246e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229244c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229245d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return g45.c.a(simpleMsgInfo);
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(f229246e.contains(java.lang.Integer.valueOf(i17)));
    }
}
