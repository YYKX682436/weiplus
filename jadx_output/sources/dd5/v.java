package dd5;

/* loaded from: classes9.dex */
public final class v extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.v f229302b = new dd5.v();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229303c = dd5.t.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229304d = dd5.s.f229278p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229305e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229305e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229303c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229304d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 111;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 111);
    }
}
