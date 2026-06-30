package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f124185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC) {
        super(1);
        this.f124185d = finderProfileReplayLiveUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        android.content.Intent it = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f124185d;
        com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader O6 = finderProfileReplayLiveUIC.O6();
        androidx.recyclerview.widget.RecyclerView recyclerView = finderProfileReplayLiveUIC.P6();
        O6.getClass();
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        O6.initBackCache(it);
        com.tencent.mm.plugin.finder.feed.model.r9 backCache = O6.getBackCache();
        if (backCache != null) {
            java.util.ArrayList arrayList = backCache.f108300a;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList) && (gVar = backCache.f108301b) != null && O6.getDataList().size() != arrayList.size()) {
                O6.getDataList().clear();
                O6.getDataList().addAll(arrayList);
                O6.setLastBuffer(gVar);
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
