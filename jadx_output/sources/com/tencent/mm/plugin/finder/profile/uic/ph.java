package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ph implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f124132d;

    public ph(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        this.f124132d = finderProfileTingAudioUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC = this.f124132d;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = finderProfileTingAudioUIC.f123483o;
        if (finderProfileTingAudioListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        finderProfileTingAudioListLoader.requestRefresh();
        gm0.j1.d().a(8460, new com.tencent.mm.plugin.finder.profile.uic.nh(finderProfileTingAudioUIC));
    }
}
