package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d5 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f123611a;

    public d5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f123611a = finderProfileFeedUIC;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.profile.uic.k4 actionCallback;
        actionCallback = this.f123611a.getActionCallback();
        actionCallback.b();
    }
}
