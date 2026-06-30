package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class nd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(0);
        this.f124009d = finderProfileReplayLiveUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f124009d;
        java.lang.String username = finderProfileReplayLiveUIC.getUsername();
        kotlin.jvm.internal.o.d(username);
        return new com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader(username, xy2.c.e(finderProfileReplayLiveUIC.getContext()), true, finderProfileReplayLiveUIC.getContextObj());
    }
}
