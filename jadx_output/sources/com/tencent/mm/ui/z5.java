package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class z5 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FinderIconViewTipPreference f212601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.b6 f212602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f212603f;

    public z5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference, zy2.b6 b6Var) {
        this.f212603f = findMoreFriendsUI;
        this.f212601d = finderIconViewTipPreference;
        this.f212602e = b6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.f03 f03Var;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        int Di = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Di();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged] result=%s testMode:%s", aVar, java.lang.Integer.valueOf(Di));
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            boolean wi6 = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = aVar.f105329c;
            com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = this.f212601d;
            if (!wi6 || jbVar == null || com.tencent.mm.plugin.finder.extension.reddot.f3.a(java.lang.Integer.valueOf(jbVar.getType()))) {
                l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f212603f;
                java.lang.String Ui = ((k40.f) eVar).Ui(findMoreFriendsUI.thisActivity());
                boolean equals = "FinderEntrance".equals(aVar.f105331e);
                r45.f03 f03Var2 = aVar.f105328b;
                boolean z28 = aVar.f105327a;
                if (equals) {
                    r45.f03 I0 = nk6.I0("FinderMentionEntrance");
                    z17 = I0 != null && I0.f373888e > 0;
                    f03Var = f03Var2;
                    f03Var2 = I0;
                } else if ("FinderMentionEntrance".equals(aVar.f105331e)) {
                    if (!z28 || f03Var2 == null) {
                        f03Var2 = null;
                    } else if (f03Var2.f373888e > 0) {
                        z17 = true;
                        r45.f03 I02 = nk6.I0("FinderEntrance");
                        z28 = I02 == null && I02.f373887d > 0;
                        f03Var = I02;
                    }
                    z17 = false;
                    r45.f03 I022 = nk6.I0("FinderEntrance");
                    if (I022 == null) {
                    }
                    f03Var = I022;
                } else {
                    f03Var2 = null;
                    f03Var = null;
                    z28 = false;
                    z17 = false;
                }
                if (z28) {
                    if (jbVar != null) {
                        int i17 = jbVar.field_ctrType;
                        boolean z29 = i17 == 14 || i17 == 10;
                        r45.xs2 xs2Var = jbVar.N;
                        z19 = z29;
                        z27 = xs2Var != null && xs2Var.getInteger(19) == 1;
                    } else {
                        z19 = false;
                        z27 = false;
                    }
                    if (Di == 0) {
                        this.f212603f.z0(f03Var, this.f212601d, z19, ((c61.l7) this.f212602e).nk().f0(), z27, f03Var2);
                    }
                } else if (z17) {
                    r45.pm6 pm6Var = new r45.pm6();
                    pm6Var.f383186d = f03Var2.f373888e;
                    finderIconViewTipPreference.Z3(true, pm6Var);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username not match finderEntry username: ");
                    java.lang.String str = aVar.f105330d;
                    sb6.append(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", sb6.toString());
                    if ("FinderMentionEntrance".equals(aVar.f105331e) && str.equals(Ui)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "FINDER_MENTION_ENTRANCE showCounter false");
                        z18 = false;
                        finderIconViewTipPreference.Z3(false, new r45.pm6());
                    } else {
                        z18 = false;
                    }
                    if ("FinderEntrance".equals(aVar.f105331e)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "FINDER_ENTRANCE showRedPoint false");
                        finderIconViewTipPreference.y(z18);
                    }
                    findMoreFriendsUI.b1("find_friends_by_finder", z18);
                }
                if (Di > 0) {
                    com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference2 = this.f212601d;
                    java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
                    if (Di < 5 || Di > 8) {
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 3, false, 0L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 3, false, 1500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 1, false, 3000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 1, false, 4500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 7, false, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 7, false, 7500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 11, false, 9000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 11, false, 10500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 2, false, 12000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 2, false, 13500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 22, false, 15000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 22, false, 16500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 13, false, 18000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 13, false, 19500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 14, false, 21000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 14, false, 22500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 12, false, 24000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 12, false, 25500L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 24, false, 37000L);
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 24, false, 38500L);
                    } else {
                        findMoreFriendsUI.Z0(finderIconViewTipPreference2, 22, false, 0L);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged] result=%s, 青少年模式且只看关注的模式下只允许关注的红点展示", aVar);
                if (finderIconViewTipPreference != null) {
                    finderIconViewTipPreference.y(false);
                }
            }
        }
        return f0Var;
    }
}
