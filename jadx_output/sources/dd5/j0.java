package dd5;

/* loaded from: classes9.dex */
public final class j0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.j0 f229177b = new dd5.j0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229178c = dd5.i0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229179d = dd5.h0.f229159p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229180e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229180e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229178c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229179d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        return simpleMsgInfo.getInteger(i17 + 5) == 26 || simpleMsgInfo.getInteger(i17 + 5) == 97;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && (i18 == 26 || i18 == 97));
    }
}
