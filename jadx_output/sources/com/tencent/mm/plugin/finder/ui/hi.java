package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class hi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f129330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        super(0);
        this.f129330d = finderSettingsUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f129330d.findViewById(com.tencent.mm.R.id.f485491hv4);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        int i17 = com.tencent.mm.R.id.nup;
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) x4.b.a(findViewById, com.tencent.mm.R.id.nup);
        if (tabLayout != null) {
            i17 = com.tencent.mm.R.id.nuq;
            com.tencent.mm.view.HardTouchableLayout hardTouchableLayout = (com.tencent.mm.view.HardTouchableLayout) x4.b.a(findViewById, com.tencent.mm.R.id.nuq);
            if (hardTouchableLayout != null) {
                i17 = com.tencent.mm.R.id.f487570p16;
                com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) x4.b.a(findViewById, com.tencent.mm.R.id.f487570p16);
                if (finderViewPager != null) {
                    return new vb2.j(linearLayout, linearLayout, tabLayout, hardTouchableLayout, finderViewPager);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
