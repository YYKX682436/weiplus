package df2;

/* loaded from: classes3.dex */
public final class vh extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231602m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f231603n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView f231604o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f231605p;

    /* renamed from: q, reason: collision with root package name */
    public int f231606q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f231607r;

    /* renamed from: s, reason: collision with root package name */
    public int f231608s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231602m = "Finder.LiveGameDataBannerController";
        this.f231607r = jz5.h.b(new df2.rh(this));
    }

    public final int Z6() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView2 = this.f231604o;
        if (!(finderLiveGameDataView2 != null ? finderLiveGameDataView2.isShown() : false) || (finderLiveGameDataView = this.f231604o) == null || (layoutParams = finderLiveGameDataView.getLayoutParams()) == null) {
            return 0;
        }
        return layoutParams.height;
    }

    public final void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f231602m, str + " hideGameDataCard");
        if2.d0 d0Var = this.f231603n;
        if (d0Var != null) {
            d0Var.d(8);
        }
    }

    public final void b7(java.lang.String source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" postReleaseTask,gameDataView:");
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = this.f231604o;
        sb6.append(finderLiveGameDataView != null ? finderLiveGameDataView.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(this.f231602m, sb6.toString());
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView2 = this.f231604o;
        if (finderLiveGameDataView2 != null) {
            finderLiveGameDataView2.postDelayed((java.lang.Runnable) ((jz5.n) this.f231607r).getValue(), j17);
        }
    }

    public final void c7(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        e7(source);
        a7(source);
        d7(source);
    }

    public final void d7(java.lang.String source) {
        com.tencent.mars.xlog.Log.i(this.f231602m, source + " releaseGameDataCard");
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = this.f231604o;
        if (finderLiveGameDataView != null) {
            kotlin.jvm.internal.o.g(source, "source");
            com.tencent.mars.xlog.Log.i(finderLiveGameDataView.f115900f, "release: source=" + source + ", liteAppView=" + finderLiveGameDataView.f115907p);
            android.view.View view = finderLiveGameDataView.f115907p;
            if (view != null) {
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
                    ((com.tencent.liteapp.ui.WxaLiteAppBaseView) view).g();
                }
            }
            finderLiveGameDataView.f115907p = null;
        }
        this.f231604o = null;
        this.f231603n = null;
    }

    public final void e7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f231602m, str + " removeReleaseTask");
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = this.f231604o;
        if (finderLiveGameDataView != null) {
            finderLiveGameDataView.removeCallbacks((java.lang.Runnable) ((jz5.n) this.f231607r).getValue());
        }
    }

    public final void f7() {
        boolean z17 = this.f231605p;
        java.lang.String str = this.f231602m;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startPollingBannerData is done");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "startPollingBannerData");
        this.f231605p = true;
        r45.cc2 cc2Var = new r45.cc2();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.e(20, cc2Var, new df2.sh(this, r45.dc2.class), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g7(kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.vh.g7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // if2.b, if2.m0
    public boolean k() {
        return ((mm2.g0) business(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mars.xlog.Log.i(this.f231602m, "onLiveActivate");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i(this.f231602m, "stopPollingBannerData have startPolling:" + this.f231605p);
        dk2.ef.f233392k.f(20);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var;
        super.onLiveMsg(r71Var);
        if (U6()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView = this.f231604o;
        if (!(finderLiveGameDataView != null ? finderLiveGameDataView.isShown() : false) || (ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) R6(com.tencent.mm.plugin.finder.live.plugin.ob0.class)) == null) {
            return;
        }
        com.tencent.rtmp.ui.TXCloudVideoView C1 = ob0Var.C1();
        int[] iArr = new int[2];
        C1.getLocationOnScreen(iArr);
        int i17 = this.f231606q;
        if (i17 <= 0 || iArr[1] == i17 || C1.getHeight() <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f231602m, "onLiveMsg previewLocY change from " + this.f231606q + " to " + iArr[1]);
        this.f231606q = iArr[1];
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) R6(com.tencent.mm.plugin.finder.live.plugin.le0.class);
        if (le0Var != null) {
            le0Var.v1(iArr[0], iArr[1], C1.getHeight());
        }
        com.tencent.mm.plugin.finder.live.plugin.oz ozVar = (com.tencent.mm.plugin.finder.live.plugin.oz) R6(com.tencent.mm.plugin.finder.live.plugin.oz.class);
        if (ozVar != null) {
            ozVar.t1(iArr[0], iArr[1], C1.getHeight());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        f7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (((mm2.c1) business(mm2.c1.class)).a8()) {
            f7();
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        c7("onViewUnmount");
        this.f231606q = 0;
    }
}
