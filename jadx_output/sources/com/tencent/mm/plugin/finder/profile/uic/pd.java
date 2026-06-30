package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class pd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f124125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f124126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124127f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(android.content.Intent intent, long j17, com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(0);
        this.f124125d = intent;
        this.f124126e = j17;
        this.f124127f = finderProfileReplayLiveUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f124125d;
        intent.putExtra("CURRENT_FEED_ID", this.f124126e);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb.U7((c61.zb) c17, this.f124127f.getActivity(), this.f124125d, false, 4, null);
        return jz5.f0.f302826a;
    }
}
