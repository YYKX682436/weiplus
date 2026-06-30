package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ch extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dh f123598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC, com.tencent.mm.plugin.finder.profile.uic.dh dhVar) {
        super(0);
        this.f123597d = finderProfileTingAudioUIC;
        this.f123598e = dhVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        db2.e6 e6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateState] state=");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC = this.f123597d;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = finderProfileTingAudioUIC.f123483o;
        if (finderProfileTingAudioListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        sb6.append(finderProfileTingAudioListLoader.f107610i);
        sb6.append(" cachedState=");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader2 = finderProfileTingAudioUIC.f123483o;
        if (finderProfileTingAudioListLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        sb6.append(finderProfileTingAudioListLoader2.f107611m);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileTingAudioUIC", sb6.toString());
        android.widget.FrameLayout frameLayout = com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434682c;
        frameLayout.setOnClickListener(null);
        frameLayout.setVisibility(8);
        androidx.fragment.app.Fragment fragment = finderProfileTingAudioUIC.getFragment();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment finderProfileTingAudioFragment = fragment instanceof com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment ? (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment) fragment : null;
        if ((finderProfileTingAudioFragment == null || (e6Var = finderProfileTingAudioFragment.f123478t) == null || !e6Var.P()) ? false : true) {
            com.tencent.mars.xlog.Log.w("Finder.FinderProfileTingAudioUIC", "updateState empty audio list");
        } else {
            com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader3 = finderProfileTingAudioUIC.f123483o;
            if (finderProfileTingAudioListLoader3 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            if (finderProfileTingAudioListLoader3.f107611m == com.tencent.mm.plugin.finder.feed.model.y6.f108480e) {
                int ordinal = finderProfileTingAudioListLoader3.f107610i.ordinal();
                if (ordinal == 1) {
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434682c.setVisibility(0);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434681b.setVisibility(8);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434685f.setVisibility(8);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434683d.setVisibility(0);
                } else if (ordinal == 2) {
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434682c.setVisibility(0);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434681b.setVisibility(0);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434685f.setVisibility(8);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434683d.setVisibility(8);
                } else if (ordinal == 3) {
                    android.widget.FrameLayout frameLayout2 = com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434682c;
                    frameLayout2.setVisibility(0);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434681b.setVisibility(8);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434685f.setVisibility(0);
                    com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC.R6(finderProfileTingAudioUIC).f434683d.setVisibility(8);
                    frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.bh(finderProfileTingAudioUIC, this.f123598e));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
