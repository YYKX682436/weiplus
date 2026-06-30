package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader f129175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.ui.fav.p pVar, com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader) {
        super(1);
        this.f129174d = pVar;
        this.f129175e = finderGlobalFavLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse resp = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        int size = this.f129175e.getDataList().size();
        java.util.List incrementList = resp.getIncrementList();
        com.tencent.mm.plugin.finder.ui.fav.p pVar = this.f129174d;
        if (incrementList != null) {
            pVar.c().addAll(incrementList);
            androidx.recyclerview.widget.f2 adapter = pVar.f().d().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRangeInserted(size, incrementList.size());
            }
        }
        pVar.f().e().E(!resp.getHasMore());
        pVar.f().f();
        if (pVar.c().isEmpty()) {
            pVar.f().k();
        }
        return jz5.f0.f302826a;
    }
}
