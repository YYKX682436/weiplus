package kc2;

/* loaded from: classes15.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f306487d;

    public s0(kc2.g1 g1Var) {
        this.f306487d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.g1 g1Var = this.f306487d;
        g1Var.m().f();
        g1Var.p().f();
        g1Var.o().f();
        g1Var.i().f();
        g1Var.j().f();
        g1Var.f().c();
        g1Var.C = g1Var.s();
        g1Var.B = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        g1Var.f306397u = g1Var.a();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_KARA_START_TIME_INT_SYNC;
        if (c17.r(u3Var, 0) <= 0) {
            int e17 = c01.id.e();
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(e17));
            com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "saveKaraStartTime " + e17);
        }
        com.tencent.mars.xlog.Log.i("FinderKaraInfoManager", "init(" + java.lang.Thread.currentThread().getName() + ") wxFriendCnt=" + g1Var.C + " finderRedDotBusinessCnt=" + g1Var.f306397u);
    }
}
