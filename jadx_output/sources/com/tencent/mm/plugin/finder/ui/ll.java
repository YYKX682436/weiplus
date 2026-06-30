package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ll implements al5.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.MMFinderUI f129487a;

    public ll(com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI) {
        this.f129487a = mMFinderUI;
    }

    @Override // al5.e3
    public void a(int i17) {
        this.f129487a.a7(i17);
    }

    @Override // al5.e3
    public void b(int i17, int i18, int i19, int i27, float f17) {
        this.f129487a.Z6(i17, i18, i19, i27, f17);
    }

    @Override // al5.e3
    public void c() {
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = this.f129487a;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = mMFinderUI.getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.post(new com.tencent.mm.plugin.finder.ui.kl(swipeBackLayout, mMFinderUI));
        }
    }
}
