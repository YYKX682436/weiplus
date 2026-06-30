package dd5;

/* loaded from: classes9.dex */
public final class c1 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.c1 f229100b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229101c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229102d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229103e;

    static {
        dd5.c1 c1Var = new dd5.c1();
        f229100b = c1Var;
        f229101c = dd5.a1.class;
        f229102d = new dd5.c(c1Var.f426539a);
        f229103e = kz5.z.D0(new java.lang.Integer[]{754974769, 1241514033, 1174405169});
    }

    @Override // uc5.p
    public java.util.Set b() {
        return f229103e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229101c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229102d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        if (kotlin.jvm.internal.o.b(f(simpleMsgInfo.getInteger(i17 + 4) & 65535, simpleMsgInfo.getInteger(i17 + 5)), java.lang.Boolean.FALSE)) {
            return false;
        }
        java.lang.String string = simpleMsgInfo.getString(i17 + 13);
        if (!(!r26.n0.N(string))) {
            string = null;
        }
        if (string == null) {
            return false;
        }
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ok(string, simpleMsgInfo.getLong(i17 + 0), simpleMsgInfo.getString(i17 + 3)) != null;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 != 49) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(i18 == 51 || i18 == 129 || i18 == 106);
    }
}
