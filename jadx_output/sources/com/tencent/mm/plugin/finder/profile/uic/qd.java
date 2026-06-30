package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class qd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(0);
        this.f124156d = finderProfileReplayLiveUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f124156d;
        return new com.tencent.mm.plugin.finder.profile.h(finderProfileReplayLiveUIC.getActivity(), finderProfileReplayLiveUIC.isSelfFlag(), 2, false, false);
    }
}
