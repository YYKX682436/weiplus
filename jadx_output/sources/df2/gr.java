package df2;

/* loaded from: classes3.dex */
public final class gr extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230240m;

    /* renamed from: n, reason: collision with root package name */
    public r45.k74 f230241n;

    /* renamed from: o, reason: collision with root package name */
    public r45.y23 f230242o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f230243p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f230244q;

    /* renamed from: r, reason: collision with root package name */
    public if2.d0 f230245r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230240m = "LiveProductSizeAssistPanelController";
        this.f230243p = "";
    }

    public final void Z6() {
        r45.k74 k74Var = this.f230241n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshLiteAppView appId:");
        sb6.append(k74Var != null ? k74Var.getString(0) : null);
        sb6.append(", path=");
        sb6.append(k74Var != null ? k74Var.getString(1) : null);
        sb6.append(", query=");
        sb6.append(k74Var != null ? k74Var.getString(2) : null);
        com.tencent.mars.xlog.Log.i(this.f230240m, sb6.toString());
        if (k74Var != null) {
            java.lang.String string = k74Var.getString(0);
            if (!(string == null || string.length() == 0)) {
                com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.fr(this, k74Var, null), 3, null);
                return;
            }
        }
        a7("LiteAppIsNull");
    }

    public final void a7(java.lang.String source) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView finderLiveProductSizeAssistPanelView = (com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView) S6(com.tencent.mm.R.id.ra_);
        if (finderLiveProductSizeAssistPanelView != null) {
            if2.d0 d0Var = this.f230245r;
            if (d0Var != null) {
                d0Var.d(8);
            }
            if (finderLiveProductSizeAssistPanelView.getTag() != null) {
                kotlin.jvm.internal.o.g(source, "source");
                com.tencent.mars.xlog.Log.i("FinderLiveProductSizeAssistPanelView", "release: source=" + source + ", liteAppView=" + finderLiveProductSizeAssistPanelView.f116085f);
                finderLiveProductSizeAssistPanelView.setTag(null);
                android.view.View view = finderLiveProductSizeAssistPanelView.f116085f;
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
                finderLiveProductSizeAssistPanelView.f116085f = null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        a7("onLiveEnd");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        Z6();
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView finderLiveProductSizeAssistPanelView = (com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView) S6(com.tencent.mm.R.id.ra_);
        if (finderLiveProductSizeAssistPanelView != null) {
            if2.d0 d0Var = new if2.d0(finderLiveProductSizeAssistPanelView, new if2.c());
            this.f291103i = new df2.br(d0Var);
            this.f230245r = d0Var;
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.dr(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f230245r = null;
        a7("onViewUnmount");
    }
}
