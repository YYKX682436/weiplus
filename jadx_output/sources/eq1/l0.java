package eq1;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final eq1.l0 f255830d = new eq1.l0();

    public l0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        eq1.n0 n0Var = eq1.n0.f255837a;
        boolean z17 = true;
        if (!((java.lang.Boolean) ((jz5.n) eq1.n0.f255841e).getValue()).booleanValue() && ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) eq1.n0.f255838b).getValue()).o("BizTimeLineTestMode", 0) != 1) {
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_line_test, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.TestBiz", "test biz open " + n0Var);
            if (!z18) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
