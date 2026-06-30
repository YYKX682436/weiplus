package wh2;

/* loaded from: classes2.dex */
public final class x extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader f445964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader) {
        super(finderProfileLiveUserPageLoader, false, 1, null);
        this.f445964a = finderProfileLiveUserPageLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        super.mergeRefresh(response, lVar);
        com.tencent.mm.plugin.finder.live.loader.FinderProfileLiveUserPageLoader finderProfileLiveUserPageLoader = this.f445964a;
        finderProfileLiveUserPageLoader.getDataList().clear();
        java.util.AbstractCollection dataList = finderProfileLiveUserPageLoader.getDataList();
        java.util.List incrementList = response.getIncrementList();
        dataList.addAll(incrementList != null ? kz5.n0.S0(incrementList) : new java.util.ArrayList());
        yz5.l lVar2 = finderProfileLiveUserPageLoader.f111698h;
        if (lVar2 != null) {
            lVar2.invoke(response);
        }
        finderProfileLiveUserPageLoader.f111698h = null;
    }
}
