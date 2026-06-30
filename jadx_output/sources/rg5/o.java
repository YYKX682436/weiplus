package rg5;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f395261a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.FindMoreFriendsUI f395262b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f395263c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.k0 f395264d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.k0 f395265e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f395266f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.k0 f395267g;

    /* renamed from: h, reason: collision with root package name */
    public final rg5.h f395268h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f395269i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.FinderIconViewTipPreference f395270j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f395271k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f395272l;

    public o(android.content.Context context, com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f395261a = context;
        this.f395262b = findMoreFriendsUI;
        this.f395266f = true;
        this.f395268h = new rg5.h(this);
        this.f395269i = jz5.h.b(rg5.i.f395255d);
        this.f395271k = this.f395263c;
        this.f395272l = "";
    }

    public final void a() {
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f395262b;
        com.tencent.mm.ui.base.preference.h0 h0Var = findMoreFriendsUI.f196656w;
        if (h0Var != null) {
            h0Var.m("find_friends_by_finder_live_above_look", true);
        }
        com.tencent.mm.ui.base.preference.h0 h0Var2 = findMoreFriendsUI.f196656w;
        if (h0Var2 != null) {
            h0Var2.m("find_friends_by_finder_live", true);
        }
    }

    public final java.lang.String b() {
        return this.f395263c ? "find_friends_by_finder_live_above_look" : "find_friends_by_finder_live";
    }

    public final r45.f03 c() {
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("LiveMentionEntrance");
        if (I0 == null || I0.f373888e <= 0) {
            return null;
        }
        return I0;
    }

    public final void d(com.tencent.mm.plugin.finder.extension.reddot.a aVar) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2;
        r45.wo1 wo1Var;
        r45.f03 f03Var;
        boolean z17 = false;
        int i17 = (aVar == null || (f03Var = aVar.f105328b) == null) ? 0 : f03Var.f373887d;
        boolean E = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E();
        boolean z18 = this.f395262b.F;
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleDataPreload: showType=" + i17 + " result=" + aVar);
        if (i17 != 6) {
            sq2.g gVar = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
            gVar.getClass();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            java.lang.String str = null;
            r45.xs2 xs2Var = L0 != null ? L0.N : null;
            if (!kotlin.jvm.internal.o.b(gVar.f411354i, L0 != null ? L0.field_tipsId : null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRedDotChangeClearNewEntranceCache: clear preload cache, lastCacheTipsId=");
                sb6.append(gVar.f411354i);
                sb6.append(", currRedDotId=");
                sb6.append(L0 != null ? L0.field_tipsId : null);
                com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", sb6.toString());
                cq2.q qVar = cq2.q.f221428a;
                qVar.b("checkRedDotChangeClearNewEntranceCache");
                if (xs2Var != null && (wo1Var = (r45.wo1) xs2Var.getCustom(30)) != null) {
                    qVar.h("redDotChange", wo1Var);
                }
            }
            gVar.f411354i = L0 != null ? L0.field_tipsId : null;
            j(E);
            boolean Bi = ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Bi();
            sq2.g gVar2 = (sq2.g) ((ys5.f) i95.n0.c(ys5.f.class));
            boolean z19 = !android.text.TextUtils.isEmpty(gVar2.f411353h) && kotlin.jvm.internal.o.b(gVar2.f411353h, (aVar == null || (jbVar2 = aVar.f105329c) == null) ? null : jbVar2.field_tipsId);
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "isPreloadImmediately enablePreloadImmediately=" + Bi + " alreadyTriggerPreload=" + z19);
            if (Bi && !z19) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "handleDataPreload isEnableShowFinderLiveEntranceRedDot=" + E + " isInFinderEntrance=" + z18 + " isPreloadImmediately=" + z17);
            if (E) {
                if (z18 || z17) {
                    boolean Ai = ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Ai("redDotChange");
                    if (z17 && Ai) {
                        ys5.f fVar = (ys5.f) i95.n0.c(ys5.f.class);
                        if (aVar != null && (jbVar = aVar.f105329c) != null) {
                            str = jbVar.field_tipsId;
                        }
                        if (str == null) {
                            str = "";
                        }
                        ((sq2.g) fVar).f411353h = str;
                    }
                }
            }
        }
    }

    public final boolean e() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            a();
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for isTeenMode.");
            return false;
        }
        if (!(!this.f395262b.P0(9007199254740992L))) {
            a();
            com.tencent.mars.xlog.Log.w("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for enableFinderLiveEntry");
            return false;
        }
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
            return true;
        }
        a();
        com.tencent.mars.xlog.Log.w("FinderLiveEntryPreferenceMgr", "updateFinderLiveEntry return for isEnableFindLive");
        return false;
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "onCreate");
        this.f395268h.alive();
        g();
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "global observeRedDotRcv");
        rg5.l lVar = new rg5.l(this);
        this.f395267g = lVar;
        ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).Ri(this.f395262b, lVar);
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "global removeObserveRedDotRcv");
        androidx.lifecycle.k0 k0Var = this.f395267g;
        if (k0Var != null) {
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
            com.tencent.mm.plugin.finder.extension.reddot.aa.M.removeObserver(k0Var);
        }
        this.f395267g = null;
    }

    public final void h(int i17) {
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        r45.f03 I0 = nk6.I0("LiveMentionEntrance");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("LiveMentionEntrance");
        if (I0 == null || L0 == null) {
            return;
        }
        java.lang.String str = L0.field_ctrInfo.f388490h;
        java.lang.String str2 = str == null ? "" : str;
        rg5.g[] gVarArr = rg5.g.f395253d;
        if (i17 == 1 && kotlin.jvm.internal.o.b(str, this.f395272l)) {
            return;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ri("1", L0, I0, i17, "", 0, 0, 0);
        this.f395272l = str2;
    }

    public final void i() {
        boolean z17 = this.f395263c;
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f395262b;
        if (z17) {
            com.tencent.mm.ui.base.preference.h0 h0Var = findMoreFriendsUI.f196656w;
            if (h0Var != null) {
                h0Var.m("find_friends_by_finder_live_above_look", false);
            }
            com.tencent.mm.ui.base.preference.h0 h0Var2 = findMoreFriendsUI.f196656w;
            if (h0Var2 != null) {
                h0Var2.m("find_friends_by_finder_live", true);
                return;
            }
            return;
        }
        com.tencent.mm.ui.base.preference.h0 h0Var3 = findMoreFriendsUI.f196656w;
        if (h0Var3 != null) {
            h0Var3.m("find_friends_by_finder_live_above_look", true);
        }
        com.tencent.mm.ui.base.preference.h0 h0Var4 = findMoreFriendsUI.f196656w;
        if (h0Var4 != null) {
            h0Var4.m("find_friends_by_finder_live", false);
        }
    }

    public final void j(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#startPreloadTargetPage-new enableShowLiveEntranceRedDot=");
        sb6.append(z17);
        sb6.append(" isInFindEntrance=");
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f395262b;
        sb6.append(findMoreFriendsUI.F);
        com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", sb6.toString());
        if (z17 && findMoreFriendsUI.F) {
            if (!((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).lk()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_context_id", com.tencent.mm.ui.report.e0.a());
                ((v40.w) ((uc.p) i95.n0.c(uc.p.class))).getClass();
                nq2.d dVar = nq2.d.f338980a;
                if (c92.g.f39738a.b()) {
                    dVar.j(intent);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "startPreloadInFinderLiveEntry return for not isEnableFindLive.");
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", "#startPreloadTargetPage-new go in");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            if (L0 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#startPreloadTargetPage-new pre_load=");
                r45.xs2 xs2Var = L0.N;
                sb7.append(xs2Var.getInteger(17));
                sb7.append(" object_id=");
                sb7.append(xs2Var.getLong(3));
                sb7.append(", ");
                com.tencent.mars.xlog.Log.i("FinderLiveEntryPreferenceMgr", sb7.toString());
                int integer = xs2Var.getInteger(13);
                long j17 = xs2Var.getLong(3);
                if (integer == 1) {
                    ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
                    dp2.e.f242192a.c(null, j17, "", true, 325, null);
                }
            }
        }
    }
}
