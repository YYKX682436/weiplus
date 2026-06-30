package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class mg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f123989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ng f123990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC, com.tencent.mm.plugin.finder.profile.uic.ng ngVar) {
        super(0);
        this.f123989d = finderProfileTemplateUIC;
        this.f123990e = ngVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC = this.f123989d;
        androidx.fragment.app.Fragment fragment = finderProfileTemplateUIC.getFragment();
        if (!(fragment != null && fragment.isDetached())) {
            com.tencent.mars.xlog.Log.i("Finder.ProfileTemplateUIC", "[updateState] state=" + finderProfileTemplateUIC.R6().f106107e + " cachedState=" + finderProfileTemplateUIC.R6().f106108f);
            android.widget.FrameLayout frameLayout3 = finderProfileTemplateUIC.f123473t;
            if (frameLayout3 != null) {
                frameLayout3.setOnClickListener(null);
                frameLayout3.setVisibility(8);
            }
            if (finderProfileTemplateUIC.R6().f106108f == com.tencent.mm.plugin.finder.feed.bp.f106404e) {
                finderProfileTemplateUIC.Q6().setSuperNestedScroll(false);
                int ordinal = finderProfileTemplateUIC.R6().f106107e.ordinal();
                if (ordinal == 1) {
                    android.widget.FrameLayout frameLayout4 = finderProfileTemplateUIC.f123473t;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(0);
                        finderProfileTemplateUIC.S6().f434528e.setVisibility(8);
                        finderProfileTemplateUIC.S6().f434529f.setVisibility(8);
                        finderProfileTemplateUIC.S6().f434527d.setVisibility(0);
                    }
                } else if (ordinal == 2) {
                    android.widget.FrameLayout frameLayout5 = finderProfileTemplateUIC.f123473t;
                    if (frameLayout5 != null) {
                        frameLayout5.setVisibility(finderProfileTemplateUIC.isSelfFlag() ? 8 : 0);
                        finderProfileTemplateUIC.S6().f434528e.setVisibility(0);
                        finderProfileTemplateUIC.S6().f434529f.setVisibility(8);
                        finderProfileTemplateUIC.S6().f434527d.setVisibility(8);
                    }
                } else if (ordinal == 3 && (frameLayout2 = finderProfileTemplateUIC.f123473t) != null) {
                    frameLayout2.setVisibility(0);
                    finderProfileTemplateUIC.S6().f434528e.setVisibility(8);
                    finderProfileTemplateUIC.S6().f434529f.setVisibility(0);
                    finderProfileTemplateUIC.S6().f434527d.setVisibility(8);
                    frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.lg(finderProfileTemplateUIC, this.f123990e));
                }
            } else {
                finderProfileTemplateUIC.Q6().setSuperNestedScroll(true);
            }
            int ordinal2 = finderProfileTemplateUIC.R6().f106107e.ordinal();
            if (ordinal2 == 0 || ordinal2 == 2) {
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC.P6(finderProfileTemplateUIC);
            } else if (ordinal2 == 4 && (frameLayout = finderProfileTemplateUIC.f123473t) != null) {
                frameLayout.setVisibility(0);
                finderProfileTemplateUIC.S6().f434528e.setVisibility(8);
                finderProfileTemplateUIC.S6().f434529f.setVisibility(8);
                finderProfileTemplateUIC.S6().f434527d.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
