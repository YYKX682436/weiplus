package dd5;

/* loaded from: classes9.dex */
public final class k1 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.k1 f229189b = new dd5.k1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229190c = dd5.i1.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229191d = dd5.h1.f229160p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229192e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229192e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229190c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229191d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 82;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 82);
    }
}
