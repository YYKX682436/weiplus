package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ma0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f113478p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f113479q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113478p = rootView;
        this.f113479q = statusMonitor;
        int i17 = com.tencent.mm.R.id.mxt;
        if (((com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.mxt)) != null) {
            i17 = com.tencent.mm.R.id.mxu;
            if (((android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.mxu)) != null) {
                i17 = com.tencent.mm.R.id.f486940my3;
                if (((com.tencent.mm.view.MMPAGView) x4.b.a(rootView, com.tencent.mm.R.id.f486940my3)) != null) {
                    i17 = com.tencent.mm.R.id.f486942my4;
                    if (((com.tencent.mm.plugin.finder.live.view.FinderMarqueeTextView) x4.b.a(rootView, com.tencent.mm.R.id.f486942my4)) != null) {
                        K0(8);
                        rootView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ha0(this));
                        ym5.a1.h(rootView, new com.tencent.mm.plugin.finder.live.plugin.ia0(this));
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        boolean b76 = ((mm2.e1) P0(mm2.e1.class)).b7();
        boolean F1 = zl2.r4.F1(S0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[SingSongBanner] setVisible: visible=");
        sb6.append(i17 == 0 ? "VISIBLE" : "GONE");
        sb6.append(", isKTV=");
        sb6.append(b76);
        sb6.append(", isCoLive=");
        sb6.append(F1);
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", sb6.toString());
        if (b76) {
            com.tencent.mars.xlog.Log.w("FinderLiveWishBannerPlugin", "[SingSongBanner] setVisible: BLOCKED - isKTVRoomLive=true, force GONE");
            super.K0(8);
        } else if (!F1) {
            super.K0(i17);
        } else {
            com.tencent.mars.xlog.Log.w("FinderLiveWishBannerPlugin", "[SingSongBanner] setVisible: BLOCKED - isCoLiveLive=true, force GONE");
            super.K0(8);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 7) {
            if (ordinal != 124) {
                return;
            }
            java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("PARAM_FINDER_LIVE_SUB_MODE")) : null;
            boolean g76 = ((mm2.e1) P0(mm2.e1.class)).g7();
            com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] statusChange: LIVE_MODE_CHANGE, subMode=" + valueOf + ", isVoiceRoom=" + g76);
            if (g76) {
                if (valueOf != null && valueOf.intValue() == 0) {
                    return;
                }
                if (valueOf == null || valueOf.intValue() != 8) {
                    t1();
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("FinderLiveWishBannerPlugin", "[SingSongBanner] statusChange: VoiceRoom KTV mode, force GONE");
                    K0(8);
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] statusChange: START_LIVE received, calling initPlugin()");
        boolean z17 = dk2.ef.f233384g;
        boolean z18 = ((mm2.m6) P0(mm2.m6.class)).f329248p;
        boolean b76 = ((mm2.e1) P0(mm2.e1.class)).b7();
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] ========== initPlugin START ==========");
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] initPlugin: isAnchor=" + z17 + ", isNewVersionSongList=" + z18 + ", isKTV=" + b76);
        if (!z18) {
            com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] initPlugin: isNewVersionSongList=false, skip");
            return;
        }
        if (z17) {
            ((mm2.m6) P0(mm2.m6.class)).f329246n.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ja0(this));
        } else {
            ((mm2.m6) P0(mm2.m6.class)).f329246n.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ka0(this));
        }
        ((mm2.m6) P0(mm2.m6.class)).f329242g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.la0(this));
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] ========== initPlugin END ==========");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        int i17 = ((mm2.c1) P0(mm2.c1.class)).f328801f2;
        boolean z17 = i17 != 1;
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] visibleInCurrentLiveMode: liveScene=" + i17 + ", visible=" + z17);
        return z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        dk2.ef efVar = dk2.ef.f233372a;
        boolean z17 = dk2.ef.f233384g;
        boolean z18 = ((mm2.m6) P0(mm2.m6.class)).f329248p;
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) P0(mm2.m6.class)).f329246n.getValue();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "[SingSongBanner] checkNeedShow: isAnchor=" + z17 + ", isNewVersionSongList=" + z18 + ", hasNewSongList=" + booleanValue);
        if (!z18) {
            K0(8);
            return;
        }
        if (z17) {
            if (booleanValue) {
                K0(0);
                return;
            } else {
                K0(8);
                return;
            }
        }
        if (booleanValue) {
            K0(0);
        } else {
            K0(8);
        }
    }
}
