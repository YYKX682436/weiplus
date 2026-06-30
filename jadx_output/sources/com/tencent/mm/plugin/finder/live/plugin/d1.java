package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d1 extends com.tencent.mm.plugin.finder.live.plugin.l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public final te2.a f112219p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        te2.l lVar = new te2.l(root, context, S0(), statusMonitor, R0());
        this.f112219p = lVar;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        lVar.onAttach(new te2.o(root, (com.tencent.mm.ui.MMActivity) context2, lVar, new com.tencent.mm.plugin.finder.live.plugin.b1(this)));
        if (x0()) {
            zl2.r4.f473950a.e(this, false);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.tencent.mm.ui.bl.c(root.getContext());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            super.K0(i17);
        } else {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w("FinderLiveAllowanceGiftBubblePlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        te2.a aVar;
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.c1.f112093a[status.ordinal()] != 1 || (aVar = this.f112219p) == null) {
            return;
        }
        ((te2.l) aVar).g();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePlugin", "#unMount");
        te2.a aVar = this.f112219p;
        if (aVar != null) {
            ((te2.l) aVar).onDetach();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePlugin", "#mount");
        te2.a aVar = this.f112219p;
        if (aVar != null) {
            ((te2.l) aVar).g();
        }
    }
}
