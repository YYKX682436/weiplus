package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class kh implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123904a;

    public kh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        this.f123904a = finderProfileTingAudioUIC;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = this.f123904a.f123483o;
        if (finderProfileTingAudioListLoader != null) {
            return com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(finderProfileTingAudioListLoader, false, 1, null);
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }
}
