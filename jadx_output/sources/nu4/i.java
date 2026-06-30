package nu4;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.i f340253d = new nu4.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.q1 q1Var = com.tencent.mm.plugin.webview.core.s1.f181972a;
        int i17 = com.tencent.mm.plugin.webview.core.t1.a().getInt("prefetchUsePkg", qk.ka.a() ? 1 : -1);
        if (i17 == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (i17 == 1) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_prefetcher_use_pkg_v2, 0) == 1);
        boolean booleanValue = valueOf.booleanValue();
        nu4.k kVar = nu4.b0.f340241J;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsEngine", "prefetchUsePkgOpen open " + booleanValue);
        return valueOf;
    }
}
