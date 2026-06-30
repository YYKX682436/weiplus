package df2;

/* loaded from: classes3.dex */
public final class jc extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f230466m;

    /* renamed from: n, reason: collision with root package name */
    public r45.k74 f230467n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView f230468o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final void Z6(df2.jc jcVar, java.lang.String str) {
        jcVar.getClass();
        if (!zl2.r4.f473950a.I1(jcVar.getStore().getLiveRoomData())) {
            com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: switch is off, source=" + str);
            jcVar.f7();
            return;
        }
        if (!((mm2.c1) jcVar.business(mm2.c1.class)).a8()) {
            com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: live is not started, source=" + str);
            jcVar.f7();
            return;
        }
        if (jcVar.f230466m) {
            com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: has started, source=" + str);
        } else {
            com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "checkPollingBannerData: start, source=" + str);
            jcVar.f230466m = true;
            dk2.ef.f233392k.e(35, new r45.rb2(), new df2.cc(jcVar, str, r45.qb2.class), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.jc r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.jc.a7(df2.jc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7() {
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ac(this, null), 3, null);
        }
    }

    public final com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView c7() {
        if (this.f230468o == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(O6()).inflate(com.tencent.mm.R.layout.dqq, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView");
            com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView = (com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView) inflate;
            this.f230468o = finderLiveAnchorDataPanelView;
            finderLiveAnchorDataPanelView.setOnExpandListener(new df2.fc(this));
        }
        return this.f230468o;
    }

    public final void d7(java.lang.String str) {
        e7(false);
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView c76 = c7();
            if (c76 != null) {
                c76.f(str);
            }
            f7();
        }
    }

    public final void e7(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = (com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView) S6(com.tencent.mm.R.id.ubl);
        if (finderLiveInfiniteLoopView != null) {
            if (z17) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView c76 = c7();
                if (c76 != null) {
                    finderLiveInfiniteLoopView.c(c76);
                }
            } else {
                com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView c77 = c7();
                if (c77 != null) {
                    finderLiveInfiniteLoopView.f(c77);
                }
            }
        }
        boolean isShown = finderLiveInfiniteLoopView != null ? finderLiveInfiniteLoopView.isShown() : false;
        android.view.View S6 = S6(com.tencent.mm.R.id.egj);
        if (S6 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = S6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = isShown ? O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz) : -2;
            }
            S6.requestLayout();
        }
        android.view.View S62 = S6(com.tencent.mm.R.id.fj9);
        if (S62 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = S62.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = isShown ? O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv) : 0;
            }
            S62.requestLayout();
        }
    }

    public final void f7() {
        com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "stopPollingBannerData: startPolling=" + this.f230466m + ", isPanelEnable=" + zl2.r4.f473950a.I1(getStore().getLiveRoomData()));
        this.f230466m = false;
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(35);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", "onLiveActivate:");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        d7("onLiveEnd");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.gc(this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStart: isAnchorOrAssistant=");
        zl2.r4 r4Var = zl2.r4.f473950a;
        sb6.append(r4Var.y1(getStore().getLiveRoomData()));
        com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", sb6.toString());
        if (r4Var.y1(getStore().getLiveRoomData())) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.hc(this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewMount: isAnchorOrAssistant=");
        zl2.r4 r4Var = zl2.r4.f473950a;
        sb6.append(r4Var.y1(getStore().getLiveRoomData()));
        com.tencent.mars.xlog.Log.i("LiveAnchorDataPanelController", sb6.toString());
        if (r4Var.y1(getStore().getLiveRoomData()) && ((mm2.c1) business(mm2.c1.class)).a8()) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ic(this, null), 3, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        d7("onViewUnmount");
        this.f230468o = null;
    }
}
