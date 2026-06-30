package kh5;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final kh5.e f308068d = new kh5.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_magicemoji_keepalive_timeout", "");
        kotlin.jvm.internal.o.f(aj6, "getExpt(...)");
        java.lang.Long j17 = r26.h0.j(aj6);
        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "destroyTimeout value is " + j17);
        return java.lang.Long.valueOf(j17 != null ? j17.longValue() : 60000L);
    }
}
