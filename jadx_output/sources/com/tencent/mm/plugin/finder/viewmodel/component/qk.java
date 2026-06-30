package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f135718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f135719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView f135720g;

    public qk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.widget.HorizontalScrollView horizontalScrollView, int i17, com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView) {
        this.f135717d = blVar;
        this.f135718e = horizontalScrollView;
        this.f135719f = i17;
        this.f135720g = finderEdgeTransparentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int selectedTabPosition;
        oa.i k17;
        zx2.u i17;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135717d;
        boolean z17 = blVar.f133895h;
        android.widget.HorizontalScrollView horizontalScrollView = this.f135718e;
        if (z17) {
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = horizontalScrollView instanceof com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout ? (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) horizontalScrollView : null;
            if (finderTabLayout == null) {
                return;
            }
            selectedTabPosition = finderTabLayout.getSelectedTabPosition();
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout2 = horizontalScrollView instanceof com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout ? (com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout) horizontalScrollView : null;
            if (finderTabLayout2 != null && (i17 = finderTabLayout2.i(selectedTabPosition)) != null) {
                i17.b();
            }
        } else {
            com.google.android.material.tabs.TabLayout tabLayout = horizontalScrollView instanceof com.google.android.material.tabs.TabLayout ? (com.google.android.material.tabs.TabLayout) horizontalScrollView : null;
            if (tabLayout == null) {
                return;
            }
            selectedTabPosition = tabLayout.getSelectedTabPosition();
            com.google.android.material.tabs.TabLayout tabLayout2 = horizontalScrollView instanceof com.google.android.material.tabs.TabLayout ? (com.google.android.material.tabs.TabLayout) horizontalScrollView : null;
            if (tabLayout2 != null && (k17 = tabLayout2.k(selectedTabPosition)) != null) {
                k17.b();
            }
        }
        int i18 = this.f135719f;
        if ((selectedTabPosition >= 0 && selectedTabPosition < i18) != false) {
            horizontalScrollView.scrollTo((int) (((selectedTabPosition + 1) / i18) * horizontalScrollView.getMeasuredWidth()), 0);
        }
        horizontalScrollView.setOnScrollChangeListener(new com.tencent.mm.plugin.finder.viewmodel.component.pk(blVar, this.f135720g, horizontalScrollView));
    }
}
