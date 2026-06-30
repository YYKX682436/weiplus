package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f134952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f134953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f134954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f134952d = ncVar;
        this.f134953e = baseFinderFeedLoader;
        this.f134954f = finderObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar = this.f134952d;
        if (!ncVar.f135298o.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f134953e;
            java.util.Iterator it = baseFinderFeedLoader.getDataList().iterator();
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f134954f;
                if (hasNext) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var = (so2.j5) next;
                    if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                        if (!baseFinderFeed.getHasExposed() && baseFinderFeed.getEnhanceFromFeedId() != 0 && baseFinderFeed.getEnhanceFromFeedId() != finderObject.getId()) {
                            arrayList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), j5Var));
                        }
                    }
                    i17 = i18;
                } else if (arrayList.size() != 0) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        jz5.l lVar = (jz5.l) it6.next();
                        baseFinderFeedLoader.getDataList().remove(((java.lang.Number) lVar.f302833d).intValue());
                        androidx.recyclerview.widget.RecyclerView recyclerView = ncVar.f135294h;
                        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyItemRemoved(((java.lang.Number) lVar.f302833d).intValue());
                        }
                    }
                    if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                        z17 = true;
                    } else {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                    if (z17) {
                        android.app.Activity context = ncVar.getContext();
                        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                        e4Var.f211776c = "产生了新的互动强化操作，删除 " + arrayList.size() + " 条删除旧的强化流Feed";
                        e4Var.c();
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar2 = this.f134952d;
                    java.util.Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        jz5.l lVar2 = (jz5.l) it7.next();
                        com.tencent.mm.plugin.finder.viewmodel.component.nc.R6(ncVar2, finderObject.getId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) lVar2.f302834e).getItemId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) lVar2.f302834e).getFeedObject().getFeedObject().getSessionBuffer());
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
