package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class b2 implements zy2.u9 {

    /* renamed from: b, reason: collision with root package name */
    public zy2.t9 f126009b;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f126008a = jz5.h.b(new com.tencent.mm.plugin.finder.service.a2(this));

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f126010c = new java.util.concurrent.ConcurrentHashMap();

    public void a(int i17, java.util.List feeds, int i18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(feeds, "feeds");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(feeds, 10));
        java.util.Iterator it = feeds.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 0);
            so2.u1 u1Var = new so2.u1(a17);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f126010c;
            java.lang.Long valueOf = java.lang.Long.valueOf(u1Var.getItemId());
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(a17.getMediaList());
            if (mb4Var == null || (str = mb4Var.getString(9)) == null) {
                str = "";
            }
            concurrentHashMap.put(valueOf, str);
            arrayList.add(new jz5.l(u1Var, u1Var.getFeedObject().getMediaList()));
        }
        jz5.l lVar = (jz5.l) kz5.n0.Z(arrayList);
        if (lVar != null) {
            ((com.tencent.mm.plugin.finder.service.y1) ((jz5.n) this.f126008a).getValue()).e(new ek4.b(1, -1, i17, 4, 0L, null, i18, 48, null), com.tencent.mm.plugin.finder.storage.FeedData.Companion.a((com.tencent.mm.plugin.finder.model.BaseFinderFeed) lVar.f302833d), kz5.n0.V0(arrayList), 0);
        }
    }
}
