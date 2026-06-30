package rg5;

/* loaded from: classes8.dex */
public final class k implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f395257d;

    public k(rg5.o oVar) {
        this.f395257d = oVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        int i17;
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        rg5.o oVar = this.f395257d;
        com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = oVar.f395270j;
        if (finderIconViewTipPreference == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for null");
            return;
        }
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = oVar.f395262b;
        com.tencent.mm.ui.base.preference.h0 h0Var = findMoreFriendsUI.f196656w;
        if (h0Var != null && !h0Var.q(oVar.b())) {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for not show ".concat(oVar.b()));
            return;
        }
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot preference:" + finderIconViewTipPreference + ' ' + finderIconViewTipPreference.hashCode() + " return for result null");
            return;
        }
        if (!((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isEnableFindLive");
            return;
        }
        r45.f03 f03Var = aVar.f105328b;
        if (f03Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot info is null");
            return;
        }
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderLiveEntrance");
        if (I0 == null || (i17 = I0.f373887d) <= 0 || i17 == 6) {
            I0 = null;
        }
        boolean E = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E();
        boolean z17 = false;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = aVar.f105329c;
        boolean z18 = aVar.f105327a;
        if (!z18 || f03Var.f373888e <= 0) {
            if (I0 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isShow false remain liveEntranceTipsInfo");
                com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI2 = oVar.f395262b;
                if (jbVar != null && (xs2Var = jbVar.N) != null && xs2Var.getInteger(19) == 1) {
                    z17 = true;
                }
                findMoreFriendsUI2.z0(I0, finderIconViewTipPreference, false, E, z17, null);
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isShow clear mention");
                finderIconViewTipPreference.Z3(false, new r45.pm6());
            }
            oVar.i();
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot return for isShow:" + z18 + ", count:" + f03Var.f373888e);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot: [onChanged] preference=" + finderIconViewTipPreference + ' ' + finderIconViewTipPreference.hashCode() + ", isInFinderEntrance=" + findMoreFriendsUI.F + ", result=" + aVar);
        android.view.View view = finderIconViewTipPreference.Z1;
        if (view != null) {
            view.setContentDescription(oVar.f395261a.getString(com.tencent.mm.R.string.dcl));
        }
        if (I0 != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot with live entrance red dot");
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI3 = oVar.f395262b;
            if (jbVar != null && (xs2Var2 = jbVar.N) != null && xs2Var2.getInteger(19) == 1) {
                z17 = true;
            }
            findMoreFriendsUI3.z0(I0, finderIconViewTipPreference, false, E, z17, f03Var);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot only show live mention red dot");
            r45.pm6 pm6Var = new r45.pm6();
            pm6Var.f383186d = f03Var.f373888e;
            finderIconViewTipPreference.Z3(true, pm6Var);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleFinderLiveMentionRedDot currentTabIndex: " + com.tencent.mm.ui.LauncherUI.getCurrentTabIndex());
        if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2) {
            rg5.g[] gVarArr = rg5.g.f395253d;
            oVar.h(1);
        }
    }
}
