package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class dg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx2.i f123630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(zx2.i iVar, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        super(0);
        this.f123630d = iVar;
        this.f123631e = finderProfileTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTabSelected, tab: ");
        zx2.i iVar = this.f123630d;
        sb6.append(iVar);
        sb6.append(", tabType: ");
        boolean z17 = iVar instanceof com.tencent.mm.plugin.finder.profile.uic.re;
        com.tencent.mm.plugin.finder.profile.uic.re reVar = z17 ? (com.tencent.mm.plugin.finder.profile.uic.re) iVar : null;
        sb6.append(reVar != null ? java.lang.Integer.valueOf(reVar.f124186k) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
        com.tencent.mm.plugin.finder.profile.uic.re reVar2 = z17 ? (com.tencent.mm.plugin.finder.profile.uic.re) iVar : null;
        if (reVar2 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onTabSelected, tabType: ");
            int i17 = reVar2.f124186k;
            sb7.append(i17);
            sb7.append(", tabName: ");
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123631e;
            sb7.append(finderProfileTabUIC.E7(i17));
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", sb7.toString());
            android.app.Activity context = finderProfileTabUIC.getContext();
            int i18 = ((com.tencent.mm.plugin.finder.profile.uic.re) iVar).f124186k;
            int i19 = i18 != 1 ? i18 != 2 ? 0 : 11 : 10;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = (com.tencent.mm.plugin.finder.view.FinderJumpAnchorView) context.findViewById(com.tencent.mm.R.id.fz8);
            if (finderJumpAnchorView != null) {
                finderJumpAnchorView.setTag(com.tencent.mm.R.id.rld, java.lang.Integer.valueOf(i19));
                if (i19 != 10 && i19 != 11) {
                    finderJumpAnchorView.setVisibility(4);
                }
            }
            java.util.Iterator it = finderProfileTabUIC.Y6().iterator();
            while (true) {
                if (!it.hasNext()) {
                    finderHomeTabFragment = null;
                    break;
                }
                finderHomeTabFragment = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it.next();
                if (finderHomeTabFragment.f129265p == i17) {
                    break;
                }
            }
            if (!(!(finderHomeTabFragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileEmptyLoadingFragment))) {
                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkTabFragment, tabType: " + i17);
                switch (i17) {
                    case 1:
                        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ef(finderProfileTabUIC));
                        break;
                    case 2:
                        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ag(finderProfileTabUIC));
                        break;
                    case 4:
                        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                            finderProfileTabUIC.I7(4, new com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayFragment());
                            break;
                        } else {
                            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkLiveTab return for teenMode!");
                            break;
                        }
                    case 5:
                        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.xf(finderProfileTabUIC));
                        break;
                    case 6:
                        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.zf(finderProfileTabUIC));
                        break;
                    case 7:
                        android.app.Activity context2 = finderProfileTabUIC.getContext();
                        kotlin.jvm.internal.o.g(context2, "context");
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
                        if (p2Var != null) {
                            p2Var.O6(8460, 3, 7);
                        }
                        gm0.j1.d().a(8460, new com.tencent.mm.plugin.finder.profile.uic.vf(finderProfileTabUIC));
                        finderProfileTabUIC.B7();
                        break;
                    case 9:
                        com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkEmojiFragment start");
                        if (finderProfileTabUIC.G7()) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkEmojiFragment enable");
                            pf5.e.launch$default(finderProfileTabUIC, null, null, new com.tencent.mm.plugin.finder.profile.uic.kf(finderProfileTabUIC, null), 3, null);
                            break;
                        }
                        break;
                    case 10:
                        android.app.Activity context3 = finderProfileTabUIC.getContext();
                        kotlin.jvm.internal.o.g(context3, "context");
                        pf5.z zVar2 = pf5.z.f353948a;
                        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var2 = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
                        if (p2Var2 != null) {
                            p2Var2.O6(10923, 8, 10);
                        }
                        pf5.e.launch$default(finderProfileTabUIC, null, null, new com.tencent.mm.plugin.finder.profile.uic.uf(finderProfileTabUIC, null), 3, null);
                        break;
                    case 12:
                        finderProfileTabUIC.z7();
                        break;
                    case 14:
                        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ac).getValue()).r()).intValue() == 1) {
                            if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                                i95.m c17 = i95.n0.c(cq.k.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                java.lang.String finderUsername = finderProfileTabUIC.F7();
                                androidx.appcompat.app.AppCompatActivity activity = finderProfileTabUIC.getActivity();
                                kotlin.jvm.internal.o.g(activity, "activity");
                                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                                com.tencent.mm.plugin.finder.profile.uic.gf gfVar = new com.tencent.mm.plugin.finder.profile.uic.gf(finderProfileTabUIC);
                                com.tencent.mm.plugin.finder.profile.uic.hf hfVar = com.tencent.mm.plugin.finder.profile.uic.hf.f123769d;
                                kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
                                new bq.n(finderUsername, null, V6, 0).l().q(new cq.x(gfVar, finderUsername, hfVar));
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab isTeenMode!");
                                break;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab unSupport course tab!");
                            break;
                        }
                    case 15:
                        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ac).getValue()).r()).intValue() == 1) {
                            if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                                i95.m c18 = i95.n0.c(cq.k.class);
                                kotlin.jvm.internal.o.f(c18, "getService(...)");
                                java.lang.String finderUsername2 = finderProfileTabUIC.F7();
                                androidx.appcompat.app.AppCompatActivity activity2 = finderProfileTabUIC.getActivity();
                                kotlin.jvm.internal.o.g(activity2, "activity");
                                r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                                com.tencent.mm.plugin.finder.profile.uic.pf pfVar = new com.tencent.mm.plugin.finder.profile.uic.pf(finderProfileTabUIC);
                                com.tencent.mm.plugin.finder.profile.uic.qf qfVar = com.tencent.mm.plugin.finder.profile.uic.qf.f124159d;
                                kotlin.jvm.internal.o.g(finderUsername2, "finderUsername");
                                new bq.f1(finderUsername2, null, V62, 0).l().q(new cq.j0(pfVar, finderUsername2, qfVar));
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkPaidCollectionTab isTeenMode!");
                                break;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("Finder.FinderProfileTabUIC", "checkPaidCollectionTab unSupport paidCollection tab!");
                            break;
                        }
                    case 16:
                        androidx.appcompat.app.AppCompatActivity activity3 = finderProfileTabUIC.getActivity();
                        kotlin.jvm.internal.o.g(activity3, "activity");
                        r45.qt2 V63 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                        i95.m c19 = i95.n0.c(cq.k.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        java.lang.String finderUsername3 = finderProfileTabUIC.F7();
                        com.tencent.mm.plugin.finder.profile.uic.lf lfVar = new com.tencent.mm.plugin.finder.profile.uic.lf(finderProfileTabUIC);
                        com.tencent.mm.plugin.finder.profile.uic.mf mfVar = new com.tencent.mm.plugin.finder.profile.uic.mf(finderProfileTabUIC);
                        kotlin.jvm.internal.o.g(finderUsername3, "finderUsername");
                        pm0.v.T(new bq.d1(V63, finderUsername3, 0, null).l(), new cq.c1(lfVar, mfVar));
                        break;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
