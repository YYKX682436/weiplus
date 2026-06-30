package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class xd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(0);
        this.f124363d = finderProfileReplayLiveUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f124363d.getRlLayout().getRecyclerView();
        kotlin.jvm.internal.o.d(recyclerView);
        return recyclerView;
    }
}
