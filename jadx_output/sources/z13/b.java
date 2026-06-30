package z13;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final z13.b f469392d = new z13.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xj.m Ui;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigSearchYuanbaoNoAdInfo()) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[fts] hardcode no adinfo");
            Ui = null;
        } else {
            Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(wj.t0.f446509r);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fts] getAdInfo(MagicAdPosId.SEARCH_SIDEBAR) returns ");
        sb6.append(Ui != null ? Ui.f454753a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", sb6.toString());
        return Ui;
    }
}
