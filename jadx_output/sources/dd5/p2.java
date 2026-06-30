package dd5;

/* loaded from: classes9.dex */
public final class p2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.p2 f229247b = new dd5.p2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229248c = dd5.n2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229249d = dd5.m2.f229221p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229250e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229250e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229248c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229249d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 93;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 93);
    }
}
