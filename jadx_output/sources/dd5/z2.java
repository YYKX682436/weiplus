package dd5;

/* loaded from: classes9.dex */
public final class z2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.z2 f229361b = new dd5.z2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229362c = dd5.y2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229363d = dd5.x2.f229335p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229364e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229364e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229362c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229363d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        return simpleMsgInfo.getInteger(i17 + 5) == 5 || simpleMsgInfo.getInteger(i17 + 5) == 4;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && (i18 == 5 || i18 == 4));
    }
}
