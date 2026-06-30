package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class nh implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f124016d;

    public nh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        this.f124016d = finderProfileTingAudioUIC;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(8460, this);
        if (m1Var instanceof db2.e6) {
            db2.e6 e6Var = (db2.e6) m1Var;
            java.lang.String str2 = e6Var.f227961g;
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC = this.f124016d;
            if (kotlin.jvm.internal.o.b(str2, finderProfileTingAudioUIC.S6()) && !finderProfileTingAudioUIC.getContext().isFinishing() && i17 == 0 && i18 == 0) {
                androidx.fragment.app.Fragment fragment = finderProfileTingAudioUIC.getFragment();
                kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment");
                ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment) fragment).f123478t = e6Var;
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.mh(finderProfileTingAudioUIC));
            }
        }
    }
}
