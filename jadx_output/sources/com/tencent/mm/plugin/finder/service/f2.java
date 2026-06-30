package com.tencent.mm.plugin.finder.service;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f126050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(int i17, java.util.LinkedList linkedList) {
        super(1);
        this.f126049d = i17;
        this.f126050e = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed error commentScene:");
        sb6.append(this.f126049d);
        sb6.append(' ');
        java.util.LinkedList<r45.rv0> linkedList = this.f126050e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (r45.rv0 rv0Var : linkedList) {
            arrayList.add("objectId:" + rv0Var.getLong(0) + " exportId:" + rv0Var.getString(1));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.e("FinderFeedDetailService", sb6.toString());
        return jz5.f0.f302826a;
    }
}
