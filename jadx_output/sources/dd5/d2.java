package dd5;

/* loaded from: classes9.dex */
public final class d2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.d2 f229116b = new dd5.d2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229117c = dd5.b2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229118d = dd5.a2.f229084p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229119e = kz5.o1.c(48);

    @Override // uc5.p
    public java.util.Set b() {
        return f229119e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229117c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229118d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 4) == 48;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 48);
    }
}
