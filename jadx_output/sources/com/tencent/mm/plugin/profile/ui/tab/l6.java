package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class l6 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer f154409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154410e;

    public l6(com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer bizProfileServiceInfoDrawer, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154409d = bizProfileServiceInfoDrawer;
        this.f154410e = contactWidgetTabBizInfo;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "onDrawerDetach called");
        this.f154409d.t(this);
        this.f154410e.f154210p1 = null;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        if (z17 || !z18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "onDrawerOpen, close");
        this.f154409d.t(this);
        this.f154410e.f154210p1 = null;
    }
}
