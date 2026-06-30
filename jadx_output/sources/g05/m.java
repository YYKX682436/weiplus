package g05;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g05.m f267479d = new g05.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_wxgame_dynamic_card_keepalive_timeout_millseconds", "");
        kotlin.jvm.internal.o.f(aj6, "getExpt(...)");
        java.lang.Long j17 = r26.h0.j(aj6);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "destroyTimeout expt value is " + j17 + ", default is: 30000");
        return java.lang.Long.valueOf(j17 != null ? j17.longValue() : 30000L);
    }
}
