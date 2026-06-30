package dd5;

/* loaded from: classes9.dex */
public final class l2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.l2 f229203b = new dd5.l2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229204c = dd5.j2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229205d = dd5.i2.f229172p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229206e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229206e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229204c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229205d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        return simpleMsgInfo.getInteger(simpleMsgInfo.f345617d + 5) == 24;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && i18 == 24);
    }
}
