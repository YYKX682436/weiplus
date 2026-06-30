package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f208329d;

    public d6(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        this.f208329d = findMoreFriendsUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int p17 = c01.z1.p();
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f208329d;
        findMoreFriendsUI.N = p17;
        findMoreFriendsUI.Q = c01.z1.n();
        findMoreFriendsUI.P = c01.z1.j();
        findMoreFriendsUI.R = c01.z1.h();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        findMoreFriendsUI.D1();
        if (!findMoreFriendsUI.P1 && !findMoreFriendsUI.Q1) {
            if (findMoreFriendsUI.T0()) {
                findMoreFriendsUI.m1(true, null, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance"));
                gz2.c.e("finder");
            }
            if (findMoreFriendsUI.U0()) {
                ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).cj(ra0.b0.f393463f, ra0.b0.f393464g, true, 109);
                int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
                if (s17 > 0) {
                    ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).hj(s17, ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r().f384113d, true);
                }
            }
            rg5.o oVar = findMoreFriendsUI.M1;
            boolean e17 = oVar != null ? oVar.e() : true;
            findMoreFriendsUI.o1("onTabSwitchIn", java.lang.Boolean.TRUE);
            if (e17) {
                gz2.c.e("live");
            }
            if ((findMoreFriendsUI.Q & 32768) == 0) {
                gz2.c.e("sns");
            }
            findMoreFriendsUI.P1 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[updateStatus] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
