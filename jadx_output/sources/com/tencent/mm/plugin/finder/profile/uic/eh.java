package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class eh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        super(0);
        this.f123671d = finderProfileTingAudioUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC = this.f123671d;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = finderProfileTingAudioUIC.getRlLayout();
        kotlin.jvm.internal.o.f(rlLayout, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.profile.uic.dh(finderProfileTingAudioUIC, rlLayout);
    }
}
