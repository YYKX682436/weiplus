package ef0;

/* loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ef0.b3 f252174d = new ef0.b3();

    public b3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingFloatBallAutoCollapseDelayTime()));
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFloatBallConfigService", "tingConfig tingFloatBallAutoCollapseDelaySecond: " + valueOf.intValue());
        return valueOf;
    }
}
