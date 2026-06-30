package dd5;

/* loaded from: classes9.dex */
public final class r extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.r f229267b = new dd5.r();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229268c = dd5.p.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229269d = dd5.o.f229233p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229270e = kz5.z.D0(new java.lang.Integer[]{42, 66});

    @Override // uc5.p
    public java.util.Set b() {
        return f229270e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229268c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229269d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        return simpleMsgInfo.getInteger(i17 + 4) == 42 || simpleMsgInfo.getInteger(i17 + 4) == 66;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 42 || i17 == 66);
    }
}
