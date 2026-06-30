package u71;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final u71.e f425093d = new u71.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingCloudSession()) == 1);
        com.tencent.mars.xlog.Log.i("AffBizFeatureService", "useMMNet " + valueOf.booleanValue());
        return valueOf;
    }
}
