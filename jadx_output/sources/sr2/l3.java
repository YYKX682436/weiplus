package sr2;

/* loaded from: classes10.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        super(0);
        this.f411622d = postMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411622d;
        boolean z17 = false;
        if (postMainUIC.K == 5 && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_SHOW_SELF_FEED_LIKE_TIPS_TIMES_INT;
            int r17 = c17.r(u3Var, 0);
            if (r17 < 3) {
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
            }
        }
        r45.q23 q23Var = postMainUIC.k7().P;
        if (q23Var != null && q23Var.f383586e == 3) {
            z17 = true;
        }
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markStartPost");
        if (com.tencent.mm.plugin.vlog.model.b0.f175557k <= 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.vlog.model.b0.f175557k = android.os.SystemClock.elapsedRealtime();
        }
        if (z17) {
            op4.a.f347260a.a(3);
        }
        postMainUIC.a7();
        return jz5.f0.f302826a;
    }
}
