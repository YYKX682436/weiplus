package dd5;

/* loaded from: classes9.dex */
public final class w2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.w2 f229325b = new dd5.w2();

    /* renamed from: c, reason: collision with root package name */
    public static final ad5.l0[] f229326c = {ad5.f.f3249a, ad5.d.f3242a};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f229327d = dd5.u2.class;

    /* renamed from: e, reason: collision with root package name */
    public static final uc5.n f229328e = dd5.t2.f229294p;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f229329f = kz5.c0.i(java.lang.Integer.valueOf(java.lang.Integer.parseInt("1001")), java.lang.Integer.valueOf(java.lang.Integer.parseInt("1002")), java.lang.Integer.valueOf(java.lang.Integer.parseInt("1005")));

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f229330g = kz5.z.D0(new java.lang.Integer[]{2000, 2001});

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f229331h = kz5.z.D0(new java.lang.Integer[]{419430449, 436207665, 536870961, 536936497, 469762097, 503316529});

    @Override // uc5.p
    public java.util.Set b() {
        return f229331h;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229327d;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229328e;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        java.lang.String string = simpleMsgInfo.getString(i17 + 13);
        boolean z17 = true;
        if (!(!r26.n0.N(string))) {
            string = null;
        }
        if (string == null) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(string);
        b15.c cVar = (b15.c) bVar.getCustom(bVar.f432315e + 31);
        if (cVar == null) {
            return false;
        }
        if (simpleMsgInfo.getInteger(i17 + 5) != 2000) {
            java.lang.String w17 = cVar.w();
            return kz5.n0.O(f229329f, w17 != null ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(w17)) : null);
        }
        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent();
        walletQueryRemittanceStatusEvent.f54971g.f8421a = cVar.y();
        walletQueryRemittanceStatusEvent.e();
        int integer = simpleMsgInfo.getInteger(i17 + 9);
        am.z10 z10Var = walletQueryRemittanceStatusEvent.f54972h;
        if (integer == 1) {
            z17 = z10Var.f8506b;
        } else if (z10Var.f8506b) {
            z17 = false;
        }
        if (z10Var.f8505a == -2) {
            return false;
        }
        return z17;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 == 49 && f229330g.contains(java.lang.Integer.valueOf(i18))) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }
}
