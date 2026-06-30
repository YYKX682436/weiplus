package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f134850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f134851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f134852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134853g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        super(0);
        this.f134850d = ncVar;
        this.f134851e = baseFinderFeedLoader;
        this.f134852f = finderObject;
        this.f134853g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar = this.f134850d;
        if (!ncVar.f135298o.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f134851e;
            java.util.Iterator it = baseFinderFeedLoader.getDataList().iterator();
            boolean z17 = false;
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) next;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (!baseFinderFeed.getHasExposed() && baseFinderFeed.getEnhanceFromFeedId() == this.f134852f.getId() && baseFinderFeed.getEnhanceFromEventType() == this.f134853g) {
                        arrayList.add(0, java.lang.Integer.valueOf(i17));
                    }
                }
                i17 = i18;
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                baseFinderFeedLoader.getDataList().remove(intValue);
                androidx.recyclerview.widget.RecyclerView recyclerView = ncVar.f135294h;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemRemoved(intValue);
                }
            }
            if (arrayList.size() != 0) {
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                    z17 = true;
                } else {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
                if (z17) {
                    android.app.Activity context = ncVar.getContext();
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = "由于取消互动操作，删除 " + arrayList.size() + " 条已被插入的未读强化流Feed";
                    e4Var.c();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
