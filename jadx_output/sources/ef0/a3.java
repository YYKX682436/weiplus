package ef0;

/* loaded from: classes3.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ef0.a3 f252164d = new ef0.a3();

    public a3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingEnableFloatBallAutoCollapse());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFloatBallConfigService", "tingConfig enableTingFloatBallAutoCollapse: " + nj6);
        return java.lang.Boolean.valueOf(nj6 == 1);
    }
}
